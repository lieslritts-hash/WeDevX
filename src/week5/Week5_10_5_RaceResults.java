package week5;

/*
5.10.5 Race Results
easy
|
30 min
|
Share
Create a static method named printRaceResults() that takes an array of
runners' names as a String[] parameter. Your program should print the names
of the first and last runners in a race event. This simulates displaying the
results to recognize both the winner and the participant who crossed the finish line last. Also need to handle cases when in race 0 or 1 participants. Look at the examples to find the expected messages. Return Type: void

Example #1:
Parameters:

plain
Copy code
String[] runners = ["Alice", "Bob", "Charlie", "David", "Eve"]
Output:

plain
Copy code
Winner: Alice
Last Place: Eve
Example #2:
Parameters:

plain
Copy code
String[] runners = ["Charlie"]
Output:

plain
Copy code
One Participant: Charlie
Example #3:
Parameters:

plain
Copy code
String[] runners = []
Output:

plain
Copy code
No runners in the race
 */
//write your static method here. No need to add Main class or main method or import anything

public class Week5_10_5_RaceResults {
    public static void main(String[] args) {

        printRaceResults(new String[]{"Alice", "Bob", "Charlie", "David", "Eve"});
        printRaceResults(new String[]{"Charlie"});
        printRaceResults(new String[]{});

    }

    public static void printRaceResults(String[] runners) {
        if (runners == null || runners.length == 0) {
            System.out.println("No runners in the race");
        } else if (runners.length == 1) {
            System.out.println("One Participant: " + runners[0]);
        } else {
            System.out.println("Winner: " + runners[0]);
            System.out.println("Last Place: " + runners[runners.length - 1]);
        }
    }
}
