package week3;

import java.util.Scanner;

/*
3.18.1 weekday or a weekend?*
easy
|
30 min
|
Share
Write a Java program that asks the user to input a day of
the week (Monday, Tuesday, etc.). The program should then
use a switch statement to determine whether the day is a
weekday or a weekend day. After determining the type of
the day, the program should print a message to the console
indicating which type it is. If the user inputs a day that
is not recognized by the program, the program should print
an error message and prompt the user to input a valid day of
the week. Your program should use appropriate variable names,
and include comments to explain the logic behind the switch
statement. Test your program with various inputs to ensure it
works correctly. Positive scenario 1: Saturday

plain
Copy code
Enter the day of the week:
Saturday is a weekend day
Positive scenario 2: Monday

plain
Copy code
Enter the day of the week:
Monday is a weekday
Negative scenario: Funday

plain
Copy code
Enter the day of the week:
Invalid day of the week
 */
public class Week3_18_1_WeekdayOrAWeekend {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the day of the week:");
        String dayOfWeek = sc.nextLine();

        // Logic: to check the day of the week and determine whether it is a weekday or weekend.
        switch (dayOfWeek) {
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
                System.out.println(dayOfWeek + " is a weekday");
                break;
            case "Saturday":
            case "Sunday":
                System.out.println(dayOfWeek + " is a weekend day");
                break;
            default:
                System.out.println("Invalid day of the week");
        }
    }
}
