package commands;

import java.io.InputStreamReader;

public class ExitCommand extends CommandWithOutArgs {

    public ExitCommand(String name) {
        super(name);
        this.setDescription("exit : end the program (without saving it to a file)");
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
