package week2;

import java.util.Scanner;

/*
2.10.1 Apple 🍏 *
easy
|
30 min
|
Share
The minimum rainfall required for growing apples varies depending on the specific variety of apples, the region in which they are grown, and other factors such as soil type and irrigation practices. On average, apple trees require at least 40 inches of rainfall annually to thrive. Write a program that asks the user to enter the average rainfall in their region and compares the entered rainfall to the minimum required rainfall using >=. Then prints out the following message: Expected Output:

plain
Copy code
Please enter the average rainfall in your region:
Does it meet the minimum requirement? X
Where X is the value from the comparison.
 */

public class Week2_10_1_Apple {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the average rainfall in your region:");
        int averageRainfall = input.nextInt();

        boolean minimumRainfall = averageRainfall >= 40;
        System.out.println("Does it meet the minimum requirement? " + minimumRainfall);
    }
}
