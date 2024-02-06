package task;


/**
 * A class to create ToDO Object.
 * A subclass of Task.
 */
public class ToDo extends Task {

    /**
     * A constructor to create ToDo Object.
     *
     * @param description The title of the ToDo.
     * @param isDone The status of the ToDo.
     */
    public ToDo(String description, boolean isDone) {
        super(description, isDone);
    }

    /**
     * Prints the information of the ToDo Object.
     *
     * @return the information of the ToDo.
     */
    @Override
    public String toString() {
        return "[T][" + super.getStatusIcon() + "] " + super.getDescription();
    }
}
