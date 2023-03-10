import ControlPart.ProgramPerformer;
import InputWorkers.WorkFileGetter;
import collection.CollectionGenerator;
import exceptions.NullSystemVariableException;


public class Main {
    public static void main(String[] args) {
        CollectionGenerator collectionGenerator = new CollectionGenerator();
        WorkFileGetter workFileGetter = new WorkFileGetter();
        try {
            collectionGenerator.generateFromCSV(workFileGetter.getWorkFile());
            ProgramPerformer.start();
        } catch (NullSystemVariableException e){
            System.out.println(e.getMessage());
        }

    }
}
