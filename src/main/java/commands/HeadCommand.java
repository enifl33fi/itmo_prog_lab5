package commands;

import collection.InteractiveCollection;

import java.io.InputStreamReader;

/** Class using for executing head command.
 * @author Kirill Markov
 * @version 1.0 */
public class HeadCommand extends Command {
  /**
   * Constructs new HeadCommand object with current collection and set the description and
   * the name(as <b>head</b>)
   * @param curCol current collection.
   */
  public HeadCommand(InteractiveCollection curCol) {
    super(curCol);
    this.description = "head : display the first element in the collection";
    this.name = "head";
  }

  /**
   * Remove all elements from the collection that are smaller than the given one.
   * @param reader reader for files. Null if command was called from the console.
   */
  @Override
  public void execute(InputStreamReader reader) {
    this.curCol.head();
  }
}
