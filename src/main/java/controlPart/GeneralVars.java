package controlPart;

import collection.SpaceMarineCollection;

/**
 * Class for storing some basic variables and objects.
 * @author Kirill Markov
 * @version 1.0
 */
public class GeneralVars {
  /**
   * Working collection.
   */
  private final SpaceMarineCollection curCol = new SpaceMarineCollection();
  /**
   * Count of fields in SpaceMarine object. {@link element.SpaceMarine}
   */
  public static final int VAR_COUNT = 11;
  /**
   * Name of the save file.
   */
  public static String saveFileName;
  /**
   * Headline for CSV file.
   */
  public static final String HEADLINES =
      "name,x,y,health,heartCount,category,meleeWeapon,chapterName,marinesCount,id,creationDate";
  /**
   * Name of required system variable.
   */
  public static final String SYSTEM_VARIABLE = "FILE_LAB5_PATH";
  /**
   * Current command manager. {@link controlPart.CommandManager}
   */
  private final CommandManager commandManager = new CommandManager();

  /**
   * Returns current collection.
   * @return current collection
   */
  public SpaceMarineCollection getCurCol() {
    return curCol;
  }

  /**
   * Returns current command manager.
   * @return current command manager
   */
  public CommandManager getCommandManager() {
    return commandManager;
  }
}
