public class Task {

    private String description;
    private boolean isCompleted;

    public Task(String description) {
        this.description = description;
        this.isCompleted = false;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void markAsCompleted() {
        isCompleted = true;
    }

    //Override the toString method, because it will display Hexadecimal number
    @Override
    public String toString() {
        return(isCompleted ? "[Completed] " : "[Pending] ") + description;
    }
}
