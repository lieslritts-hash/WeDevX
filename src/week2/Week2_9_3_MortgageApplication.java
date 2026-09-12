package week2;

import java.util.Scanner;

/*
2.9.3 Mortgage Application
easy
|
30 min
|
Share
Write a program that asks the user for their annual income and
their credit score. The minimum annual income required is
$50000.00, and the minimum credit score required is 700.
The program should compare the entered values to minimum
requirement values and print out the following message:
Expected Output:

plain
Copy code
You meet the minimum income requirements: X
You meet the minimum credit score requirements: Y
Where X is a boolean value for income and Y is for credit score.
 */

public class Week2_9_3_MortgageApplication {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        double income = input.nextDouble();
        int creditScore = input.nextInt();

        boolean meetsMinimumIncome = income > 50_000;
        System.out.println("You meet the minimum income requirements: " + meetsMinimumIncome);

        boolean meetsMinimumCreditScore = creditScore > 700;
        System.out.println("You meet the minimum credit score requirements: " + meetsMinimumCreditScore);
    }
}
