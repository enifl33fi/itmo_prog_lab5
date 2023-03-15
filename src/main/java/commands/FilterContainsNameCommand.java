package commands;

import collection.InteractiveCollection;

import java.io.InputStreamReader;

/** Class using for filter_contains_name command.
 * @author Kirill Markov
 * @version 1.0*/
public class FilterContainsNameCommand extends Command {
  /**
   * Constructs new FilterContainsNameCommand object with current collection and set the description and
   * the name(as <b>filter_contains_name</b>)
   * @param curCol current collection.
   */
  public FilterContainsNameCommand(InteractiveCollection curCol) {
    super(curCol);
    this.description =
        "filter_contains_name name : output the elements whose name field value contains the specified substring";
    this.name = "filter_contains_name";
  }

  /**
   * Prints the elements whose name field value contains the specified substring.
   * @param arg given substring
   * @param reader reader for files. Null if command was called from the console.
   */
  @Override
  public void execute(String arg, InputStreamReader reader) {
    this.curCol.filterContainsName(arg);
  }
}
