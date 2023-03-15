package commands;

import collection.InteractiveCollection;
import fileWorkers.WriterCSV;

import java.io.InputStreamReader;
/** Class using for executing save command.
 * @author Kirill Markov
 * @version 1.0*/
public class SaveCommand extends Command {
  /**
   * Object for file writing.
   */
  private final WriterCSV writerCSV = new WriterCSV();

  /**
   * Constructs new SaveCommand object with current collection and set the description and
   * the name(as <b>save</b>)
   *
   * @param curCol current collection.
   */
  public SaveCommand(InteractiveCollection curCol) {
    super(curCol);
    this.description = "save : save the collection to a file";
    this.name = "save";
  }

  /**
   * Saves the collection to a file.
   * @param reader reader for files. Null if command was called from the console.
   */
  @Override
  public void execute(InputStreamReader reader) {

    this.writerCSV.save(this.curCol);
  }
}
