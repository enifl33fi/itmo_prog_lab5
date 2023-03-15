package commands;

import collection.InteractiveCollection;
import exceptions.WrongCommandException;

import java.io.InputStreamReader;

/**
 * Abstract class that describes all commands.
 *
 * @author Kirill Markov
 * @version 1.0
 */
public abstract class Command {
  /**
   * Command name which is used to execute the command.
   */
  protected String name;
  /**
   * Description for the command.
   */
  protected String description = null;
  /**
   * Current collection {@link collection.InteractiveCollection}
   */
  protected InteractiveCollection curCol;

  /**
   * Constructs new Command object with current collection.
   * @param curCol current collection {@link collection.InteractiveCollection}
   */
  public Command(InteractiveCollection curCol) {
    this.curCol = curCol;
  }

  /**
   * Returns command name.
   * @return command name
   */
  public String getName() {
    return this.name;
  }

  /**
   * Set given name.
   * @param name given name.
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Execute command without arguments.
   * @param reader reader for files. Null if command was called from the console.
   * @throws exceptions.WrongCommandException if method are not implemented in child object
   */
  public void execute(InputStreamReader reader) {
    throw new WrongCommandException();
  }

  /**
   * Execute command with arguments.
   * @param arg given argument
   * @param reader reader for files. Null if command was called from the console.
   * @throws exceptions.WrongCommandException if method are not implemented in child object
   */
  public void execute(String arg, InputStreamReader reader) {
    throw new WrongCommandException();
  }

  /**
   * Returns description of the command.
   * @return description of the command
   */
  public String getDescription() {
    return description;
  }

  /**
   * Set description of the command.
   * @param description description of the command.
   */
  public void setDescription(String description) {
    this.description = description;
  }
}
