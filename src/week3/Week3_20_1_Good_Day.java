package week3;

/*
3.20.1 Good Day*
easy
|
30 min
|
Share
Write a Java program that Prompt user to enter a day of the week (Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday) and a time of day (morning, afternoon, evening) Use a switch statement to check the input for the day of the week.

If the input is valid, use a nested switch statement to check the input for the time of day.

if it's a weekday and

If the time of day is "morning", print "Good morning! It's [day of the week]!".

If the time of day is "afternoon", print "Good afternoon! It's [day of the week]!".

If the time of day is "evening", print "Good evening! It's [day of the week]!".

If the time of day is not one of the options above, print an appropriate error message and terminate the program.

If it's the weekend and

"morning" print out - Good morning! It's the weekend!

"afternoon" print out - Good afternoon! It's the weekend!

"evening" print out - Good evening! It's the weekend!

If the time of day is not one of the options above, print an appropriate error message and terminate the program.

If the day of the week is not one of the options above, print an appropriate error message and terminate the program.

Use a switch statement inside another switch statement to implement this program. Positive Sample Output 1:

plain
Copy code
Enter a day of the week (Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday): Saturday
Enter the time of day (morning, afternoon, evening): afternoon
Good afternoon! It's the weekend!
Positive Sample Output 2:

plain
Copy code
Enter a day of the week (Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday): Wednesday
Enter the time of day (morning, afternoon, evening): evening
Good evening! It's Wednesday!
Negative Sample Output:

plain
Copy code
Enter a day of the week (Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday): Happy Day
Enter the time of day (morning, afternoon, evening): morning
Invalid day of week
Negative Sample Output 2:

plain
Copy code
Enter a day of the week (Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday): Tuesday
Enter the time of day (morning, afternoon, evening): sunrise
Invalid time of day
 */

import java.util.Scanner;

public class Week3_20_1_Good_Day {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a day of the week (Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday):");
        String dayOfWeek = sc.nextLine();

        System.out.println("Enter the time of day (morning, afternoon, evening):");
        String timeOfDay = sc.nextLine();

        // Check the day of the week
        switch (dayOfWeek) {

            // Weekdays
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
                switch (timeOfDay) {
                    case "morning":
                    case "afternoon":
                    case "evening":
                        System.out.println("Good " + timeOfDay + "! It's " + dayOfWeek + "!");
                        break;
                    default:
                        System.out.println("Invalid time of day");
                }
                break;

            // Weekend
            case "Saturday":
            case "Sunday":
                switch (timeOfDay) {
                    case "morning":
                    case "afternoon":
                    case "evening":
                        System.out.println("Good " + timeOfDay + "! It's the weekend!");
                        break;
                    default:
                        System.out.println("Invalid time of day");
                }
                break;

            // Invalid day
            default:
                System.out.println("Invalid day of week");
        }
    }
}
