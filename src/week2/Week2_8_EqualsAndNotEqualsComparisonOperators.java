package week2;

import java.util.Scanner;

/*
2.8 Equals and not equals comparison operators
Learn the basics of using the == and != comparison operators in
Java, including how to compare values of different data types,
and more, in this comprehensive ==, != Comparison Operator
tutorial.
 */

public class Week2_8_EqualsAndNotEqualsComparisonOperators {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the number of miles they have traveled:");
        int numberOfMilesTraveled = input.nextInt();

        System.out.println("Please enter the number of miles they plan to travel:");
        int numberOfMilesPlanToTravel = input.nextInt();

        boolean milesEqual = numberOfMilesTraveled == numberOfMilesPlanToTravel;

        System.out.println("You have traveled the planned miles already: " + milesEqual);
    }
}
