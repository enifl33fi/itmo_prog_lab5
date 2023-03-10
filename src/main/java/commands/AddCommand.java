package commands;

import ControlPart.GeneralVars;
import InputWorkers.ElementParser;

import java.io.InputStreamReader;

public class AddCommand extends CommandWithElem {
    private static final ElementParser elementParser = new ElementParser();

    public AddCommand(String name) {
        super(name);
        this.setDescription("add {element} : add a new element to the collection");
    }

    @Override
    public String descr() {
        return this.description;
    }


    @Override
    public void execute() {
        GeneralVars.curCol.add(elementParser.parseElement());
        System.out.println("Add completed");
    }

    @Override
    public void executeFromScript(InputStreamReader reader) {
        String[] spaceMarineParts = new String[GeneralVars.VAR_COUNT - 2];
        try {
            for (int i = 0; i < GeneralVars.VAR_COUNT - 2; i++) {
                spaceMarineParts[i] = GeneralVars.READER_FILES.getLine(reader);
            }
            GeneralVars.curCol.add(GeneralVars.ELEMENT_VALIDATOR.validateSpaceMarine(spaceMarineParts));
            System.out.println("add completed");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("add failed");
        }
    }

}
