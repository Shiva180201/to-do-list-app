import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);
    private static final ToDoList toDoList = new ToDoList();

    public static void main(String[] args) {
        System.out.println("Welcome to the To-Do List Application!");
        int choice;

        do {
            showMenu();
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addTask();
                    break;

                case 2:
                    viewTasks();
                    break;
                case 3:
                    markTaskAsComplete();
                    break;
                case 4:
                    deleteTask();
                    break;
                case 5:
                    System.out.println("Exiting the Program");
                    return;
                default:
                    System.out.println("Invalid choice, Please try again.");
            }

        }while (choice != 5);
    }

    //Menu to select the operations
    private static void showMenu() {
        System.out.println("To-DOList Menu:");
        System.out.println("1. Add Task");
        System.out.println("2. View Tasks");
        System.out.println("3. Mark Task as Completed");
        System.out.println("4. Delete Task");
        System.out.println("5. Exit");
        System.out.println("Enter your choice");
    }

    //To add a new Task
    private static void addTask() {
        System.out.println("Enter task description: ");
        String description = scanner.nextLine();
        toDoList.addTask(description);
    }

    //To Display all Tasks in the List
    private static void viewTasks() {
        System.out.println("Your To-Do List:");
        toDoList.displayTasks();
    }

    //To mark Task as complete
    private static  void markTaskAsComplete() {
        System.out.println("Enter task number to mark as completed: ");
        int taskIndex = scanner.nextInt() - 1;
        scanner.nextLine(); // To select the task number
        toDoList.markTaskComplete(taskIndex);
    }

    //To delete task
    private static void deleteTask() {
        System.out.println("Enter task number to delete: ");
        int taskIndex = scanner.nextInt() - 1;
        scanner.nextLine();
        toDoList.deleteTask(taskIndex);
    }
}
