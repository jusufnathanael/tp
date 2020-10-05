package seedu.duke;

import seedu.duke.commands.Command;
import seedu.duke.commands.ExitCommand;
import seedu.duke.exceptions.EmptyCommandException;
import seedu.duke.exceptions.IncompleteCommandException;
import seedu.duke.exceptions.UnknownCommandException;
import seedu.duke.userinterface.Ui;
import seedu.duke.tasks.Storage;
import seedu.duke.tasks.TaskHelper;
import seedu.duke.commands.Parser;
import java.io.File;


public class Duke {
    private TaskHelper taskHelper;
    private Ui ui;

    private Storage storage;

    /**
     * Initializes a new Ui, Storage and TaskHelper object
     * Storage object is initialized with input String as the file path
     * Performs a "list" method to display tasks already in the txt file from the file path
     */
    public Duke(String filePath) {
        ui = new Ui();
        ui.printWelcome();
        storage = new Storage(getJarFilepath()+filePath);
        taskHelper = new TaskHelper(storage.readFromFile(ui));
        ui.printList(taskHelper.list());
    }

    /**
     * Takes in user input, deciphers and executes the command
     * Method continues until exit condition isExit is true
     * isExit is true when user inputs the exit Command
     */
    public void run() {
        boolean isExit = false;
        while (!isExit) {
            try {
                String fullCommand = ui.readCommand();
                Command c = Parser.parse(fullCommand);
                c.execute(taskHelper, ui, storage);
                isExit = ExitCommand.isExit(c);
            } catch (EmptyCommandException | IncompleteCommandException | UnknownCommandException e) {
                ui.printToUser(e.getMessage());
            }
        }
        ui.printGoodbye();
    }

    public static void main(String[] args) {
        new Duke("/data/list.txt").run();
    }

    /**
     * Returns path of jar file during execution to allow
     * app to create txt file in the same location.
     */
    private static String getJarFilepath() {
        return new File(Duke.class.getProtectionDomain().getCodeSource().getLocation().getPath()).getParent().replace("%20", " ");
    }

}
