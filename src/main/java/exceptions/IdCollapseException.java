package exceptions;

public class IdCollapseException extends RuntimeException{
    private static final String msg = "Some id collapsed";
    public IdCollapseException(){
        super(msg);
    }
}
