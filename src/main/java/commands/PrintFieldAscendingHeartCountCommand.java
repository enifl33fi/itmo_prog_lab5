package commands;

import collection.InteractiveCollection;

import java.io.InputStreamReader;

public class PrintFieldAscendingHeartCountCommand extends Command {

  public PrintFieldAscendingHeartCountCommand(InteractiveCollection curCol) {
    super(curCol);
    this.description =
        "print_field_ascending_heart_count : print the heartCount values of all elements in ascending order";
    this.name = "print_field_ascending_heart_count";
  }

  @Override
  public void execute() {
    this.curCol.printFieldAscendingHeartCount();
  }

  @Override
  public void executeFromScript(InputStreamReader reader) {
    this.execute();
  }
}
