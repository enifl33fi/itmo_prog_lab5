package commands;

import controlPart.ElementValidator;
import inputWorkers.ElementParser;
import collection.InteractiveCollection;
import fileWorkers.ReaderFiles;

import java.io.InputStreamReader;

/**
 * Class using for executing add command.
 *
 * @author Kirill Markov
 * @version 1.0
 */
public class AddCommand extends Command {
  /** object that parses elements from console. {@link inputWorkers.ElementParser} */
  private final ElementParser elementParser = new ElementParser();
  /** object that validate element. {@link controlPart.ElementValidator} */
  private final ElementValidator elementValidator = new ElementValidator();
  /** reader for files. {@link fileWorkers.ReaderFiles} */
  private final ReaderFiles readerFiles = new ReaderFiles();

  /**
   * Constructs new AddCommand object with current collection and set the description and the
   * name(as <b>add</b>)
   *
   * @param curCol  current collection.
   */
  public AddCommand(InteractiveCollection curCol) {
    super(curCol);
    this.description = "add {element} : add a new element to the collection";
    this.name = "add";
  }

  /**
   * Appends the specified element to the end of current collection.
   * @param reader  reader for files. Null if command was called from the console.
   */
  @Override
  public void execute(InputStreamReader reader) {
    if (reader == null) {
      this.curCol.add(this.elementParser.parseElement());
    } else {
      String[] spaceMarineParts = this.readerFiles.readElem(reader);
      this.curCol.add(this.elementValidator.validateSpaceMarine(spaceMarineParts));
    }
  }
}
