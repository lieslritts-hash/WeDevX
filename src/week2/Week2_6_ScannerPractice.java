package week2;

import java.util.Scanner;

/*
2.6 Scanner Practice
Yes, there is no video in this class. Please proceed to exercises.

Enhance your skills with the Scanner class in Java, including
how to read different types of input from the user, handle
exceptions and errors, and more, through a series of hands-on
exercises and challenges in this Scanner Class Practice tutorial.
 */

public class Week2_6_ScannerPractice {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        String fullName = input.nextLine();
        String jobTitle = input.nextLine();
        double salary = input.nextDouble();

        System.out.printf("Dear %s,\nWelcome to Google!\nWe are delighted to have you as a %s. Your starting salary is $%.2f\n\nSincerely,\nGoogle HR Representative", fullName, jobTitle, salary);
    }
}
