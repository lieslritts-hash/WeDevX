package week2;

import java.util.Scanner;

/*
2.9.2 Height Measurement*
easy
|
30 min
|
Share
Write a program that asks the user for their current height
and the average height of their age group (google it). The
program should then use the > operator to compare the two
numbers and determine if the user's current height is greater
than the average height of their age group. The program should
print the following: Expected Output:

plain
Copy code
Please enter your current height:
Please enter the average height of their age group:
You are taller than the average height of their age group: X
Where X is a boolean value from the comparison.
 */

public class Week2_9_2_HeightMeasurement {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your current height:");
        int currentHeight = input.nextInt();

        System.out.println("Please enter the average height of their age group:");
        int averageHeight = input.nextInt();

        boolean greaterThanAverageHeight = currentHeight > averageHeight;

        System.out.println("You are taller than the average height of their age group: " + greaterThanAverageHeight);
    }
}
