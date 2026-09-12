package week2;

import java.util.Scanner;

/*
2.9.5 Heart rate
easy
|
30 min
|
Share
Write a program that asks the user for their current heart rate
and the average heart rate for their age group. The program
should then use the < operator to compare the two numbers and
determine if the user's current heart rate is less than the
average heart rate for their age group. The program should print:
Expected Output:

plain
Copy code
Please enter your current heart rate:
Please enter the average heart rate for their age group:
Your heart rate is lower than the average heart rate for your
age group: X
Where X is a boolean value from the comparison.
 */

public class Week2_9_5_HeartRate {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your current heart rate:");
        int currentHeartRate = input.nextInt();

        System.out.println("Please enter the average heart rate for their age group:");
        int averageHeartRate = input.nextInt();

        boolean lowerThanAverage = currentHeartRate < averageHeartRate;

        System.out.println("Your heart rate is lower than the average heart rate for your age group: " + lowerThanAverage);
    }
}
