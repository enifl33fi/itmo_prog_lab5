package commands;

import ControlPart.GeneralVars;

import java.io.InputStreamReader;

public class RemoveByIdCommand extends CommandWithArgs {

    public RemoveByIdCommand(String name) {
        super(name);
        this.setDescription("remove_by_id id : remove an item from the collection by its id");
    }


    @Override
    public void execute(String arg) {
        GeneralVars.curCol.removeById(Long.parseLong(arg));
        System.out.println("remove_by_id completed");
    }

    @Override
    public void executeFromScript(String arg, InputStreamReader reader) {
        this.execute(arg);
    }
}
