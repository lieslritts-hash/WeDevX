package week2;

import java.util.Scanner;

/*
2.38.4 Ticket Pricing*
easy
|
30 min
|
Share
Create a program that calculates ticket prices based on the
age of the customer. The program should take the age as input
and display the appropriate ticket price or discount message
according to the following criteria:

For ages 0 to 3: Children under 3 years old - FREE!

For ages 4 to 7: Children aged 4 to 7 - 50% discount!

For ages 8 to 18: Children aged 8 to 18 - 25% discount!

For ages 18 to 25 (with a student ID): Students receive a 50%
discount with a valid student ID!

For ages 65 and above: Seniors (65+) receive a 65% discount!

For all other ages: Regular price applies
 */

public class Week2_38_3_TicketPricing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int age = sc.nextInt();

        if (age >=0 && age <=3) {
            System.out.println("Children under 3 years old - FREE!");
        } else if (age >=4 && age <=7) {
            System.out.println("Children aged 4 to 7 - 50% discount!");
        } else if (age >=8 && age <=18) {
            System.out.println("Children aged 8 to 18 - 25% discount!");
        } else if (age >=18 && age <=25) {
            System.out.println("Students receive a 50% discount with a valid student ID!");
        } else if (age >= 65) {
            System.out.println("Seniors (65+) receive a 65% discount!");
        } else {
            System.out.println("Regular price applies");
        }
    }
}