package week2;

import java.util.Scanner;

/*
2.3 Scanner nextDouble()
Learn how to use the nextDouble() method of the Scanner
class in Java to read floating-point input from the user,
including how to handle exceptions and errors, in this
comprehensive Scanner Class nextDouble() tutorial.
 */

public class Week2_3_ScannernextDouble {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the invested amount in $:");
        double investment = scanner.nextDouble();

        System.out.println("Please enter the ROI amount: ");
        double roi = scanner.nextDouble();

        double percentage = roi / investment * 100;

        System.out.printf("Your ROI is %.2f%%", percentage);
    }
}
