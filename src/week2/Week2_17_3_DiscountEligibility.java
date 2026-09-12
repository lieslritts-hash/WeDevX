package week2;

import java.util.Scanner;

/*
2.17.3 Discount eligibility
easy
|
30 min
|
Share
Write a program that determines if a customer is eligible
for a discount based on their loyalty status and purchase
amount. Ask the user to input their loyaltyStatus and
purchaseAmount. If a customer has a loyalty status of "gold"
and their purchase amount is greater than or equal to $100.00,
they are eligible for a discount. If a customer has a loyalty
status of "silver" and their purchase amount is greater than or
equal to $50.00, they are eligible for a discount. Use the && and
 || operators to combine the different conditions.

plain
Copy code
_____ loyaltyStatus = ____;
_____ purchaseAmount = ____;
_____ isEligibleForDiscount = ____;
Expected output:

plain
Copy code
Please enter your loyalty status:
Please enter your purchase amount:
You are eligible for a discount: X
Where X is a true or false value. Note: loyalty status value
should be all lowercase.
 */

public class Week2_17_3_DiscountEligibility {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter your loyalty status:");
        String loyaltyStatus = sc.nextLine();

        System.out.println("Please enter your purchase amount:");
        double purchaseAmount = sc.nextDouble();

        boolean isEligibleForDiscount = (loyaltyStatus.equals("gold") && (purchaseAmount >= 100.00)) || (loyaltyStatus.equals("silver")) && (purchaseAmount >= 50.00);

        System.out.println("You are eligible for a discount: " + isEligibleForDiscount);
    }
}
