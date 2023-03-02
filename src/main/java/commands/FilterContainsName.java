package commands;

import ControlPart.GeneralVars;

import java.io.InputStreamReader;

public class FilterContainsName extends CommandWithArgs {
    private static FilterContainsName filterContainsName;

    private FilterContainsName(String name) {
        super(name);
    }

    public static FilterContainsName getInstance(){
        if (filterContainsName == null){
            filterContainsName = new FilterContainsName("filter_contains_name");
        }
        return filterContainsName;
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
