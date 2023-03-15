package controlPart;

import collection.InteractiveCollection;
import commands.*;

/**
 * Class using for loading commands to command manager.
 *
 * @author Kirill Markov
 * @version 1.0
 */
public class CommandLoader {
  /**
   * Current command manager. {@link controlPart.CommandManager}
   */
  private final CommandManager commandManager;
  /**
   * Current script executor. {@link controlPart.ScriptExecutor}
   */
  private final ScriptExecutor scriptExecutor;

  /**
   * Constructs a new CommandLoader object with specified command manager and script executor.
   * @param commandManager given command manager.
   */
  public CommandLoader(CommandManager commandManager) {
    this.commandManager = commandManager;
    this.scriptExecutor = new ScriptExecutor(commandManager);
  }

  /**
   * Load all commands to command manager.
   * @param curCol collection that commands are working with.
   */
  public void load(InteractiveCollection curCol) {
    Command addCommand = new AddCommand(curCol);
    Command clearCommand = new ClearCommand(curCol);
    Command countByCategoryCommand = new CountByCategoryCommand(curCol);
    Command executeScriptCommand = new ExecuteScriptCommand(curCol, scriptExecutor);
    Command exitCommand = new ExitCommand(curCol);
    Command filterContainsNameCommand = new FilterContainsNameCommand(curCol);
    Command headCommand = new HeadCommand(curCol);
    Command helpCommand = new HelpCommand(curCol, this.commandManager);
    Command infoCommand = new InfoCommand(curCol);
    Command printFieldAscendingHeartCountCommand = new PrintFieldAscendingHeartCountCommand(curCol);
    Command removeByIdCommand = new RemoveByIdCommand(curCol);
    Command removeFirstCommand = new RemoveFirstCommand(curCol);
    Command removeLowerCommand = new RemoveLowerCommand(curCol);
    Command saveCommand = new SaveCommand(curCol);
    Command showCommand = new ShowCommand(curCol);
    Command updateCommand = new UpdateCommand(curCol);

    this.commandManager.addComand(addCommand);
    this.commandManager.addComand(clearCommand);
    this.commandManager.addComand(countByCategoryCommand);
    this.commandManager.addComand(executeScriptCommand);
    this.commandManager.addComand(exitCommand);
    this.commandManager.addComand(filterContainsNameCommand);
    this.commandManager.addComand(headCommand);
    this.commandManager.addComand(helpCommand);
    this.commandManager.addComand(infoCommand);
    this.commandManager.addComand(printFieldAscendingHeartCountCommand);
    this.commandManager.addComand(removeByIdCommand);
    this.commandManager.addComand(removeFirstCommand);
    this.commandManager.addComand(removeLowerCommand);
    this.commandManager.addComand(saveCommand);
    this.commandManager.addComand(showCommand);
    this.commandManager.addComand(updateCommand);
  }
}
