package commands;

public abstract class CommandWithElem extends Command{
    {
        this.haveElem = true;
    }

    protected CommandWithElem(String name) {
        super(name);
    }
}
