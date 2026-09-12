package week2;

import java.util.Scanner;

/*
2.3.3 The Richest Man In Babylon*
easy
|
30 min
|
Share
The Richest Man in Babylon is a 1926 book by George S. Clason that
dispenses financial advice through a collection of parables set
4,097 years ago in ancient Babylon. The book remains in print
almost a century after the parables were originally published
and is regarded as a classic of personal financial advice.
The Richest Man in Babylon is among Askar's top 10 books.
Askar's interpretation of the book is:

Doesn't matter how much you earn. Save 10% of your income.

Save it for 6-12 months and look for investment opportunities.
Don't keep your saved money in the bank account. Make
investments that will bring you a small cash flow.
$100-$300/month is good enough.

Don't make Askar's mistake. Don't spend the passive cash flow
($100-$300/month you earned) - put it back together with 10%
savings. Most people do steps 1 and 2. Most people get excited
too early and fail at step 3. If you keep reinvesting passive
income for 5 years, your passive income will be larger than
your active income. Okay, Write a program that asks the user
to enter their monthly salary and it calculates the 10% that
they need to save per month and how much they will have saved
in 6 and 12 months. Expected Output:

plain
Copy code
Please enter your monthly income:
You have to save $X per month which is 10% of your monthly income
In 6 months you will save $Y
In 12 months you will save $Z
Where X is 10% of the monthly income Y is X * 6 Z is X * 12

you can use %% to print out the percentage sign using System.out.printf() ex: System.out.printf("10%%"); will print out 10%
 */
public class Week2_3_3_TheRichestManInBabylon {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your monthly income:");
        double monthlyIncome = scanner.nextDouble();

        double tenPercentIncome = monthlyIncome * .10;

        System.out.printf("You have to save $%.2f per month which is 10%% of your monthly income", tenPercentIncome);

        double sixMonthSavings = tenPercentIncome * 6;
        System.out.printf("\nIn 6 months you will save $%.2f", sixMonthSavings);

        double twelveMonthSavings = tenPercentIncome * 12;
        System.out.printf("\nIn 12 months you will save $%.2f", twelveMonthSavings);
    }
}
