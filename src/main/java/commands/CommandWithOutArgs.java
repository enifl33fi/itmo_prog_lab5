package commands;

public abstract class CommandWithOutArgs extends Command{
    {
        this.haveArgs = false;
    }

    protected CommandWithOutArgs(String name) {
        super(name);
    }
}
