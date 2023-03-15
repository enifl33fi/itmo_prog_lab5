package controlPart;

import inputWorkers.CommandParser;
import exceptions.MaxRecursionDepthException;
import fileWorkers.ReaderFiles;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/**
 * Class that executes commands from script.
 * @author Kirill Markov
 * @version 1.0
 */
public class ScriptExecutor {
  /**
   * Reader for file.
   */
  private final ReaderFiles reader = new ReaderFiles();
  /**
   * Object for parsing commands.
   */
  private final CommandParser commandParser;
  /**
   * Stack for recursion check.
   */
  private final Stack<String> curExecutionFiles = new Stack<>();

  public ScriptExecutor(CommandManager commandManager) {
    this.commandParser = new CommandParser(commandManager);
  }

  /**
   * Executes commands from script.
   * @param fileName given file name.
   */
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
        System.out.println("Unexpected abortion. Some commands will be lost.");
      }
      this.curExecutionFiles.pop();
    } catch (MaxRecursionDepthException e) {
      System.out.println(e.getMessage());
    }
  }
}
