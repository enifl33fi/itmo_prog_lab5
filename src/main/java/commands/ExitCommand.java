package commands;

import collection.InteractiveCollection;

import java.io.InputStreamReader;
/** Class using for executing exit command.
 * @author Kirill Markov
 * @version 1.0*/
public class ExitCommand extends Command {
  /**
   * Constructs new ExitCommand object with current collection and set the description and
   * the name(as <b>exit</b>)
   *
   * @param curCol current collection.
   */
  public ExitCommand(InteractiveCollection curCol) {
    super(curCol);
    this.description = "exit : end the program (without saving it to a file)";
    this.name = "exit";
  }

  /**
   * Finishes the program (without saving it to a file).
   * @param reader reader for files. Null if command was called from the console.
   */
  @Override
  public void execute(InputStreamReader reader) {
    System.out.println("bye bye");
    System.exit(0);
  }
}
