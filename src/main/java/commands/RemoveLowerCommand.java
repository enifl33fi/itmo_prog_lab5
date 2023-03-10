package commands;

import ControlPart.GeneralVars;
import InputWorkers.ElementParser;

import java.io.InputStreamReader;

public class RemoveLowerCommand extends CommandWithElem {
    private static final ElementParser elementParser = new ElementParser();

    public RemoveLowerCommand(String name) {
        super(name);
        this.setDescription("remove_lower {element} : remove all elements from the collection that are smaller than the given one");
    }

    @Override
    public void execute() {
        GeneralVars.curCol.removeLower(elementParser.parseElement());
        System.out.println("remove_lower completed");
    }

    @Override
    public void executeFromScript(InputStreamReader reader) {
        String[] spaceMarineParts = new String[GeneralVars.VAR_COUNT];
        try {
            for (int i = 0; i < GeneralVars.VAR_COUNT; i++) {
                spaceMarineParts[i] = GeneralVars.READER_FILES.getLine(reader);
            }
            GeneralVars.curCol.removeLower(GeneralVars.ELEMENT_VALIDATOR.validateSpaceMarine(spaceMarineParts));
            System.out.println("remove_lower completed");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("remove_lower failed");
        }
    }
}
