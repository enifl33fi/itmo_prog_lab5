package commands;

import collection.InteractiveCollection;

import java.io.InputStreamReader;

/** Class using for executing info command.
 * @author Kirill Markov
 * @version 1.0*/
public class InfoCommand extends Command {
  /**
   * Constructs new InfoCommand object with current collection and set the description and
   * the name(as <b>info</b>)
   *
   * @param curCol current collection.
   */
  public InfoCommand(InteractiveCollection curCol) {
    super(curCol);
    this.description =
        "info : print information about the collection (type, initialization date, number of items, etc.) in the standard output.";
    this.name = "info";
  }

  /**
   * Prints information about current collection.
   * Such as initialization date, size etc.
   *
   * @param reader reader for files. Null if command was called from the console.
   */
  @Override
  public void execute(InputStreamReader reader) {
    this.curCol.info();
  }
}
