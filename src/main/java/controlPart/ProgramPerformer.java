package controlPart;

import inputWorkers.CommandParser;

/**
 * Class that keeps interactive mode.
 * @author Kirill Markov
 * @version 1.0
 */
public class ProgramPerformer {
  /**
   * Object for parsing commands.
   */
  private final CommandParser commandParser;

  /**
   * Constructs a new ProgramPerformer object with specified command manager.
   * @param commandManager used to create command parser
   */
  public ProgramPerformer(CommandManager commandManager) {
    this.commandParser = new CommandParser(commandManager);
  }

  /**
   * Starts interactive mode.
   */
  public void start() {
    System.out.println("Type \"help\" to get information about the commands.");
    while (true) {
      System.out.print("-> ");
      this.commandParser.parse();
    }
  }
}
