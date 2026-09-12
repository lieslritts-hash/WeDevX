package week2;

import java.util.Scanner;

/*
2.33.4 Time Conversion*
easy
|
30 min
|
Share
Write a program that prompts the user to enter a time in 24-hour format (e.g. 13:30). Using if and else statements, convert the time to 12-hour format and print it out (e.g. 1:30 PM). Required Variables:

plain
Copy code
___ hour = _____;
___ minute = ____;
___ pmOrAm = ____;
Expected Result: Test Input: 13:30

plain
Copy code
Please enter the current hour in 24-hour format:
Please enter the current minute of the hour:
The time in 12-hour format is: 1:30 PM
Expected Result: Test Input: 2:30

plain
Copy code
Please enter the current hour in 24-hour format:
Please enter the current minute of the hour:
The time in 12-hour format is: 2:30 AM
 */

public class Week2_33_4_TimeConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the current hour in 24-hour format:");
        int hour = sc.nextInt();

        System.out.println("Please enter the current minute of the hour:");
        int minute = sc.nextInt();

        String pmOrAm;

        if (hour > 12) {
            hour = hour - 12;
            pmOrAm = "PM";
        } else {
            pmOrAm = "AM";
        }

        System.out.println("The time in 12-hour format is: "
                + hour + ":" + minute + " " + pmOrAm);
    }
}
