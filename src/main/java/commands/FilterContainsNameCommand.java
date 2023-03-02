package commands;

import ControlPart.GeneralVars;

import java.io.InputStreamReader;

public class FilterContainsNameCommand extends CommandWithArgs {
    private static FilterContainsNameCommand filterContainsNameCommand;

    private FilterContainsNameCommand(String name) {
        super(name);
    }

    public static FilterContainsNameCommand getInstance(){
        if (filterContainsNameCommand == null){
            filterContainsNameCommand = new FilterContainsNameCommand("filter_contains_name");
        }
        return filterContainsNameCommand;
    }
    @Override
    public void execute(String arg) {
        GeneralVars.curCol.filterContainsName(arg);
        System.out.println("filter_contains_name completed");
    }

    @Override
    public void executeFromScript(String arg, InputStreamReader reader){
        this.execute(arg);
    }
}
