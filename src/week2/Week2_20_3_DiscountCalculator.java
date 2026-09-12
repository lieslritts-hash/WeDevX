package week2;

import java.util.Scanner;

/*
2.20.4 Discount Calculator
easy
|
30 min
|
Share
Write a program that uses a compound operator to calculate
the discount on a product. Input: int, int

Example of input:
plain
Copy code
100
10
Example of output:
plain
Copy code
Enter the original price:
Enter the discount percentage:
The discounted price is 90 dollars.
 */

public class Week2_20_3_DiscountCalculator {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the original price:");
        int price = sc.nextInt();

        System.out.println("Enter the discount percentage:");
        int discount = sc.nextInt();

        price *= 1 - (discount / 100.0);
        System.out.println("The discounted price is " + price + " dollars.");
    }
}
