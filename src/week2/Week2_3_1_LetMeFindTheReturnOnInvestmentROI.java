package week2;

import java.util.Scanner;

/*
2.3.1 Let me find the return on investment(ROI)*
easy
|
30 min
|
Share
Write a program that asks the user to enter how much they
invested and how much they earned. The program should
calculate the ROI in percentage and print out the following
message: Expected Output:

plain
Copy code
Please enter the invested amount in $:
Please enter the ROI amount:
Your ROI is X%
Where X is the result of (Z/Y) * 100; Where Z is ROI
amount entered and Y is invested amount. The formula
to calculate the percentage of a number is: Percentage =
(Part / Whole) * 100 Where "Part" is the portion of the
whole that you are interested in expressing as a percentage,
and "Whole" is the total amount. To calculate the percentage
where the whole is 25000 and the part is 10000, you would use
the following formula: Percentage = (Part / Whole) * 100
Plugging in the values: Percentage = (10000 / 25000) * 100 =
40% So, 10000 is equal to 40% of 25000. Note: you can use %%
to print out the percentage sign using System.out.printf()
 */

public class Week2_3_1_LetMeFindTheReturnOnInvestmentROI {
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
