package inputWorkers;

import controlPart.GeneralVars;
import exceptions.NullSystemVariableException;

import java.util.Scanner;

/**
 * Class for getting work file if there is not required system variable.
 * @author Kirill Markov
 * @version 1.0
 */
public class WorkFileGetter {
  private final Scanner console = new Scanner(System.in);

  /**
   * Returns work file's name.
   * @return work file's name.
   */
  public String getWorkFile() {
    String fileName = System.getenv(GeneralVars.SYSTEM_VARIABLE);

    if (fileName == null) {
      System.out.println("Couldn't find the required system variable.");
      System.out.println("Do you want to insert the name of required file (y/n).");
      String answer = console.nextLine();
      if (answer.equals("y")) {
        System.out.println("Insert the name of required file:");
        fileName = console.nextLine();
      } else {
        throw new NullSystemVariableException();
      }
    }
    return fileName;
  }
}
