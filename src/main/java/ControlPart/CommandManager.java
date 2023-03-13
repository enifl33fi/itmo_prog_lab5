package ControlPart;

import commands.Command;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CommandManager {
  private final HashMap<String, Command> data = new HashMap<>();
  private final List<Command> commandList = new ArrayList<>();

  public void addComand(Command command) {
    this.data.put(command.getName(), command);
    this.commandList.add(command);
  }

  public void removeCommand(String key) {
    this.data.remove(key);
  }

  public Command getCommand(String key) {
    return this.data.get(key);
  }

  public void getCommandsDescr() {
    for (Command command : commandList) {
      System.out.println(command.getDescription());
    }
  }
}
