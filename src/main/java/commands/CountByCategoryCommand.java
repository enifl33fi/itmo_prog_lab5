package commands;

import collection.InteractiveCollection;
import element.AstartesCategory;

import java.io.InputStreamReader;
/**
 * Class using for executing count_by_category command.
 *
 * @author Kirill Markov
 * @version 1.0
 */
public class CountByCategoryCommand extends Command {
  /**
   * Constructs new CountByCategoryCommand object with current collection and set the description and the
   * name(as <b>count_by_category</b>)
   *
   * @param curCol current collection.
   */
  public CountByCategoryCommand(InteractiveCollection curCol) {
    super(curCol);
    this.description =
        "count_by_category category : output the number of elements with a category value equal to the given one";
    this.name = "count_by_category";
  }

  /**
   * Prints the elements whose name field value contains the specified substring.
   * @param arg given category
   * @param reader reader for files. Null if command was called from the console.
   */
  @Override
  public void execute(String arg, InputStreamReader reader) {
    this.curCol.countByCategory(AstartesCategory.valueOf(arg));
  }
}
