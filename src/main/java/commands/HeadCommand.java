package commands;

import ControlPart.GeneralVars;

import java.io.InputStreamReader;

public class HeadCommand extends CommandWithOutArgs {
    private static HeadCommand headCommand;

    private HeadCommand(String name) {
        super(name);
    }

    public static HeadCommand getInstance(){
        if (headCommand == null){
            headCommand = new HeadCommand("head");
        }
        return headCommand;
    }

    @Override
    public void execute() {
        GeneralVars.curCol.head();
        System.out.println("head completed");
    }

    @Override
    public void executeFromScript(InputStreamReader reader) {
        this.execute();
    }
}
