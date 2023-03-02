package commands;

public abstract class CommandWithArgs extends Command{
    {
        this.haveArgs = true;
    }

    protected CommandWithArgs(String name) {
        super(name);
    }

}
