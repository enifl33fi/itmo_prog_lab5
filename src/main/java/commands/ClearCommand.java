package commands;

import ControlPart.GeneralVars;

import java.io.InputStreamReader;

public class ClearCommand extends CommandWithOutArgs {
    private static ClearCommand clearCommand;

    private ClearCommand(String name) {
        super(name);
    }

    public static ClearCommand getInstance() {
        if (clearCommand == null) {
            clearCommand = new ClearCommand("clear");
        }
        return clearCommand;
    }

    @Override
    public void execute() {
        GeneralVars.curCol.clear();
        System.out.println("clear completed");
    }

    @Override
    public void executeFromScript(InputStreamReader reader) {
        this.execute();
    }
}
