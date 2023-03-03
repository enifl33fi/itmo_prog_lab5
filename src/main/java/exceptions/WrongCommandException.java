package exceptions;

public class WrongCommandException extends RuntimeException {
    private static final String msg = "Unknown command";

    public WrongCommandException() {
        super(msg);
    }

}
