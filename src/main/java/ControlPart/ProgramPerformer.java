package ControlPart;

public class ProgramPerformer {
    public static void start(){
        while (true){
            System.out.print("-> ");
            GeneralVars.COMMAND_PARSER.parse();
        }
    }
}
