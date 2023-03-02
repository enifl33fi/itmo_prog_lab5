package InputWorkers;

import ControlPart.CommandManager;
import ControlPart.GeneralVars;
import exceptions.WrongCommandException;

import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class CommandParser {

    private static CommandManager commandManager = GeneralVars.commandManager;
    private static Scanner console = new Scanner(System.in);


    public void parse(){
        try{
            String[] commandParts = console.nextLine().split(" ");
            if (commandParts.length > 2){
                throw new WrongCommandException();
            }
            try {
                commandManager.getCommand(commandParts[0]).execute(commandParts[1]);
            }catch (IndexOutOfBoundsException | WrongCommandException ignored){

            }
            try {
                commandManager.getCommand(commandParts[0]).execute();
            }catch (WrongCommandException ignored){

            }
        } catch (WrongCommandException e){
            System.out.println(e.getMessage());
        } catch (NullPointerException | IndexOutOfBoundsException e){
            System.out.println("Unknown command");
        } catch (Exception e){
            System.out.println(e.getMessage());
            e.printStackTrace();
            System.out.println("Unreachable block. Just in case.");
        }
    }
    public void parseFromScript(String line, InputStreamReader reader){
        try{
            String[] commandParts = line.split(" ");
            if (commandParts.length > 2){
                throw new WrongCommandException();
            }
            try {
                commandManager.getCommand(commandParts[0]).executeFromScript(commandParts[1], reader);
            }catch (IndexOutOfBoundsException | WrongCommandException ignored){

            }
            try {
                commandManager.getCommand(commandParts[0]).executeFromScript(reader);
            }catch (WrongCommandException ignored){
                System.out.println(ignored.getMessage());
            }

        } catch (WrongCommandException e){
            System.out.println(e.getMessage());
        } catch (NullPointerException e){
            System.out.println("Unknown command");
        } catch (Exception e){
            System.out.println(e.getMessage());
            e.printStackTrace();
            System.out.println("Unreachable block. Just in case.");
        }
    }


}