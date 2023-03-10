package commands;

import ControlPart.GeneralVars;

import java.io.InputStreamReader;

public class HeadCommand extends CommandWithOutArgs {

    public HeadCommand(String name) {
        super(name);
        this.setDescription("head : display the first element in the collection");
    }

    @Override
    public void execute() {
        GeneralVars.curCol.head();
        System.out.println("head completed");
    }

    @Override
    public void executeFromScript(InputStreamReader reader) {
        this.execute();
    }
}
