package commands;

import ControlPart.GeneralVars;

import java.io.InputStreamReader;

public class RemoveByIdCommand extends CommandWithArgs {
    private static RemoveByIdCommand removeByIdCommand;

    private RemoveByIdCommand(String name) {
        super(name);
    }

    public static RemoveByIdCommand getInstance(){
        if (removeByIdCommand == null){
            removeByIdCommand = new RemoveByIdCommand("remove_by_id");
        }
        return removeByIdCommand;
    }
    @Override
    public void execute(String arg) {
        GeneralVars.curCol.removeById(Long.parseLong(arg));
        System.out.println("remove_by_id completed");
    }

    @Override
    public void executeFromScript(String arg, InputStreamReader reader){
        this.execute(arg);
    }
}
