package week2;

import java.util.Scanner;

/*
2.33.3 Bank Credit Score
Write a program that prompts the user to enter their credit score. Using if and else statements, check if the credit score is above 700. If it is, print "Congratulations, your credit score is good". Otherwise, print "Your credit score needs improvement" Expected Result 1:

plain
Copy code
What is your credit score?
Congratulations, your credit score is good
Expected Result 2:

plain
Copy code
What is your credit score?
Your credit score needs improvement
 */

public class Week2_33_3_BankCreditScore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("What is your credit score?");
        int creditScore = sc.nextInt();

        if (creditScore > 700) {
            System.out.println("Congratulations, your credit score is good");
        } else {
            System.out.println("Your credit score needs improvement");
        }
    }
}
