package week2;

import java.util.Scanner;

/*
2.31.2 Ticket Price Calculator*
easy
|
30 min
|
Share
Create a program that simulates a ticket price calculator
for a movie theater. The program will determine the ticket
cost based on the age of the visitor. The standard ticket
price is $10. However, if the visitor's age is less than 14
(exclusive), they qualify for a 50% discount. Print the
following messages.

Example #1:
Input:

java
Copy code
int age = 10
Output:

plain
Copy code
Enter your age:
Ticket price is $5
Example #2:
Input:

java
Copy code
int age = 14
Output:

plain
Copy code
Enter your age:
Ticket price is $10

 */

public class Week2_31_2_TicketPriceCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int price = 10;
        int discountedPrice = price / 2;

        System.out.println("Enter your age:");
        int age = sc.nextInt();

        if (age < 14) {
            System.out.println("Ticket price is $" + discountedPrice);
        } else {
            System.out.printf("Ticket price is $" + price);
        }
    }
}
