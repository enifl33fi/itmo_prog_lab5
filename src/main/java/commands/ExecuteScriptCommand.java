package commands;

import ControlPart.GeneralVars;
import exceptions.MaxRecursionDepthException;

import java.io.InputStreamReader;

public class ExecuteScriptCommand extends CommandWithArgs {

    public ExecuteScriptCommand(String name) {
        super(name);
        this.setDescription("execute_script file_name : read and execute a script from the specified file. The script contains commands in the same form as the user enters them in interactive mode.");
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
