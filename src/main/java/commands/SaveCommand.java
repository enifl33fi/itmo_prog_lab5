package commands;

import fileWorkers.WriterCSV;

import java.io.InputStreamReader;

public class SaveCommand extends CommandWithOutArgs {
    private static SaveCommand saveCommand;

    private SaveCommand(String name) {
        super(name);
    }

    public static SaveCommand getInstance(){
        if (saveCommand == null){
            saveCommand = new SaveCommand("save");
        }
        return saveCommand;
    }

    @Override
    public void execute() {
        WriterCSV writerCSV = new WriterCSV();
        writerCSV.save();
        System.out.println("save completed");
    }
    @Override
    public void executeFromScript(InputStreamReader reader) {
        this.execute();
    }
}
