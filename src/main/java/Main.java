import controlPart.CommandLoader;
import controlPart.GeneralVars;
import controlPart.ProgramPerformer;
import inputWorkers.WorkFileGetter;
import collection.CollectionGenerator;
import exceptions.NullSystemVariableException;

public class Main {
  public static void main(String[] args) {
    GeneralVars generalVars = new GeneralVars();
    CommandLoader commandLoader = new CommandLoader(generalVars.getCommandManager());
    commandLoader.load(generalVars.getCurCol());
    ProgramPerformer programPerformer = new ProgramPerformer(generalVars.getCommandManager());
    CollectionGenerator collectionGenerator = new CollectionGenerator();
    WorkFileGetter workFileGetter = new WorkFileGetter();
    try {
      collectionGenerator.generateFromCSV(workFileGetter.getWorkFile(), generalVars.getCurCol());
      programPerformer.start();
    } catch (NullSystemVariableException e) {
      System.out.println(e.getMessage());
    }
  }
}
