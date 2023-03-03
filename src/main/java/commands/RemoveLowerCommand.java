package commands;

import ControlPart.GeneralVars;
import InputWorkers.ElementParser;

import java.io.InputStreamReader;

public class RemoveLowerCommand extends CommandWithElem {
    private static RemoveLowerCommand removeLowerCommand;
    private static final ElementParser elementParser = new ElementParser();

    private RemoveLowerCommand(String name) {
        super(name);
    }

    public static RemoveLowerCommand getInstance() {
        if (removeLowerCommand == null) {
            removeLowerCommand = new RemoveLowerCommand("remove_lower");
        }
        return removeLowerCommand;
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
