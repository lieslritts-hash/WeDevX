package week2;

import java.util.Scanner;

/*
2.39.3 Income Tax Calculator*
easy
|
30 min
|
Share
Develop a program that prompts the user to input
their annual income as a double. Using if-else-if
 conditions and conditional operators, calculate and
 display the income tax amount based on predefined tax
 brackets. Assume the following tax brackets:

Income up to $10,000: 5% tax

Income between $10,001 and $50,000: 10% tax

Income between $50,001 and $100,000: 20% tax

Income over $100,000: 30% tax

Example:
Input:

plain
Copy code
70000.0
Output:
plain
Copy code
Annual income:
Tax amount: $14000.0
 */

public class Week2_39_3_IncomeTaxCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Annual income:");
        double annualIncome = sc.nextDouble();

        double tax = 0;

        if (annualIncome <= 10000) {
            tax = 0.05;
        } else if (annualIncome >= 10001 && annualIncome <= 50000) {
            tax = 0.10;
        } else if (annualIncome >= 50001 && annualIncome <= 100000) {
            tax = 0.20;
        } else {
            tax = 0.30;
        }
        double taxAmount = annualIncome * tax;
        System.out.println("Tax amount: $" + taxAmount);
    }
}
