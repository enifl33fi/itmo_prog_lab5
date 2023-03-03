package commands;

import exceptions.WrongCommandException;

import java.io.InputStreamReader;

public abstract class Command {
    private final String name;
    protected boolean haveArgs;
    protected boolean haveElem;

    protected Command(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void execute() {
        throw new WrongCommandException();
    }

    public void execute(String arg) {
        throw new WrongCommandException();
    }

    public void executeFromScript(InputStreamReader reader) {
        throw new WrongCommandException();
    }

    public void executeFromScript(String arg, InputStreamReader reader) {
        throw new WrongCommandException();
    }

    public void executeFromScript() {
        this.executeFromScript((InputStreamReader) null);
    }

    public void executeFromScript(String arg) {
        this.executeFromScript(arg, null);
    }


}
