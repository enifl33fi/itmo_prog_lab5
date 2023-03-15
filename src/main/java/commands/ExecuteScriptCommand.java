package commands;

import controlPart.ScriptExecutor;
import collection.InteractiveCollection;

import java.io.InputStreamReader;

/**
 * Class using for executing execute_script command.
 *
 * @author Kirill Markov
 * @version 1.0
 */
public class ExecuteScriptCommand extends Command {
  /** Object that executes script. {@link controlPart.ScriptExecutor} */
  private final ScriptExecutor scriptExecutor;
  /**
   * Constructs new ExecuteScriptCommand object with current collection and set the description and
   * the name(as <b>execute_script</b>)
   *
   * @param curCol current collection.
   * @param scriptExecutor object that executes script
   */
  public ExecuteScriptCommand(InteractiveCollection curCol, ScriptExecutor scriptExecutor) {
    super(curCol);
    this.scriptExecutor = scriptExecutor;
    this.description =
        "execute_script file_name : read and execute a script from the specified file. The script contains commands in the same form as the user enters them in interactive mode.";
    this.name = "execute_script";
  }
  /**
   * Reads and executes a script from the specified file. The script contains commands in the same
   * form as the user enters them in interactive mode.
   *
   * @param arg given file name
   * @param reader reader for files. Null if command was called from the console.
   */
  @Override
  public void execute(String arg, InputStreamReader reader) {
    this.scriptExecutor.execute(arg);
  }
}
