package fileWorkers;

import ControlPart.GeneralVars;
import collection.InteractiveCollection;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class WriterCSV {
  public void save(InteractiveCollection curCol) {
    try (BufferedWriter writter =
        new BufferedWriter(new FileWriter(GeneralVars.saveFileName, false))) {
      List<String> saveLines = curCol.toStringList();
      writter.write(GeneralVars.HEADLINES + "\n");
      for (int i = 0; i < saveLines.size(); i++) {
        writter.write(saveLines.get(i) + "\n");
      }
    } catch (FileNotFoundException | SecurityException | NullPointerException e) {
      System.out.println(e.getMessage());
      System.out.println("Couldn't find given file. It's impossible to save.");
    } catch (IOException e) {
      System.out.println(e.getMessage());
      System.out.println("Some content might be lost.");
    } catch (Exception e) {
      System.out.println(e.getMessage());
      e.printStackTrace();
      System.out.println("Unreachable block. Just in case.");
    }
  }
}
