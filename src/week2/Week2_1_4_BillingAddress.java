package week2;

import java.util.Scanner;

/*
2.1.4 Billing Address
easy
|
30 min
|
Share
Write a program that asks the user to enter street address,
city, state and zipcode as a String and then prints out the
following message:

plain
Copy code
Please enter your street address:
Please enter city:
Please enter state:
Please enter zipcode:
Entered Billing Address: X, Y, Z, J
Where X is street address, Y is city, Z is state, J is
zipcode. Note: use printf() method and format specifiers
to format the message.
 */

public class Week2_1_4_BillingAddress {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your street address:");
        String streetAddress = input.nextLine();

        System.out.println("Please enter city:");
        String city = input.nextLine();

        System.out.println("Please enter state:");
        String state = input.nextLine();

        System.out.println("Please enter zipcode:");
        String zipcode = input.nextLine();

        System.out.println("Entered Billing Address: " + streetAddress + ", " + city + ", " + state + ", " + zipcode);
    }
}
