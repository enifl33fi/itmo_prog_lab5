package commands;

import collection.InteractiveCollection;

import java.io.InputStreamReader;

public class InfoCommand extends Command {

  public InfoCommand(InteractiveCollection curCol) {
    super(curCol);
    this.description =
        "info : print information about the collection (type, initialization date, number of items, etc.) in the standard output.";
    this.name = "info";
  }

  @Override
  public void execute() {
    this.curCol.info();
  }

  @Override
  public void executeFromScript(InputStreamReader reader) {
    this.execute();
  }
}
