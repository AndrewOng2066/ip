# Andelu Task Bot
> [!NOTE]
> Life lacks excitement without tasks - Andelu

Andelu Task Bot is here to help you keep track of all your tasks, ensuring your life is both meaningful and seamless.
It is:

- Text based
- Easy to learn 
- ~~Fast~~ _SUPER SUPER FAST_ to use

## Getting Started 💻

To use  Andelu Bot, follow these steps:

1. Ensure you have Java version `11` or above installed on your Computer.
2. Download the `latest` jar file from [here](https://github.com/AndrewOng2066/ip/releases/tag/A-Jar) (`jar` File)
3. Run the `jar` file (double click it) or Run it from the command line with `java -jar IndividualProject.jar`
4. Add your tasks (Todo, Deadline, Event) via Command Line Interface (CLI)
5. Let Andelu Bot manage your tasks😉
![Ui](https://github.com/AndrewOng2066/ip/assets/156929179/5edfabda-b64a-4fe0-8328-510581945530)

And it is **FREE** to use! 🚫💵

## Features

- [x] Managing ToDos
- [x] Managing deadlines 
- [x] Managing Events
- [x] Search Tasks
- [x] Search Tasks based on date
- [x] GUI View

### Listing all the existing tasks in the list/ txt file: `list`
List down all the tasks in the list/txt file.
Format: `list`

### Adding a new todo task: `todo`
Add a new todo task to the list, and it will be stored in a txt file.
Format: `todo DESCRIPTION`

###▶️ Adding a new deadline task: `deadline`
Add a new deadline task to the list, and it will be stored in a txt file.
Format: `deadline DESCRIPTION /by yyyy-MM-dd HH:mm`

### Adding a new event task: `event`
Add a new event task to the list, and it will be stored in a txt file.
Format: `event DESCRIPTION /from yyyy-MM-dd HH:mm /to yyyy-MM-dd HH:mm`

### Deleting a task: `delete`
Delete an existing task in the list, and it will be removed from the txt file.
Format: `delete INDEX`
📝The `INDEX` refers to the index number of a task in the list. 
⚠️: `INDEX` must be positive and not exceed the size of the list.

### Marking a task: `mark`
Mark a task in the list as completed. 
Format: `mark INDEX`
📝The `INDEX` refers to the index number of a task in the list. 
⚠️: `INDEX` must be positive and not exceed the size of the list.

### Unmarking a task: `mark`
Unmark a task in the list as incomplete. 
Format: `unmark INDEX`
📝The `INDEX` refers to the index number of a task in the list. 
⚠️: `INDEX` must be positive and not exceed the size of the list.

### Searching tasks based on the description: `search`
Find all tasks with matching keywords for description. 
Format: `search DESCRIPTION`

### Searching tasks based on the date: `date`
Find all tasks with the matching date. 
Format: `date yyyy-MM-dd`

### Setting priority level
Add a priority level to each new task.
📝: `DEFAULT` if not stated explicitly.
🎚️Priority Levels: `HIGH`, `MEDIUM`, `LOW`, `DEFAULT`
Format: `todo DESCRIPTION /priority LEVEL`

### Exiting the program: `bye`
Exit the program.
Format: `bye`


## Command Summary
| Action | Description | Command Format, Examples |
| --- | --- | --- | 
| List content | List down all the existing tasks in the list/txt file. | `List` |
| Add todo | Add a new todo task to the list, and it will be stored in a txt file. | `todo DESCRIPTION` <br>e.g., `todo read book` |
| Add deadline | Add a new deadline task to the list, and it will be stored in a txt file. | `deadline DESCRIPTION /by yyyy-MM-dd HH:mm` <br>e.g., `deadline return book /by 2024-02-20 23:59` | 
| Add event | Add a new event task to the list, and it will be stored in a txt file. | `event DESCRIPTION /from yyyy-MM-dd HH:mm /to yyyy-MM-dd HH:mm` <br>e.g., `event meeting /from 2024-02-20 15:00 /to 2024-02-20 17:00` |
| Delete task | Delete a task from the list and txt file. <br>The `INDEX` refers to the index number of a task in the list. <br>⚠️: `INDEX` must be positive and not exceed the size of the list. | `delete INDEX` <br>e.g., `delete 2` |
| Mark for completed | Mark a task in the list as completed. <br>The `INDEX` refers to the index number of a task in the list. <br>⚠️: `INDEX` must be positive and not exceed the size of the list. | `mark INDEX` <br>e.g., `mark 2` |
| UnMark for incomplete | Unmarks a task in the list as incomplete.<br>The `INDEX` refers to the index number of a task in the list.  <br> ⚠️: `INDEX` must be positive and not exceed the size of the list. | `unmark INDEX` <br>e.g., `unmark 2` |
| Search task based on description | Finds all tasks with matching keywords for description. | `search DESCRIPTION` <br>e.g., `search book` |
| Search task based on date | Find all tasks with the matching date. | `date yyyy-MM-dd HH:mm` <br>e.g., `date 2024-02-20` |
| Setting priority | 📝: `DEFAULT` if not stated explicitly <br> Set the priority level for each task. <br> Levels: `HIGH`, `MEDIUM`, `LOW`, `DEFAULT` | `todo DESCRIPTION /priority LEVEL` <br>e.g., `todo join club /priority medium` |
| Exit | Exits the program. | `bye` |


## Java Developer Guide
Entry point for Andelu Bot (Duke.java):
```
public class Launcher {

    public static void main(String[] args) {
        Application.launch(MainGui.class, args);
    }
}
```
