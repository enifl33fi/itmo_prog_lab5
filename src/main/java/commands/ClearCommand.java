package commands;

import collection.InteractiveCollection;

import java.io.InputStreamReader;

public class ClearCommand extends Command {

  public ClearCommand(InteractiveCollection curCol) {
    super(curCol);
    this.description = "clear : clear the collection";
    this.name = "clear";
  }

  @Override
  public void execute() {
    this.curCol.clear();
  }

  @Override
  public void executeFromScript(InputStreamReader reader) {
    this.execute();
  }
}
