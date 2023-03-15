package exceptions;

/**
 * Thrown when required system variable is null.
 * @author Kirill Markov
 * @version 1.0
 */
public class NullSystemVariableException extends RuntimeException {
  /**
   * message for exception
   */
  private static final String msg = "Couldn't work with required system variable.";
  /**
   * Constructs new NullSystemVariableException with specified message.
   */
  public NullSystemVariableException() {
    super(msg);
  }
}
