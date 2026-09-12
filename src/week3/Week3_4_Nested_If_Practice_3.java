package week3;

import java.util.Scanner;

/*
This Java class covers nested "if" statements, best practices
for using them, and practical exercises to develop your skills
in using
them effectively.
 */

public class Week3_4_Nested_If_Practice_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Checking your credit rating...");
        System.out.print("Enter your credit rating:\n");
        int creditRating = sc.nextInt();

        if (creditRating < 700) {
            System.out.println("Sorry, your loan has been denied. Your credit rating is not high enough.");
        } else {
            System.out.println("Checking your income level...");
            System.out.print("Enter your income:\n");
            int income = sc.nextInt();

            if (income < 50000) {
                System.out.println("Sorry, your loan has been denied. Your income is not high enough.");
            } else {
                System.out.println("Congratulations! Your loan has been approved.");
            }
        }

        sc.close();
    }
}
