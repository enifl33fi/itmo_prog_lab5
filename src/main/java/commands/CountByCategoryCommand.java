package commands;

import collection.InteractiveCollection;
import element.AstartesCategory;

import java.io.InputStreamReader;

public class CountByCategoryCommand extends Command {

  public CountByCategoryCommand(InteractiveCollection curCol) {
    super(curCol);
    this.description =
        "count_by_category category : output the number of elements with a category value equal to the given one";
    this.name = "count_by_category";
  }

  @Override
  public void execute(String arg) {
    this.curCol.countByCategory(AstartesCategory.valueOf(arg));
  }

  @Override
  public void executeFromScript(String arg, InputStreamReader reader) {
    this.execute(arg);
  }
}
