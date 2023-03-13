package commands;

import collection.InteractiveCollection;

import java.io.InputStreamReader;

public class RemoveFirstCommand extends Command {

  public RemoveFirstCommand(InteractiveCollection curCol) {
    super(curCol);
    this.description = "remove_first : remove the first item in the collection";
    this.name = "remove_first";
  }

  @Override
  public void execute() {
    this.curCol.removeFirst();
  }

  @Override
  public void executeFromScript(InputStreamReader reader) {
    this.execute();
  }
}
