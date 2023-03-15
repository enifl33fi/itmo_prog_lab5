package commands;

import controlPart.ElementValidator;
import inputWorkers.ElementParser;
import collection.InteractiveCollection;
import fileWorkers.ReaderFiles;

import java.io.InputStreamReader;
/** Class using for executing update command.
 * @author Kirill Markov
 * @version 1.0*/
public class UpdateCommand extends Command {
  /** object that parses elements from console. {@link inputWorkers.ElementParser} */
  private final ElementParser elementParser = new ElementParser();
  /** object that validate element. {@link controlPart.ElementValidator} */
  private final ElementValidator elementValidator = new ElementValidator();
  /** reader for files. {@link fileWorkers.ReaderFiles} */
  private final ReaderFiles readerFiles = new ReaderFiles();

  /**
   * Constructs new UpdateCommand object with current collection and set the description and
   * the name(as <b>update</b>)
   *
   * @param curCol current collection.
   */
  public UpdateCommand(InteractiveCollection curCol) {
    super(curCol);
    this.description =
        "update id {element} : update the value of an element in the collection whose id is equal to the given one";
    this.name = "update";
  }

  /**
   * Updates the value of an element in current collection whose id is equal to the given one.
   * @param arg given id
   * @param reader reader for files. Null if command was called from the console.
   */
  @Override
  public void execute(String arg, InputStreamReader reader) {
    if (reader == null) {
      this.curCol.update(Long.parseLong(arg), this.elementParser.parseElement());
    }else {
      String[] spaceMarineParts = this.readerFiles.readElem(reader);
      this.curCol.update(
              Long.parseLong(arg), this.elementValidator.validateSpaceMarine(spaceMarineParts));
    }
  }
}
