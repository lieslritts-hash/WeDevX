package week2;

import java.util.Scanner;

/*
2.18 Compound Operators
In this class, we will discover how compound operators in
Java can streamline your code and boost its efficiency.
 */

public class Week2_18_CompoundOperators {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the sale amount for transaction 1:");
        double total = sc.nextDouble();

        System.out.println("Enter the sale amount for transaction 2:");
        total += sc.nextDouble();

        System.out.println("Enter the sale amount for transaction 3:");
        total += sc.nextDouble();

        System.out.println("Total is " + total);
    }
}
