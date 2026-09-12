package week2;

import java.util.Scanner;


/*
2.2.1 How many goals did you achieve today?
easy
|
30 min
|
Share
Write a program that asks the user to enter the number of
goals they accomplished today and prints out the following
message:

plain
Copy code
How many goals did you close today?
Good job on closing X goals today.
Where X is the number of goals closed.
 */

public class Week2_2_1_HowManyGoalsDidYouAchieveToday {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("How many goals did you close today?");
        int goals = sc.nextInt();

        System.out.printf("Good job on closing %d goals today.", goals);


    }
}
