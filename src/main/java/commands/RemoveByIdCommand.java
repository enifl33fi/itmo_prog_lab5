package commands;

import collection.InteractiveCollection;

import java.io.InputStreamReader;

/** Class using for executing remove_by_id command.
 * @author Kirill Markov
 * @version 1.0*/
public class RemoveByIdCommand extends Command {
  /**
   * Constructs new RemoveByIdCommand object with current collection and set the description and
   * the name(as <b>remove_by_id</b>)
   *
   * @param curCol current collection.
   */
  public RemoveByIdCommand(InteractiveCollection curCol) {
    super(curCol);
    this.description = "remove_by_id id : remove an item from the collection by its id";
    this.name = "remove_by_id";
  }

  /**
   * Removes the element at the specified position in current collection.
   * @param arg given id
   * @param reader reader for files. Null if command was called from the console.
   */
  @Override
  public void execute(String arg, InputStreamReader reader) {
    this.curCol.removeById(Long.parseLong(arg));
  }
}
