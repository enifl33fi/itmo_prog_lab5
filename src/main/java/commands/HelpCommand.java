package commands;

import controlPart.CommandManager;
import collection.InteractiveCollection;

import java.io.InputStreamReader;

/** Class using for executing help command.
 * @author Kirill Markov
 * @version 1.0*/
public class HelpCommand extends Command {
  /**
   * Object what stores information about current commands.
   */
  private final CommandManager commandManager;

  /**
   * Constructs new HelpCommand object with current collection and set the description and
   * the name(as <b>help</b>)
   * @param curCol current collection.
   * @param commandManager - object what stores information about current commands
   */
  public HelpCommand(InteractiveCollection curCol, CommandManager commandManager) {
    super(curCol);
    this.description = "help : print help for available commands";
    this.name = "help";
    this.commandManager = commandManager;
  }

  /**
   * Prints help for available commands.
   * @param reader reader for files. Null if command was called from the console.
   */
  @Override
  public void execute(InputStreamReader reader) {
    this.commandManager.getCommandsDescr();
  }
}
