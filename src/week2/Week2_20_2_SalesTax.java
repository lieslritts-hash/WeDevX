package week2;

import java.util.Scanner;

/*
2.20.2 Sales Tax*
easy
|
30 min
|
Share
Write a program that applies sales tax to a sale amount.
The program should prompt the user to enter the sales amount
and tax rate and then calculate the total amount due
(including tax).

plain
Copy code
___ total = ____;
___ tax = ____;
total __ ____;
Expected result:

plain
Copy code
Please enter the sale amount:
Please enter the tax rate:
X.XX
Where X.XX is a double value.


 */

public class Week2_20_2_SalesTax {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the sale amount:");
        double total = sc.nextDouble();

        System.out.println("Please enter the tax rate:");
        double tax = sc.nextDouble();

        total *= 1 + (tax/100);
        System.out.println(total);
    }
}
