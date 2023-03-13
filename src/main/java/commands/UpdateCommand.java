package commands;

import ControlPart.ElementValidator;
import ControlPart.GeneralVars;
import InputWorkers.ElementParser;
import collection.InteractiveCollection;
import fileWorkers.ReaderFiles;

import java.io.InputStreamReader;

public class UpdateCommand extends Command {
  private final ElementParser elementParser = new ElementParser();
  private final ElementValidator elementValidator = new ElementValidator();
  private final ReaderFiles reader = new ReaderFiles();

  public UpdateCommand(InteractiveCollection curCol) {
    super(curCol);
    this.description =
        "update id {element} : update the value of an element in the collection whose id is equal to the given one";
    this.name = "update";
  }

  @Override
  public void execute(String arg) {
    this.curCol.update(Long.parseLong(arg), this.elementParser.parseElement());
  }

  @Override
  public void executeFromScript(String arg, InputStreamReader reader) {
    String[] spaceMarineParts = new String[GeneralVars.VAR_COUNT - 2];
    for (int i = 0; i < GeneralVars.VAR_COUNT - 2; i++) {
      spaceMarineParts[i] = this.reader.getLine(reader);
    }
    this.curCol.update(
        Long.parseLong(arg), this.elementValidator.validateSpaceMarine(spaceMarineParts));
  }
}
