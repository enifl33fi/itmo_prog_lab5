package commands;

import collection.InteractiveCollection;

import java.io.InputStreamReader;

public class RemoveByIdCommand extends Command {

  public RemoveByIdCommand(InteractiveCollection curCol) {
    super(curCol);
    this.description = "remove_by_id id : remove an item from the collection by its id";
    this.name = "remove_by_id";
  }

  @Override
  public void execute(String arg) {
    this.curCol.removeById(Long.parseLong(arg));
  }

  @Override
  public void executeFromScript(String arg, InputStreamReader reader) {
    this.execute(arg);
  }
}
