package collection;

import ControlPart.ElementValidator;
import ControlPart.GeneralVars;
import element.*;
import exceptions.IdCollapseException;
import exceptions.NotEnoughFieldsException;
import exceptions.NullFieldException;
import exceptions.WrongFieldException;
import fileWorkers.ReaderFiles;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.util.*;

public class CollectionGenerator {
    public void generateFromCSV(String fileName) {
        ReaderFiles reader = GeneralVars.READER_FILES;
        try (InputStreamReader inputStream = new InputStreamReader(new FileInputStream(fileName))) {
            String line = reader.getLine(inputStream);
            line = reader.getLine(inputStream);
            List<Long> ids = new ArrayList<>();
            ElementValidator elementValidator = new ElementValidator();
            int i = 0;
            while (line != null) {
                i++;
                String[] info = line.split(",", -1);
                try {
                    if (info.length != GeneralVars.VAR_COUNT) {
                        throw new NotEnoughFieldsException("line number " + i + " don't have enough fields");
                    }
                } catch (NotEnoughFieldsException e) {
                    System.out.println(e.getMessage());
                    System.out.println("The whole line number " + i + " will be lost. Sorry <(。_。)>");
                    continue;
                }
                try {
                    SpaceMarine spaceMarine = elementValidator.validateSpaceMarine(info[0], info[1], info[2], info[3], info[4], info[5], info[6], info[7], info[8], info[9], ids, info[10]);
                    GeneralVars.curCol.add(spaceMarine);
                    ids.add(spaceMarine.getId());

                } catch (ParseException e) {
                    System.out.println("Not correct pattern for data.\nCorrect pattern: EEE MMM dd kk:mm:ss z yyyy.");
                    System.out.println("The whole line number " + i + " will be lost. Sorry <(。_。)>");
                } catch (NumberFormatException e) {;
                    System.out.println("One of number-format fields was empty or string");
                    System.out.println("The whole line number " + i + " will be lost. Sorry <(。_。)>");
                } catch (WrongFieldException | NullFieldException | IdCollapseException e) {
                    System.out.println(e.getMessage());
                    System.out.println("The whole line number " + i + " will be lost. Sorry <(。_。)>");
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                    e.printStackTrace();
                    System.out.println("Unreachable block. Just in case.");
                }
                line = reader.getLine(inputStream);
            }
            GeneralVars.saveFileName = fileName;
            System.out.println("Collection reading completed.");
        } catch (SecurityException | IOException | NullPointerException e) {
            System.out.println(e.getMessage());
            System.out.println("Couldn't find given file. It's impossible to read");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
            System.out.println("Unreachable block. Just in case.");
        }

    }
}
