package commands;

import ControlPart.GeneralVars;
import element.AstartesCategory;

import java.io.InputStreamReader;

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
        AstartesCategory[] allCategoryValues = AstartesCategory.values();
        for (int i = 0; i < allCategoryValues.length; i++){
            System.out.printf("%d. %s%n", i + 1, allCategoryValues[i].toString());
        }
        GeneralVars.curCol.countByCategory(AstartesCategory.valueOf(arg));
        System.out.println("count_by_category completed");
    }

    @Override
    public void executeFromScript(String arg, InputStreamReader reader){
        this.execute(arg);
    }
}
