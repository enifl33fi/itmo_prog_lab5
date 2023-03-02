package commands;

import ControlPart.GeneralVars;
import element.AstartesCategory;

import java.io.InputStreamReader;
import java.util.Objects;

public class CountByCategoryCommand extends CommandWithArgs {
    private static CountByCategoryCommand countByCategoryCommand;

    private CountByCategoryCommand(String name) {
        super(name);
    }

    public static CountByCategoryCommand getInstance(){
        if (countByCategoryCommand == null){
            countByCategoryCommand = new CountByCategoryCommand("count_by_category");
        }
        return countByCategoryCommand;
    }
    @Override
    public void execute(String arg) {
        GeneralVars.curCol.countByCategory(AstartesCategory.valueOf(arg));
        System.out.println("count_by_category completed");

    }

    @Override
    public void executeFromScript(String arg, InputStreamReader reader){
        this.execute(arg);
    }
}
