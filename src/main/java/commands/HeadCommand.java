package commands;

import collection.InteractiveCollection;

import java.io.InputStreamReader;

public class HeadCommand extends Command {

  public HeadCommand(InteractiveCollection curCol) {
    super(curCol);
    this.description = "head : display the first element in the collection";
    this.name = "head";
  }

  @Override
  public void execute() {
    this.curCol.head();
  }

  @Override
  public void executeFromScript(InputStreamReader reader) {
    this.execute();
  }
}
