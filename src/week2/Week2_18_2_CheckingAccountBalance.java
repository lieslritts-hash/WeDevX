package week2;

import java.util.Scanner;

/*
2.18.2 Checking account balance*
easy
|
30 min
|
Share
Write a program that updates the balance of a checking
account based on a user's transactions. The program should
prompt the user to enter 3 transaction amounts and then update
the balance using a compound assignment operator ( -=). The
starting balance of the user is $118000.00

plain
Copy code
____ balance = ____;
balance -= ____;
balance -= ____;
balance -= ____;
Expected Output:

plain
Copy code
Please enter the first transaction amount:
Please enter the second transaction amount:
Please enter the third transaction amount:
Your Remaining Balance: $X
Where X is the remaining balance. Note: Dont forget the $ sign
 */

public class Week2_18_2_CheckingAccountBalance {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        double balance = 118000.00;

        System.out.println("Please enter the first transaction amount:");
        balance -= sc.nextDouble();

        System.out.println("Please enter the second transaction amount:");
        balance -= sc.nextDouble();

        System.out.println("Please enter the third transaction amount:");
        balance -= sc.nextDouble();

        System.out.println("Your Remaining Balance: $" + balance);
    }
}
