package commands;

import collection.InteractiveCollection;
import exceptions.WrongCommandException;

import java.io.InputStreamReader;

public abstract class Command {
  protected String name;
  protected String description = null;

  protected InteractiveCollection curCol;

  public Command(InteractiveCollection curCol) {
    this.curCol = curCol;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void execute() {
    throw new WrongCommandException();
  }

  public void execute(String arg) {
    throw new WrongCommandException();
  }

  public void executeFromScript(InputStreamReader reader) {
    throw new WrongCommandException();
  }

  public void executeFromScript(String arg, InputStreamReader reader) {
    throw new WrongCommandException();
  }

  public void executeFromScript() {
    this.executeFromScript((InputStreamReader) null);
  }

  public void executeFromScript(String arg) {
    this.executeFromScript(arg, null);
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }
}
