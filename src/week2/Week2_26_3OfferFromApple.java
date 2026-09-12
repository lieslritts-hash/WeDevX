package week2;

import java.util.Scanner;

/*
2.26.3 Offer from Apple*
easy
|
30 min
|
Share
Write a program that asks the user to enter the number of months studied at wedevx.co If the numOfMonths is more than or equal to 6 months, the program should print out Congratulations on your offer from Apple otherwise do nothing Required Variables

plain
Copy code
___ numOfMonths = ____;
Expected Result:

plain
Copy code
Please enter number of months actively studied at wedevx.co:
Congratulations on your offer from Apple
OR

plain
Copy code
Please enter number of months actively studied at wedevx.co:
 */

public class Week2_26_3OfferFromApple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter number of months actively studied at wedevx.co:");

        int numOfMonths = sc.nextInt();

        if(numOfMonths >= 6) {
            System.out.println("Congratulations on your offer from Apple");
        }
    }
}
