package exceptions;

public class NullFieldException extends RuntimeException {
  private static final String msg = " field cannot be null. The string cannot be empty.";

  public NullFieldException(String field) {
    super(field + msg);
  }
}
