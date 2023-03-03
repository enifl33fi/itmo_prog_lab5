import ControlPart.ProgramPerformer;
import collection.CollectionGenerator;
import ControlPart.GeneralVars;


public class Main {
    public static void main(String[] args) {
        CollectionGenerator collectionGenerator = new CollectionGenerator();
        try {
            collectionGenerator.generateFromCSV(System.getenv(GeneralVars.SYSTEM_VARIABLE));
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
            System.out.println("Couldn't find needed system variable¯\\_(ツ)_/¯");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Unreachable block. Just in case.");
        }
        ProgramPerformer.start();
    }
}
