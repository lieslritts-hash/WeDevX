package week2;

import java.util.Scanner;

/*
2.29.1 Amazon delivery eligibility check*
easy
|
30 min
|
Share
Write a program that checks if a customer is eligible for
free delivery and prints a message if they are. Ask the user
for their total purchase amount and the country they order.

If the total purchase amount is more than or equal to $120.00
and the shipment Country is one of the USA, Canada, Mexico, then
 print out You are eligible for a free shipment If the total
 purchase amount is less than to $120.00 and the shipment
 Country is one of the USA, Canada, Mexico then print out
 Spend $X more to be eligible for a free shipment Where X is
 the difference between $120 and purchaseAmount. If the
 shipment Country is one not of the USA, Canada, Mexico then
 print out We currently do not support shipments to Y Where Y
 is the country of shipment.

Required variables:

plain
Copy code
_____ shipmentCountry = _____;
_____ totalPurchaseAmount = ____;
Example #1:
Input:

plain
Copy code
USA
125.00
Output:

plain
Copy code
Enter your shipment country:
Enter your total purchase amount:
You are eligible for a free shipment
Example #2:
Input:

plain
Copy code
Mexico
100.00
Output:

plain
Copy code
Enter your shipment country:
Enter your total purchase amount:
Spend $20.0 more to be eligible for a free shipment
Example #3:
Input:

plain
Copy code
France
50.00
Output:

plain
Copy code
Enter your shipment country:
Enter your total purchase amount:
We currently do not support shipments to France
 */

public class Week2_29_1_AmazonDeliveryEligibilityCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your shipment country:");
        String shipmentCountry = sc.nextLine();

        System.out.println("Enter your total purchase amount:");
        double totalPurchaseAmount = sc.nextDouble();

        if((shipmentCountry.equals("USA")
                || shipmentCountry.equals("Canada")
                || shipmentCountry.equals("Mexico"))
                && totalPurchaseAmount >= 120.00) {

            System.out.println("You are eligible for a free shipment");
        }

        if((shipmentCountry.equals("USA")
                || shipmentCountry.equals("Canada")
                || shipmentCountry.equals("Mexico"))
                && totalPurchaseAmount < 120.00) {

            System.out.println("Spend $" + (120 - totalPurchaseAmount)
                    + " more to be eligible for a free shipment");
        }

        if(!shipmentCountry.equals("USA")
                && !shipmentCountry.equals("Canada")
                && !shipmentCountry.equals("Mexico")) {

            System.out.println("We currently do not support shipments to " + shipmentCountry);
        }
    }
}
