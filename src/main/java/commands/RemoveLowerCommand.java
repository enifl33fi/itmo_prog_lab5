package commands;

import controlPart.ElementValidator;
import inputWorkers.ElementParser;
import collection.InteractiveCollection;
import fileWorkers.ReaderFiles;

import java.io.InputStreamReader;
/** Class using for executing remove_lower command.
 * @author Kirill Markov
 * @version 1.0*/
public class RemoveLowerCommand extends Command {
  /** object that parses elements from console. {@link inputWorkers.ElementParser} */
  private final ElementParser elementParser = new ElementParser();
  /** object that validate element. {@link controlPart.ElementValidator} */
  private final ElementValidator elementValidator = new ElementValidator();
  /** reader for files. {@link fileWorkers.ReaderFiles} */
  private final ReaderFiles readerFiles = new ReaderFiles();

  /**
   * Constructs new RemoveLowerCommand object with current collection and set the description and
   * the name(as <b>remove_lower</b>)
   *
   * @param curCol current collection.
   */
  public RemoveLowerCommand(InteractiveCollection curCol) {
    super(curCol);
    this.description =
        "remove_lower {element} : remove all elements from the collection that are smaller than the given one";
    this.name = "remove_lower";
  }

  /**
   * Remove all elements from current collection that are smaller than the given one.
   * @param reader reader for files. Null if command was called from the console.
   */
  @Override
  public void execute(InputStreamReader reader) {
    if (reader == null){
      this.curCol.removeLower(this.elementParser.parseElement());
    }
    else {
      String[] spaceMarineParts = this.readerFiles.readElem(reader);
      this.curCol.removeLower(this.elementValidator.validateSpaceMarine(spaceMarineParts));
    }
  }

}
