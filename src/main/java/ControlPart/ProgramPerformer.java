package ControlPart;

import InputWorkers.CommandParser;

public class ProgramPerformer {
  private final CommandParser commandParser;

  public ProgramPerformer(CommandManager commandManager) {
    this.commandParser = new CommandParser(commandManager);
  }

  public void start() {
    System.out.println("Type \"help\" to get information about the commands.");
    while (true) {
      System.out.print("-> ");
      this.commandParser.parse();
    }
  }
}
