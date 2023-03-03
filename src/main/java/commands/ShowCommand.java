package commands;

import ControlPart.GeneralVars;

import java.io.InputStreamReader;

public class ShowCommand extends CommandWithOutArgs {
    private static ShowCommand showCommand;

    private ShowCommand(String name) {
        super(name);
    }

    public static ShowCommand getInstance() {
        if (showCommand == null) {
            showCommand = new ShowCommand("show");
        }
        return showCommand;
    }

    @Override
    public void execute() {
        GeneralVars.curCol.show();
        System.out.println("show completed");
    }

    @Override
    public void executeFromScript(InputStreamReader reader) {
        this.execute();
    }
}