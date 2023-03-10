package commands;

import ControlPart.GeneralVars;

import java.io.InputStreamReader;

public class RemoveFirstCommand extends CommandWithOutArgs {

    public RemoveFirstCommand(String name) {
        super(name);
        this.setDescription("remove_first : remove the first item in the collection");
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
