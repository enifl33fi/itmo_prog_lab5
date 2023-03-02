package exceptions;

public class WrongExecutedScriptException extends RuntimeException {
    private static final String msg = "The executable file is corrupted";

    public WrongExecutedScriptException(){
        super(msg);
    }
}
