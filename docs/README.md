# Andelu Task Bot
> [!NOTE]
> Life lacks excitement without tasks - Andelu

Andelu Bot is here to help you keep track of all your tasks, ensuring your life is both meaningful and seamless.
It is:

- Text based
- Easy to learn 
- ~~Fast~~ _SUPER SUPER FAST_ to use

## Getting Started 💻

To use  Andelu Bot, follow these steps:

1. Download it from [here](https://github.com/AndrewOng2066/ip/releases/tag/A-Jar) (`jar` File)
2. Run the `jar` file (double click it) or Run it from the command line with `java -jar IndividualProject.jar`
3. Add your tasks (Todo, Deadline, Event)
4. Let Andelu Bot manage your tasks😉

And it is **FREE** to use! 🚫💵

## Features

- [x] Managing ToDos
- [x] Managing deadlines 
- [x] Managing Events
- [x] Search Tasks
- [x] Search Tasks based on date
- [x] GUI View

## Command Summary
| Action | Description | Command Format, Examples |
| --- | --- | --- | 
| Add todo | Add a new todo task to the list, and will be stored in a txt file. | `todo DESCRIPTION` <br>e.g., `todo read book` |
| Add deadline | Add a new deadline task to the list, and will be stored in a txt file. | `deadline DESCRIPTION /by yyyy-MM-dd HH:mm` <br>e.g., `deadline return book /by 2024-02-20 23:59` | 
| Add event | Add a new event task to the list, and will be stored in a txt file. | `event DESCRIPTION /from yyyy-MM-dd HH:mm /to yyyy-MM-dd HH:mm` <br>e.g., `event meeting /from 2024-02-20 15:00 /to 2024-02-20 17:00` |
| List content | List down all the existing tasks in the list/txt file. | `List` |
| Mark for completed | Marks a task in the list as completed. <br>> [!NOTE] `INDEX` must be positive and not exceed the size of the list. | `mark INDEX` <br>e.g., `mark 2` |
| UnMark for incomplete | Unmarks a task in the list as incomplete. <br>> [!NOTE] `INDEX` must be positive and not exceed the size of the list. | `unmark INDEX` <br>e.g., `unmark 2` |
| Search task based on description | Finds all tasks with matching keywords for description. | `search DESCRIPTION` <br>e.g., `search book` |
| Search task based on date | Finds all tasks with matching date. | `date yyyy-MM-dd HH:mm` <br>e.g., `date 2024-02-20` |
| Setting priority | > [!NOTE] `DEFAULT` by optional<br> Set the priority level for each task. <br> Levels: `HIGH`, `MEDIUM`, `LOW`, `DEFAULT` | `todo DESCRIPTION /priority LEVEL` <br>e.g., `todo join club /priority medium` |
| Exit | Exits the program. | `bye` |


## Java Developer Guide
Entry point for Andelu Bot (Duke.java):
```
public static void main(String[] args) {
        new Duke("duke").run();
    }
```
