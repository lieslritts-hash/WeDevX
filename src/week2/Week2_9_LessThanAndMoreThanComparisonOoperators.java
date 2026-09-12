package week2;

import java.util.Scanner;

/*
2.9 Less than and more than comparison operators
Understand the use of the < and > comparison operators in Java,
including how to compare values of different data types, the
difference between < and > in this comprehensive <, > Comparison
Operator tutorial.
 */

public class Week2_9_LessThanAndMoreThanComparisonOoperators {
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
