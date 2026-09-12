package week2;

import java.util.Scanner;

/*
2.9.1 Weight Measurement*
easy
|
30 min
|
Share
Write a program that asks the user for their current weight and their ideal weight. The program should then use the < operator to compare the two numbers and determine if the user's current weight is less than their ideal weight. The program should print out the following message: Expected Output:

plain
Copy code
Please enter your current weight:
Please enter your ideal weight:
Your current weight is less than your ideal weight: X
Where X is a boolean value from the comparison
 */
public class Week2_9_1_WeightMeasurement {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your current weight:");
        int currentWeight = input.nextInt();

        System.out.println("Please enter your ideal weight:");
        int idealWeight = input.nextInt();

        boolean lessThanIdealWeight = currentWeight < idealWeight;

        System.out.println("Your current weight is less than your ideal weight: " + lessThanIdealWeight);
    }
}
