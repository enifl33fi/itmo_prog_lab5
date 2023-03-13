package commands;

import collection.InteractiveCollection;
import fileWorkers.WriterCSV;

import java.io.InputStreamReader;

public class SaveCommand extends Command {

  private WriterCSV writerCSV = new WriterCSV();

  public SaveCommand(InteractiveCollection curCol) {
    super(curCol);
    this.description = "save : save the collection to a file";
    this.name = "save";
  }

  @Override
  public void execute() {

    this.writerCSV.save(this.curCol);
  }

  @Override
  public void executeFromScript(InputStreamReader reader) {
    this.execute();
  }
}
