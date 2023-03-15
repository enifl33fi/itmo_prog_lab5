package commands;

import collection.InteractiveCollection;

import java.io.InputStreamReader;

/** Class using for executing show command.
 * @author Kirill Markov
 * @version 1.0*/
public class ShowCommand extends Command {
  /**
   * Constructs new ShowCommand object with current collection and set the description and
   * the name(as <b>show</b>)
   *
   * @param curCol current collection.
   */
  public ShowCommand(InteractiveCollection curCol) {
    super(curCol);
    this.description =
        "show : print all items of the collection as string output in the standard output";
    this.name = "show";
  }

  /**
   * Prints all elements of current collection to the standard output stream in string representation.
   * @param reader reader for files. Null if command was called from the console.
   */
  @Override
  public void execute(InputStreamReader reader) {
    this.curCol.show();
  }
}
