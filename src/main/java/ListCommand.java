public class ListCommand extends Command{
    @Override
    public void excuteCommand(TaskList tasks, Ui ui, Storage storage) throws DukeException {
        ui.printAnyStatement("Here are the tasks in your list:");
        tasks.setTasks(storage.loadTasksFromFile());
        for (int i = 0; i < tasks.getTasks().size(); i++) {
            System.out.println("      " + (i + 1) + "." + tasks.getTasks().get(i).toString());
        }
    }
}
