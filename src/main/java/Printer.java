public class Printer {
    /**
     * Prints all the functions that the chatbot has, as well as the commands to use them and how to use them
     */
    protected static void printCommandList() {
        printTodoCommand();
        printDeadlineCommand();
        printEventCommand();
        printListCommand();
        printDeleteCommand();
        printMarkCommand();
        printUnmarkCommand();
        printFindCommand();
    }

    protected static void printUnmarkCommand() {
        System.out.println("unmark [task index]                         Marks a task in your list as not done");
    }

    protected static void printMarkCommand() {
        System.out.println("mark [task index]                           Marks a task in your list as done");
    }

    private static void printListCommand() {
        System.out.println("list                                        Displays a list of all tasks and their statuses as well as types");
    }

    private static void printEventCommand() {
        System.out.println("event [description] /from [from] /to [to]   Adds a new event to your list");
    }

    private static void printDeadlineCommand() {
        System.out.println("deadline [description] /by [by]             Adds a new deadline to your list");
    }

    private static void printTodoCommand() {
        System.out.println("todo [description]                          Adds a new todo to your list");
    }

    static void printDeleteCommand() {
        System.out.println("delete [task index]                         Removes a task from your list");
    }

    protected static void printFindCommand() {
        System.out.println("find [description]                          Finds matching tasks in your list");
    }

    /**
     * Prints all the tasks in the task list
     */
    protected static void printList() {
        if (TaskHandler.taskCounter == 0) {
            System.out.println ("Your list is empty!");
            return;
        }
        if (TaskHandler.taskCounter != 1) {
            System.out.print("Here are the tasks");
        }
        else {
            System.out.print("Here is the task");
        }
        System.out.println(" in your list:");

        for (int i = 0; i < TaskHandler.taskCounter; i ++) {
            System.out.print((i + 1) + ". ");
            TaskHandler.taskList.get(i).printTask();
        }
    }
}
