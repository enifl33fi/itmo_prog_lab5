package commands;

import ControlPart.GeneralVars;

import java.io.InputStreamReader;

public class RemoveFirstCommand extends CommandWithOutArgs {
    private static RemoveFirstCommand removeFirstCommand;

    private RemoveFirstCommand(String name) {
        super(name);
    }

    public static RemoveFirstCommand getInstance() {
        if (removeFirstCommand == null) {
            removeFirstCommand = new RemoveFirstCommand("remove_first");
        }
        return removeFirstCommand;
    }

    @Override
    public void execute() {
        GeneralVars.curCol.removeFirst();
        System.out.println("remove_first completed");
    }

    @Override
    public void executeFromScript(InputStreamReader reader) {
        this.execute();
    }
}
