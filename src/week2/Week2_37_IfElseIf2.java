package week2;

import java.util.Scanner;

/*
2.37 If, Else If 2
Building upon the previous class, this video dives
deeper into the topic of if-else-if statements,
demonstrating how to effectively combine them with
logical operators to create even more complex
decision-making structures in Java.
 */

public class Week2_37_IfElseIf2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int number = sc.nextInt();

        if (number == 0) {
            System.out.println("The number is zero.");
        } else if (number % 2 != 0) {
            System.out.println("The number is odd.");
        } else {
            System.out.println("The number is even.");
        }
    }
}
