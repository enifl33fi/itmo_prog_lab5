package ControlPart;

import InputWorkers.CommandParser;
import exceptions.MaxRecursionDepthException;
import fileWorkers.ReaderFiles;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class ScriptExecutor {
  private final ReaderFiles reader = new ReaderFiles();
  private final CommandParser commandParser;
  private Stack<String> curExecutionFiles = new Stack<>();

  public ScriptExecutor(CommandManager commandManager) {
    this.commandParser = new CommandParser(commandManager);
  }

  public void execute(String fileName) {
    try {
      if (this.curExecutionFiles.search(fileName) != -1) {

        throw new MaxRecursionDepthException();
      }
      this.curExecutionFiles.push(fileName);
      try (InputStreamReader inputStream = new InputStreamReader(new FileInputStream(fileName))) {
        String line = this.reader.getLine(inputStream);
        while (line != null) {

          commandParser.parse(line, inputStream);
          line = this.reader.getLine(inputStream);
        }
      } catch (FileNotFoundException | SecurityException | NullPointerException e) {
        System.out.println(e.getMessage());
        System.out.println("Couldn't read given file.");
      } catch (IOException e) {
        System.out.println("Unexpected abortion. Some commands will be lost");
      }
      this.curExecutionFiles.pop();
    } catch (MaxRecursionDepthException e) {
      System.out.println(e.getMessage());
    }
  }
}
