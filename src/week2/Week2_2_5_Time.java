package week2;

import java.util.Scanner;

/*
2.2.5 Time*
easy
|
30 min
|
Share
Write a program that asks the user to enter the
current time, hour and minute, and seconds as an integer.
Then it prints out the time in the following format:
Expected Output:

plain
Copy code
Please enter the hour:
Please enter the minutes:
Please enter the seconds:
The current time is h:m:s
Where h is the hour entered, m is the minute, and s is the seconds entered.
 */

public class Week2_2_5_Time {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the hour:");
        int hour = input.nextInt();

        System.out.println("Please enter the minutes:");
        int minutes = input.nextInt();

        System.out.println("Please enter the seconds:");
        int seconds = input.nextInt();

        System.out.printf("The current time is %d:%d:%d", hour, minutes, seconds);
    }
}
