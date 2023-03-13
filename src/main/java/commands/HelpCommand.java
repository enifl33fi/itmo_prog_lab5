package commands;

import ControlPart.CommandManager;
import collection.InteractiveCollection;

import java.io.InputStreamReader;

public class HelpCommand extends Command {
  private final CommandManager commandManager;

  public HelpCommand(InteractiveCollection curCol, CommandManager commandManager) {
    super(curCol);
    this.description = "help : print help for available commands";
    this.name = "help";
    this.commandManager = commandManager;
  }

  @Override
  public void execute() {
    this.commandManager.getCommandsDescr();
  }

  @Override
  public void executeFromScript(InputStreamReader reader) {
    this.execute();
  }
}
