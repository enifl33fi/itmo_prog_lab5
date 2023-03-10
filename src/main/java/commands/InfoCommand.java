package commands;

import ControlPart.GeneralVars;

import java.io.InputStreamReader;

public class InfoCommand extends CommandWithOutArgs {

    public InfoCommand(String name) {
        super(name);
        this.setDescription("info : print information about the collection (type, initialization date, number of items, etc.) in the standard output.");
    }


    @Override
    public void execute() {
        GeneralVars.curCol.info();
        System.out.println("info completed");
    }

    @Override
    public void executeFromScript(InputStreamReader reader) {
        this.execute();
    }
}
