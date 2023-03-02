package ControlPart;

import commands.Command;

import java.io.File;
import java.lang.reflect.Modifier;
import java.util.Objects;

public class CommandLoader {
    private static final CommandManager commandManager = CommandManager.getInstance();
    public void load(){
        try{
            File commandPackage = new File(System.getProperty("user.dir") + "\\src\\main\\java\\" + GeneralVars.COMMAND_PACKAGE);
            File[] commandFiles = commandPackage.listFiles();
            for (int i = 0; i < Objects.requireNonNull(commandFiles).length; i++){
                Class<?> clazz = Class.forName(GeneralVars.COMMAND_PACKAGE + "." + commandFiles[i].getName().split("\\.")[0]);
                int mod = clazz.getModifiers();
                if (!Modifier.isAbstract(mod) && !Modifier.isInterface(mod)){
                    commandManager.addComand((Command) clazz.getMethod("getInstance").invoke(null));
                }

            }
        } catch (Exception ignored) {
            System.out.println(ignored.getMessage());
            ignored.printStackTrace();
        }
    }
}
