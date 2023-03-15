package commands;

import collection.InteractiveCollection;

import java.io.InputStreamReader;
/** Class using for executing print_field_ascending_heart_count command.
 * @author Kirill Markov
 * @version 1.0*/
public class PrintFieldAscendingHeartCountCommand extends Command {
  /**
   * Constructs new PrintFieldAscendingHeartCountCommand object with current collection and set the description and
   * the name(as <b>print_field_ascending_heart_count</b>)
   *
   * @param curCol current collection.
   */
  public PrintFieldAscendingHeartCountCommand(InteractiveCollection curCol) {
    super(curCol);
    this.description =
        "print_field_ascending_heart_count : print the heartCount values of all elements in ascending order";
    this.name = "print_field_ascending_heart_count";
  }

  /**
   * Prints the heartCount values of all elements in ascending order.
   * @param reader reader for files. Null if command was called from the console.
   */
  @Override
  public void execute(InputStreamReader reader) {
    this.curCol.printFieldAscendingHeartCount();
  }
}
