package commands;

import ControlPart.GeneralVars;
import InputWorkers.ElementParser;

import java.io.InputStreamReader;

public class UpdateCommand extends CommandWithElem {
    private static final ElementParser elementParser = new ElementParser();

    public UpdateCommand(String name) {
        super(name);
        this.setDescription("update id {element} : update the value of an element in the collection whose id is equal to the given one");
    }

    @Override
    public void execute(String arg) {
        GeneralVars.curCol.update(Long.parseLong(arg), elementParser.parseElement());
        System.out.println("update completed");
    }

    @Override
    public void executeFromScript(String arg, InputStreamReader reader) {
        String[] spaceMarineParts = new String[GeneralVars.VAR_COUNT];
        try {
            for (int i = 0; i < GeneralVars.VAR_COUNT; i++) {
                spaceMarineParts[i] = GeneralVars.READER_FILES.getLine(reader);
            }
            GeneralVars.curCol.update(Long.parseLong(arg), GeneralVars.ELEMENT_VALIDATOR.validateSpaceMarine(spaceMarineParts));
            System.out.println("update completed");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Adding failed");
        }
    }

}
