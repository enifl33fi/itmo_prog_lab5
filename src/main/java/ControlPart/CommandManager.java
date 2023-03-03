package ControlPart;

import commands.Command;

import java.util.HashMap;

public class CommandManager {
    public HashMap<String, Command> data = new HashMap<>();

    private static CommandManager commandManager;

    private CommandManager() {
    }

    public static CommandManager getInstance() {
        if (commandManager == null) {
            commandManager = new CommandManager();
        }
        return commandManager;
    }

    public void addComand(Command command) {
        this.data.put(command.getName(), command);
    }

    public void removeCommand(String key) {
        this.data.remove(key);
    }

    public Command getCommand(String key) {
        return this.data.get(key);
    }
}
