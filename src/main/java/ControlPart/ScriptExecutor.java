package ControlPart;

import InputWorkers.CommandParser;
import fileWorkers.ReaderFiles;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class ScriptExecutor {
    public static final ReaderFiles reader = new ReaderFiles();
    public void execute(String fileName){
        GeneralVars.curExecutionFiles.push(fileName);
        CommandParser commandParser = new CommandParser();
        try(InputStreamReader inputStream = new InputStreamReader(new FileInputStream(fileName))) {
            String line = reader.getLine(inputStream);
            while (line != null){

                commandParser.parseFromScript(line, inputStream);
                line = reader.getLine(inputStream);
            }
            GeneralVars.curExecutionFiles.pop();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
            System.out.println("Couldn't find given file. It's impossible to read");
        } catch (IOException e) {
            System.out.println("Unexpected abortion. Some commands will be lost");
        }
    }
}
