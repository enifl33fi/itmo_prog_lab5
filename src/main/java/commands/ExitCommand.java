package commands;

import java.io.InputStreamReader;

public class ExitCommand extends CommandWithOutArgs {
    private static ExitCommand exitCommand;

    private ExitCommand(String name) {
        super(name);
    }

    public static ExitCommand getInstance(){
        if (exitCommand == null){
            exitCommand = new ExitCommand("exit");
        }
        return exitCommand;
    }
    @Override
    public void execute() {
        System.out.println("bye bye");
        System.exit(0);
    }

    @Override
    public void executeFromScript(InputStreamReader reader) {
        this.execute();
    }
}
