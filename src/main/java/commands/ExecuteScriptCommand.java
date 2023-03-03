package commands;

import ControlPart.GeneralVars;
import exceptions.MaxRecursionDepthException;

import java.io.InputStreamReader;

public class ExecuteScriptCommand extends CommandWithArgs {
    private static ExecuteScriptCommand executeScriptCommand;

    private ExecuteScriptCommand(String name) {
        super(name);
    }

    public static ExecuteScriptCommand getInstance() {
        if (executeScriptCommand == null) {
            executeScriptCommand = new ExecuteScriptCommand("execute_script");
        }
        return executeScriptCommand;
    }

    @Override
    public void execute(String arg) {
        try {
            if (GeneralVars.curExecutionFiles.search(arg) != -1) {

                throw new MaxRecursionDepthException();
            }
            GeneralVars.SCRIPT_EXECUTOR.execute(arg);
        } catch (MaxRecursionDepthException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("execute_script completed");
    }

    @Override
    public void executeFromScript(String arg, InputStreamReader reader) {
        this.execute(arg);
    }
}
