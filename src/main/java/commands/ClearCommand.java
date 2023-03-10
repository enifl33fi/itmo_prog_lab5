package commands;

import ControlPart.GeneralVars;

import java.io.InputStreamReader;

public class ClearCommand extends CommandWithOutArgs {

    public ClearCommand(String name) {
        super(name);
        this.setDescription("clear : clear the collection");
    }

    @Override
    public void execute() {
        GeneralVars.curCol.clear();
        System.out.println("clear completed");
    }

    @Override
    public void executeFromScript(InputStreamReader reader) {
        this.execute();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
