package commands;

import collection.InteractiveCollection;

import java.io.InputStreamReader;

public class ExitCommand extends Command {

  public ExitCommand(InteractiveCollection curCol) {
    super(curCol);
    this.description = "exit : end the program (without saving it to a file)";
    this.name = "exit";
  }

  @Override
  public void execute() {
    System.out.println("bye bye");
    System.exit(0);
  }

  @Override
  public void executeFromScript(InputStreamReader reader) {
    this.execute();
  }
}
