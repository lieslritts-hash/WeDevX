package week3;

import java.util.Scanner;

/*
3.4.6 Bank Loan*
easy
|
30 min
|
Share
Write a program that uses nested if statements to determine
whether a
loan can be approved. The program should check the user's
input with int data type for credit rating and income. A
loan can be approved if the credit rating is above 700 and
the income is above $50,000.

First, you need to check your credit score.

If the credit score is below 700, you must display the
message: Sorry, your loan has been denied. Your credit
rating is not high enough.

Next, we check the income, if it is below 50,000, then you
need to print the message: Sorry, your loan has been denied.
Your income is not high enough.

Otherwise, need to print: Congratulations! Your loan has
been approved. Also before each check of the if statement
you need to add loading messages: Checking your credit
rating... and Checking your income level...

Example of output:
plain
Copy code
Checking your credit rating...
Enter your credit rating: 750
Checking your income level...
Enter your income: 40000
Sorry, your loan has been denied. Your income is not high enough.

Checking your credit rating...
Enter your credit rating: 800
Checking your income level...
Enter your income: 100000
Congratulations! Your loan has been approved.

Checking your credit rating...
Enter your credit rating: 680
Sorry, your loan has been denied. Your credit rating is not high enough.
 */

public class Week3_4_1_BankLoan {
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
