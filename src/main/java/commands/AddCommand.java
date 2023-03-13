package commands;

import ControlPart.ElementValidator;
import ControlPart.GeneralVars;
import InputWorkers.ElementParser;
import collection.InteractiveCollection;
import fileWorkers.ReaderFiles;

import java.io.InputStreamReader;

public class AddCommand extends Command {

  private final ElementParser elementParser = new ElementParser();
  private final ElementValidator elementValidator = new ElementValidator();
  private final ReaderFiles reader = new ReaderFiles();

  public AddCommand(InteractiveCollection curCol) {
    super(curCol);
    this.description = "add {element} : add a new element to the collection";
    this.name = "add";
  }

  @Override
  public void execute() {
    this.curCol.add(this.elementParser.parseElement());
  }

  @Override
  public void executeFromScript(InputStreamReader reader) {
    String[] spaceMarineParts = new String[GeneralVars.VAR_COUNT - 2];
    for (int i = 0; i < GeneralVars.VAR_COUNT - 2; i++) {
      spaceMarineParts[i] = this.reader.getLine(reader);
    }
    this.curCol.add(this.elementValidator.validateSpaceMarine(spaceMarineParts));
  }
}
