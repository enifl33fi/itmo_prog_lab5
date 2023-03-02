package commands;

import ControlPart.GeneralVars;

import java.io.InputStreamReader;

public class PrintFieldAscendingHeartCountCommand extends CommandWithOutArgs {
    private static PrintFieldAscendingHeartCountCommand printFieldAscendingHeartCountCommand;

    private PrintFieldAscendingHeartCountCommand(String name) {
        super(name);
    }

    public static PrintFieldAscendingHeartCountCommand getInstance(){
        if (printFieldAscendingHeartCountCommand == null){
            printFieldAscendingHeartCountCommand = new PrintFieldAscendingHeartCountCommand("print_field_ascending_heart_count");
        }
        return printFieldAscendingHeartCountCommand;
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
