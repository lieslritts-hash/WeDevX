package week2;

import java.util.Scanner;

/*
2.29 If Statement with conditional Operators
Learn how to combine if statements with conditional
operators in Java to create more powerful and flexible
code in this practical lesson.
 */

public class Week2_29_IfStatementWithConditionalOperators {
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
