package ControlPart;

import InputWorkers.CommandParser;
import collection.SpaceMarineCollection;
import fileWorkers.ReaderFiles;

import java.util.Stack;

public class GeneralVars {
    static {
        CommandLoader commandLoader = new CommandLoader();
        commandLoader.load();

    }
    public static SpaceMarineCollection curCol = new SpaceMarineCollection();
    public static final int VAR_COUNT = 11;
    public static String saveFileName;
    public static final String HEADLINES = "name,x,y,health,heartCount,category,meleeWeapon,chapterName,marinesCount,id,creationDate";
    public static final String SYSTEM_VARIABLE = "FILE_LAB5_PATH";

    public static final String COMMAND_PACKAGE = "commands";

    public static final CommandManager commandManager = CommandManager.getInstance();
    public static Stack<String> curExecutionFiles = new Stack<>();
    public static final ElementValidator ELEMENT_VALIDATOR = new ElementValidator();
    public static final CommandParser COMMAND_PARSER = new CommandParser();
    public static final ReaderFiles READER_FILES = new ReaderFiles();
    public static final ScriptExecutor SCRIPT_EXECUTOR = new ScriptExecutor();

    public static final String FILE_DIR = "\\src\\main\\resources\\";

}
