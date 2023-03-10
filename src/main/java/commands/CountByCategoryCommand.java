package commands;

import ControlPart.GeneralVars;
import element.AstartesCategory;

import java.io.InputStreamReader;
import java.util.Objects;

public class CountByCategoryCommand extends CommandWithArgs {

    public CountByCategoryCommand(String name) {
        super(name);
        this.setDescription("count_by_category category : output the number of elements with a category value equal to the given one");
    }


    @Override
    public void execute(String arg) {
        GeneralVars.curCol.countByCategory(AstartesCategory.valueOf(arg));
        System.out.println("count_by_category completed");

    }

    @Override
    public void executeFromScript(String arg, InputStreamReader reader) {
        this.execute(arg);
    }
}
