import java.util.ArrayList;
import java.util.List;

public class ToDoList {

    private List<Task> tasks;

    public ToDoList() {
        tasks = new ArrayList<>();
    }

    //To add a new Task in ArrayList using Task object as generic
    public void addTask(String description) {
        tasks.add(new Task(description));
    }

    //To display all the task in List
    public void displayTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks in the list.");
        }
        else {
            for (int i =0; i< tasks.size(); i++) {
                System.out.println(i + 1 + ". "+tasks.get(i));
            }
        }
    }

    //To Delete the task
    public void deleteTask(int taskIndex) {
        if (taskIndex >=0 && taskIndex < tasks.size()) {
            tasks.remove(taskIndex);
        }
    }

    //Mark Task as Complete
    public void markTaskComplete(int taskIndex) {
        if (taskIndex>=0 && taskIndex<tasks.size()) {
            tasks.get(taskIndex).markAsCompleted();
        }
    }
}
