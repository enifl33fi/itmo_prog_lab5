package commands;

import java.io.InputStreamReader;

public class HelpCommand extends CommandWithOutArgs {

    private static HelpCommand helpCommand;

    private HelpCommand(String name) {
        super(name);
    }

    public static HelpCommand getInstance() {
        if (helpCommand == null) {
            helpCommand = new HelpCommand("help");
        }
        return helpCommand;
    }

    @Override
    public void execute() {
        System.out.println("""
                help : print help for available commands
                info : print information about the collection (type, initialization date, number of items, etc.)
                show : print all items of the collection in the standard output string
                add {element} : add a new element to the collection
                update id {element} : update the value of an element in the collection whose id is equal to the given one
                remove_by_id id : remove an item from the collection by its id
                clear : clear the collection
                save : save the collection to a file
                execute_script file_name : read and execute a script from the specified file. The script contains commands in the same form as the user enters them in interactive mode.
                exit : end the program (without saving it to a file)
                remove_head : print the first element of the collection and remove it
                add_if_max {element} add a new element to the collection if its value is greater than the largest element in the collection
                add_if_min {element} : add a new element to the collection if its value is smaller than the smallest element in this collection
                count_less_than_melee_weapon meleeWeapon : display the number of elements whose value of the meleeWeapon field is less than the given value
                filter_by_chapter chapter : print elements with a chapter value equal to the given one
                print_field_ascending_category : print the values of the category field of all elements in ascending order
                """);
        System.out.println("help completed");
    }

    @Override
    public void executeFromScript(InputStreamReader reader) {
        this.execute();
    }


}
