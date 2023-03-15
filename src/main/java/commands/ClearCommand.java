package commands;

import collection.InteractiveCollection;

import java.io.InputStreamReader;
/**
 * Class using for executing clear command.
 *
 * @author Kirill Markov
 * @version 1.0
 */
public class ClearCommand extends Command {
  /**
   * Constructs new ClearCommand object with current collection and set the description and the
   * name(as <b>clear</b>)
   *
   * @param curCol current collection.
   */
  public ClearCommand(InteractiveCollection curCol) {
    super(curCol);
    this.description = "clear : clear the collection";
    this.name = "clear";
  }

  /**
   * Removes all the elements from current collection.
   * @param reader reader for files. Null if command was called from the console.
   */
  @Override
  public void execute(InputStreamReader reader) {
    this.curCol.clear();
  }
}
