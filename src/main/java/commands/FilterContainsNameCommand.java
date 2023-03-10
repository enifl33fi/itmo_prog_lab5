package commands;

import ControlPart.GeneralVars;

import java.io.InputStreamReader;

public class FilterContainsNameCommand extends CommandWithArgs {

    public FilterContainsNameCommand(String name) {
        super(name);
        this.setDescription("filter_contains_name name : output the elements whose name field value contains the specified substring");
    }


    @Override
    public void execute(String arg) {
        GeneralVars.curCol.filterContainsName(arg);
        System.out.println("filter_contains_name completed");
    }

    @Override
    public void executeFromScript(String arg, InputStreamReader reader) {
        this.execute(arg);
    }
}
