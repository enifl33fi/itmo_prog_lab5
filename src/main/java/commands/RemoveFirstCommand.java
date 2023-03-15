package commands;

import collection.InteractiveCollection;

import java.io.InputStreamReader;
/** Class using for executing remove_first command.
 * @author Kirill Markov
 * @version 1.0*/
public class RemoveFirstCommand extends Command {
  /**
   * Constructs new RemoveFirstCommand object with current collection and set the description and
   * the name(as <b>remove_first</b>)
   *
   * @param curCol current collection.
   */
  public RemoveFirstCommand(InteractiveCollection curCol) {
    super(curCol);
    this.description = "remove_first : remove the first item in the collection";
    this.name = "remove_first";
  }

  /**
   * Removes the first element from current collection.
   * @param reader reader for files. Null if command was called from the console.
   */
  @Override
  public void execute(InputStreamReader reader) {
    this.curCol.removeFirst();
  }
}
