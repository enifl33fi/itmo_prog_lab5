package ControlPart;

import commands.*;

public class CommandLoader {
    private static final CommandManager commandManager = CommandManager.getInstance();

    public void load() {
        commandManager.addComand(AddCommand.getInstance());
        commandManager.addComand(ClearCommand.getInstance());
        commandManager.addComand(CountByCategoryCommand.getInstance());
        commandManager.addComand(ExecuteScriptCommand.getInstance());
        commandManager.addComand(ExitCommand.getInstance());
        commandManager.addComand(FilterContainsNameCommand.getInstance());
        commandManager.addComand(HeadCommand.getInstance());
        commandManager.addComand(HelpCommand.getInstance());
        commandManager.addComand(InfoCommand.getInstance());
        commandManager.addComand(PrintFieldAscendingHeartCountCommand.getInstance());
        commandManager.addComand(RemoveByIdCommand.getInstance());
        commandManager.addComand(RemoveFirstCommand.getInstance());
        commandManager.addComand(RemoveLowerCommand.getInstance());
        commandManager.addComand(SaveCommand.getInstance());
        commandManager.addComand(ShowCommand.getInstance());
        commandManager.addComand(UpdateCommand.getInstance());


    }
}
