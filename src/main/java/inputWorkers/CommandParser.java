package inputWorkers;

import controlPart.CommandManager;
import exceptions.NullFieldException;
import exceptions.WrongCommandException;
import exceptions.WrongFieldException;

import java.io.InputStreamReader;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 * Class for command parsing.
 * @author Kirill Markov
 * @version 1.0
 */
public class CommandParser {
  /**
   * Current command manager.{@link controlPart.CommandManager}
   */
  private final CommandManager commandManager;
  private static Scanner console = new Scanner(System.in);

  /**
   * Constructs a new CommandLoader object with specified command manager.
   * @param commandManager given command manager
   */
  public CommandParser(CommandManager commandManager) {
    this.commandManager = commandManager;
  }

  /**
   * Parses command from file line.
   * @param line given line
   * @param reader reader for file.
   */
  public void parse(String line, InputStreamReader reader) {
    try {
      String[] commandParts = line.split(" ");

      if (commandParts.length > 2) {
        throw new WrongCommandException();
      }

      try {
        commandManager.getCommand(commandParts[0]).execute(commandParts[1], reader);
      } catch (IndexOutOfBoundsException | WrongCommandException ignored) {
        if (commandParts.length == 2) {
          throw new WrongCommandException();
        }
      }
      if (commandParts.length != 2) {
        commandManager.getCommand(commandParts[0]).execute(reader);
      }
      System.out.println(commandParts[0] + " command completed successfully");
    } catch (NumberFormatException e) {
      System.out.println("One of number-format fields was empty or string");
    } catch (WrongFieldException | NullFieldException | WrongCommandException e) {
      System.out.println(e.getMessage());
    } catch (IllegalArgumentException e) {
      System.out.println(e.getMessage());
      System.out.println("Wrong argument");
    } catch (NullPointerException | IndexOutOfBoundsException e) {
      System.out.println("Unknown command");
    } catch (Exception e) {
      System.out.println(e.getMessage());
      e.printStackTrace();
      System.out.println("Unreachable block. Just in case.");
    }
  }
  /**
   * Parses command from console line.
   */
  public void parse() {
    try {
      this.parse(console.nextLine(), null);
    } catch (NoSuchElementException e) {
      System.out.println(e.getMessage());
      System.exit(0);
    } catch (IllegalStateException e) {
      System.out.println(e.getMessage());
      System.out.println("Idk how that happened. Never mind.");
      console = new Scanner(System.in);
    }
  }
}
