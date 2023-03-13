package ControlPart;

import collection.InteractiveCollection;
import commands.*;

public class CommandLoader {

  private final CommandManager commandManager;
  private final ScriptExecutor scriptExecutor;

  public CommandLoader(CommandManager commandManager) {
    this.commandManager = commandManager;
    this.scriptExecutor = new ScriptExecutor(commandManager);
  }

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
