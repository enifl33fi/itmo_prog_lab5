package commands;

import ControlPart.GeneralVars;

import java.io.InputStreamReader;

public class InfoCommand extends CommandWithOutArgs{
    private static InfoCommand infoCommand;

    private InfoCommand(String name) {
        super(name);
    }

    public static InfoCommand getInstance(){
        if (infoCommand == null){
            infoCommand = new InfoCommand("info");
        }
        return infoCommand;
    }
    @Override
    public void execute() {
        GeneralVars.curCol.info();
        System.out.println("info completed");
    }
    @Override
    public void executeFromScript(InputStreamReader reader) {
        this.execute();
    }
}
