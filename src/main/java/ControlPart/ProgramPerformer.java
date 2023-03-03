package ControlPart;

public class ProgramPerformer {
    public static void start(){
        System.out.println("Type \"help\" to get information about the commands.");
        while (true){
            System.out.print("-> ");
            GeneralVars.COMMAND_PARSER.parse();
        }
    }
}
