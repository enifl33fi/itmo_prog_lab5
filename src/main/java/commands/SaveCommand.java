package commands;

import fileWorkers.WriterCSV;

import java.io.InputStreamReader;

public class SaveCommand extends CommandWithOutArgs {

    public SaveCommand(String name) {
        super(name);
        this.setDescription("save : save the collection to a file");
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
