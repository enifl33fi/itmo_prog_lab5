package exceptions;

public class NullSystemVariableException extends RuntimeException {
  private static final String msg = "Couldn't work with required system variable.";

  public NullSystemVariableException() {
    super(msg);
  }
}
