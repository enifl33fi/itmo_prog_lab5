package controlPart;

import commands.Command;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Class that is managing current commands HashMap.
 *
 * @author Kirill Markov
 * @version 1.0
 */
public class CommandManager {
  /**
   * HashMap for storing commands.
   */
  private final HashMap<String, Command> data = new HashMap<>();
  /**
   * List for storing commands.
   */
  private final List<Command> commandList = new ArrayList<>();

  /**
   * Associates the specified value with the specified key in this map. If the map previously contained a mapping for the key, the old value is replaced.
   * @param command command to be associated with the specified key.
   */
  public void addComand(Command command) {
    this.data.put(command.getName(), command);
    this.commandList.add(command);
  }

  /**
   * Removes the mapping for the specified key from this map if present.
   * @param key key whose mapping is to be removed from the ma
   */
  public void removeCommand(String key) {
    this.data.remove(key);
  }

  /**
   * Returns the command to which the specified key is mapped, or null if this map contains no mapping
   * for the key.
   * @param key the key whose associated value is to be returned
   * @return the command to which the specified key is mapped, or null if this map contains no mapping for the key
   */
  public Command getCommand(String key) {
    return this.data.get(key);
  }

  /**
   * Prints all stored command description.
   */
  public void getCommandsDescr() {
    for (Command command : commandList) {
      System.out.println(command.getDescription());
    }
  }
}
