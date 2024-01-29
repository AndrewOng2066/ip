import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class FileManager {
    static final Path DIRECTORY_PATH = Paths.get("./data");
    private String fileName;
    private Path filePath;


    public FileManager(String fileName) {
        this.fileName = fileName;
        filePath = DIRECTORY_PATH.resolve(fileName + ".txt");
        createFile();
    }

    private void createFile() {
        try {
            if (!Files.exists(DIRECTORY_PATH)) {
                Files.createDirectories(DIRECTORY_PATH);
            }

            if (!Files.exists(filePath)) {
                Files.createFile(filePath);
            }
        } catch (IOException io) {
            System.out.println("There is an error when creating file. The error is " + io.getMessage());
        }
    }


    void writeArrayListToFile(ArrayList<Task> tasks, boolean isOverwrite) {
        try {
            if (isOverwrite) {
                Files.write(filePath, convertTasksToString(tasks).getBytes(), StandardOpenOption.CREATE, StandardOpenOption.WRITE, StandardOpenOption.TRUNCATE_EXISTING);
            } else {
                Files.write(filePath, convertTasksToString(tasks).getBytes(), StandardOpenOption.CREATE, StandardOpenOption.APPEND);
            }
        } catch (IOException io) {
            System.out.println("There is an error when writing to file. The error is " + io.getMessage());
        }
    }

    ArrayList<Task> loadTasksFromFile() {
        ArrayList<Task> result = new ArrayList<>();
        try {
            List<String> fileContentLines = Files.readAllLines(filePath);
            result = convertStringListToTasks(fileContentLines);
        } catch (IOException io) {
            System.out.println("There is an error when reading the file.");
        }
        return result;
    }


    private String convertTasksToString(ArrayList<Task> tasks) {
        StringBuilder result = new StringBuilder();
        for (Task task: tasks) {
//            result.append(task.toString());
//            result.append(System.getProperty("line.separator"));
            if (task instanceof ToDo) {
                result.append("T | ");
                result.append(task.getStatusIcon().equals("X") ? "1 | " : "0 | ");
                result.append(task.getDescription());
                result.append(System.getProperty("line.separator"));
            } else if (task instanceof Deadline) {
                result.append("D | ");
                result.append(task.getStatusIcon().equals("X") ? "1 | " : "0 | ");
                result.append(task.getDescription() + " | ");
                result.append(((Deadline) task).getBy());
                result.append(System.getProperty("line.separator"));
            } else {
                result.append("D | ");
                result.append(task.getStatusIcon().equals("X") ? "1 | " : "0 | ");
                result.append(task.getDescription() + " | ");
                result.append(((Event) task).getStart() + " | ");
                result.append(((Event) task).getEnd());
                result.append(System.getProperty("line.separator"));
            }

        }
        return result.toString();
    }

    private ArrayList<Task> convertStringListToTasks(List<String> content) {
        ArrayList<Task> fileTasks = new ArrayList<>();
        for (String i : content) {
            String[] stringAttributes = i.split("\\|");
            if (stringAttributes[0].trim().equals("T")) {
                fileTasks.add(new ToDo(stringAttributes[2].trim(), stringAttributes[1].trim().equals("1") ? true : false));
            } else if (stringAttributes[0].trim().equals("D")) {
                fileTasks.add(new Deadline(stringAttributes[2].trim(), stringAttributes[1].trim().equals("1") ? true : false, stringAttributes[3].trim()));
            } else if (stringAttributes[0].trim().equals("E")) {
                fileTasks.add(new Event(stringAttributes[2].trim(), stringAttributes[1].trim().equals("1") ? true : false, stringAttributes[3].trim(), stringAttributes[4].trim()));
            }
        }
        return fileTasks;
    }

    private ArrayList<Task> convertStringToTasks(String content) {
        String[] individualStringTask = content.trim().split(System.lineSeparator());
        ArrayList<Task> fileTasks = new ArrayList<>();
        for (String i : individualStringTask) {
            String[] stringAttributes = i.split("|");
            if (stringAttributes[0].equals("T")) {
                fileTasks.add(new ToDo(stringAttributes[2].trim(), stringAttributes[1].equals("1") ? true : false));
            } else if (stringAttributes[0].equals("D")) {
                fileTasks.add(new Deadline(stringAttributes[2].trim(), stringAttributes[1].equals("1") ? true : false, stringAttributes[3].trim()));
            } else if (stringAttributes[0].equals("E")) {
                fileTasks.add(new Event(stringAttributes[2].trim(), stringAttributes[1].equals("1") ? true : false, stringAttributes[3].trim(), stringAttributes[4].trim()));
            }
        }
        return fileTasks;
    }


}
