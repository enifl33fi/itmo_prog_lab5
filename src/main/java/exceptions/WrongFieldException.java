package exceptions;

public class WrongFieldException extends RuntimeException{
    public WrongFieldException(String message){
        super(message);
    }
}
