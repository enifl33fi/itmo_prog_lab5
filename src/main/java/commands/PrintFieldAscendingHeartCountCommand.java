package commands;

import ControlPart.GeneralVars;

import java.io.InputStreamReader;

public class PrintFieldAscendingHeartCountCommand extends CommandWithOutArgs {

    public PrintFieldAscendingHeartCountCommand(String name) {
        super(name);
        this.setDescription("print_field_ascending_heart_count : print the heartCount values of all elements in ascending order");
    }


    @Override
    public void execute() {
        GeneralVars.curCol.printFieldAscendingHeartCount();
        System.out.println("print_field_ascending_heart_count completed");
    }

    @Override
    public void executeFromScript(InputStreamReader reader) {
        this.execute();
    }
}
