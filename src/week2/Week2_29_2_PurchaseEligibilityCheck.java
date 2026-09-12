package week2;

import java.util.Scanner;


/*
2.29.3 Purchase eligibility check
easy
|
30 min
|
Share
Write a program that checks if a customer is eligible to make a purchase and prints a message if they are not.

Ask the user to Enter your payment information (credit/debit/PayPal):

Ask the user to Enter your age:

Look at examples and handle the conditions when user is younger than 18 and when user enters not listed payment method.

Example #1:
If the user is 18 or older and the payment information is one of credit/debit/PayPal Input:

plain
Copy code
debit
20
Output:
plain
Copy code
Enter your payment information (credit/debit/PayPal):
Enter your age:
You are eligible to make a purchase. Thank you for your business!
Example #2:
If the user is younger than 18, print out Input:

plain
Copy code
debit
14
Output:
plain
Copy code
Enter your payment information (credit/debit/PayPal):
Enter your age:
You will be able to make a purchase in 4 years
where 4 is the 18 - user's age

Example #3:
If the user's payment info is not of one credit/debit/PayPal Input:

plain
Copy code
Western Union
20
Output:
plain
Copy code
Enter your payment information (credit/debit/PayPal):
Enter your age:
Unsupported payment method.

 */

public class Week2_29_2_PurchaseEligibilityCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your payment information (credit/debit/PayPal):");
        String paymentInformation = sc.nextLine();

        System.out.println("Enter your age:");
        int age = sc.nextInt();

        if((age >= 18) &&
                (paymentInformation.equals("credit")
                        || paymentInformation.equals("debit")
                        || paymentInformation.equals("PayPal"))) {

            System.out.println("You are eligible to make a purchase. Thank you for your business!");
        }

        if(age < 18) {

            System.out.println("You will be able to make a purchase in " + (18 - age) + " years");
        }

        if(!paymentInformation.equals("credit")
                && !paymentInformation.equals("debit")
                && !paymentInformation.equals("PayPal")) {

            System.out.println("Unsupported payment method.");
        }
    }
}
