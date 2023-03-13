package commands;

import ControlPart.ScriptExecutor;
import collection.InteractiveCollection;

import java.io.InputStreamReader;

public class ExecuteScriptCommand extends Command {

  private final ScriptExecutor scriptExecutor;

  public ExecuteScriptCommand(InteractiveCollection curCol, ScriptExecutor scriptExecutor) {
    super(curCol);
    this.scriptExecutor = scriptExecutor;
    this.description =
        "execute_script file_name : read and execute a script from the specified file. The script contains commands in the same form as the user enters them in interactive mode.";
    this.name = "execute_script";
  }

  @Override
  public void execute(String arg) {
    this.scriptExecutor.execute(arg);
  }

  @Override
  public void executeFromScript(String arg, InputStreamReader reader) {
    this.execute(arg);
  }
}
