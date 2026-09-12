package week5;

/*
5.10.4 To-Do List Organizer*
easy
|
30 min
|
Share
You are developing a simple To-Do List Organizer program. Create a static method named printLastTask() that takes an array of tasks (String[]) as a parameter. Your program should print the last task on the to-do list. This feature helps users to quickly check their most recent task without scrolling through the entire list. You need to take the last item of an array and print it in format: Last Task: X, where X - print the last array's item. If the array is empty (length equals 0) - print: Your to-do list is empty

Example #1:
Parameters:

plain
Copy code
String[] toDoList = ["Buy groceries", "Call the doctor",
"Finish the report", "Pay bills"]
Return: void Output:

plain
Copy code
Last Task: Pay bills
Example #2:
Parameters:

plain
Copy code
String[] toDoList = []
Return: void Output:

plain
Copy code
Your to-do list is empty
 */
//write your static method here. No need to add Main class or main method
// or import anything

public class Week5_10_4_ToDoListOrganizer {
    public static void main(String[] args) {

        String[] toDoList = {"Buy groceries", "Call the doctor",
                "Finish the report", "Pay bills"};

        printLastTask(toDoList);

    }

    public static void printLastTask(String[] toDoList) {

        if (toDoList == null || toDoList.length == 0 || toDoList[0].isEmpty()) {
            System.out.println("Your to-do list is empty");
        } else {
            System.out.println("Last Task: " + toDoList[toDoList.length - 1]);
        }
    }
}
