package exceptions;

public class NotEnoughFieldsException extends RuntimeException {
    public NotEnoughFieldsException(String message) {
        super(message);
    }
}
