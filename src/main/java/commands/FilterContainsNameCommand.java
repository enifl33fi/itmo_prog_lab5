package commands;

import collection.InteractiveCollection;

import java.io.InputStreamReader;

public class FilterContainsNameCommand extends Command {

  public FilterContainsNameCommand(InteractiveCollection curCol) {
    super(curCol);
    this.description =
        "filter_contains_name name : output the elements whose name field value contains the specified substring";
    this.name = "filter_contains_name";
  }

  @Override
  public void execute(String arg) {
    this.curCol.filterContainsName(arg);
  }

  @Override
  public void executeFromScript(String arg, InputStreamReader reader) {
    this.execute(arg);
  }
}
