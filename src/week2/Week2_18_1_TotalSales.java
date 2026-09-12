package week2;

import java.util.Scanner;

/*
2.18.1 Total Sales*
easy
|
30 min
|
Share
Write a program that calculates the total sales for a given day. The program should prompt the user to enter the sale amount for 3 transactions, and then add up the total using a compound assignment operator (e.g. +=).

plain
Copy code
____ total = _____;
total += _____;
total += _____;
Expected Output:

plain
Copy code
Enter the sale amount for transaction 1:
Enter the sale amount for transaction 2:
Enter the sale amount for transaction 3:
Total is X
Where X is the sum of 3 transactions. Note: All transaction
amounts should be double data type. Hint: use sc.nextDouble()
after = and +=.
 */

public class Week2_18_1_TotalSales {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the sale amount for transaction 1:");
        double total = sc.nextDouble();

        System.out.println("Enter the sale amount for transaction 2:");
        total += sc.nextDouble();

        System.out.println("Enter the sale amount for transaction 3:");
        total += sc.nextDouble();

        System.out.println("Total is " + total);
    }
}
