package commands;

import ControlPart.GeneralVars;

import java.io.InputStreamReader;

public class ShowCommand extends CommandWithOutArgs {

    public ShowCommand(String name) {
        super(name);
        this.setDescription("show : print all items of the collection as string output in the standard output");
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