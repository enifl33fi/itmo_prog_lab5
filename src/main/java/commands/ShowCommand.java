package commands;

import collection.InteractiveCollection;

import java.io.InputStreamReader;

public class ShowCommand extends Command {

  public ShowCommand(InteractiveCollection curCol) {
    super(curCol);
    this.description =
        "show : print all items of the collection as string output in the standard output";
    this.name = "show";
  }

  @Override
  public void execute() {
    this.curCol.show();
  }

  @Override
  public void executeFromScript(InputStreamReader reader) {
    this.execute();
  }
}
