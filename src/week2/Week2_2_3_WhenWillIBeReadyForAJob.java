package week2;

import java.util.Scanner;

/*
2.2.3 When will I be ready for a Job?*
easy
|
30 min
|
Share
Write a program that asks the user to enter the number of weeks they completed in the course, then that number should be subtracted from 24 and the result should be printed out. Expected Output:

plain
Copy code
Please enter the number of weeks completed in the course:
X
Where X is the result of 24 - Y Where Y is the entered number.
 */

public class Week2_2_3_WhenWillIBeReadyForAJob {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the number of weeks completed in the course:");
        int weeks = input.nextInt();

        int remainingWeeks = 24 - weeks;

        System.out.printf("%d", remainingWeeks);
    }
}
