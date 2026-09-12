package week2;

import java.util.Scanner;

/*
2.10 Less than or equal to and more than or equal to comparison operators
Understand the use of the < and > comparison operators in Java, including
how to compare values of different data types, the difference between <=
and >=in this comprehensive <=, >= Comparison Operator tutorial.
 */

public class Week2_10_LessThanOrEqualToAndMoreThanOrEqualToComparisonOperators {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the average rainfall in your region:");
        int averageRainfall = input.nextInt();

        boolean minimumRainfall = averageRainfall >= 40;
        System.out.println("Does it meet the minimum requirement? " + minimumRainfall);
    }
}
