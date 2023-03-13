package commands;

import ControlPart.ElementValidator;
import ControlPart.GeneralVars;
import InputWorkers.ElementParser;
import collection.InteractiveCollection;
import fileWorkers.ReaderFiles;

import java.io.InputStreamReader;

public class RemoveLowerCommand extends Command {
  private final ElementParser elementParser = new ElementParser();
  private final ElementValidator elementValidator = new ElementValidator();
  private final ReaderFiles reader = new ReaderFiles();

  public RemoveLowerCommand(InteractiveCollection curCol) {
    super(curCol);
    this.description =
        "remove_lower {element} : remove all elements from the collection that are smaller than the given one";
    this.name = "remove_lower";
  }

  @Override
  public void execute() {
    this.curCol.removeLower(this.elementParser.parseElement());
  }

  @Override
  public void executeFromScript(InputStreamReader reader) {
    String[] spaceMarineParts = new String[GeneralVars.VAR_COUNT - 2];
    for (int i = 0; i < GeneralVars.VAR_COUNT - 2; i++) {
      spaceMarineParts[i] = this.reader.getLine(reader);
    }
    this.curCol.removeLower(this.elementValidator.validateSpaceMarine(spaceMarineParts));
  }
}
