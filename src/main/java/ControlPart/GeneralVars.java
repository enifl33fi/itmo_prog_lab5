package ControlPart;

import InputWorkers.CommandParser;
import collection.SpaceMarineCollection;
import fileWorkers.ReaderFiles;

import java.util.Stack;

public class GeneralVars {

  private final SpaceMarineCollection curCol = new SpaceMarineCollection();
  public static final int VAR_COUNT = 11;
  public static String saveFileName;
  public static final String HEADLINES =
      "name,x,y,health,heartCount,category,meleeWeapon,chapterName,marinesCount,id,creationDate";
  public static final String SYSTEM_VARIABLE = "FILE_LAB5_PATH";
  private final CommandManager commandManager = new CommandManager();

  public SpaceMarineCollection getCurCol() {
    return curCol;
  }

  public CommandManager getCommandManager() {
    return commandManager;
  }
}
