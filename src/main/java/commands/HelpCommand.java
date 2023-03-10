package commands;

import java.io.InputStreamReader;

public class HelpCommand extends CommandWithOutArgs {


    public HelpCommand(String name) {
        super(name);
        this.setDescription("help : print help for available commands");
    }


    @Override
    public void execute() {
        System.out.println("""
                help : print help for available commands
                info : print information about the collection (type, initialization date, number of items, etc.) in the standard output.
                show : print all items of the collection as string output in the standard output
                add {element} : add a new element to the collection
                update id {element} : update the value of an element in the collection whose id is equal to the given one
                remove_by_id id : remove an item from the collection by its id
                clear : clear the collection
                save : save the collection to a file
                execute_script file_name : read and execute a script from the specified file. The script contains commands in the same form as the user enters them in interactive mode.
                exit : end the program (without saving it to a file)
                remove_first : remove the first item in the collection
                head : display the first element in the collection
                remove_lower {element} : remove all elements from the collection that are smaller than the given one
                count_by_category category : output the number of elements with a category value equal to the given one
                filter_contains_name name : output the elements whose name field value contains the specified substring
                print_field_ascending_heart_count : print the heartCount values of all elements in ascending order
                """);
        System.out.println("help completed");
    }

    @Override
    public void executeFromScript(InputStreamReader reader) {
        this.execute();
    }


}
