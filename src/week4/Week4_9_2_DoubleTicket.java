package week4;

/*
4.9.2 Double Ticket*
easy
|
30 min
|
Share
Write a Java program that starts by setting the ticket fine to $100.00. The program should then prompt the police officer with the message "Do you want to double the ticket fine?" and continue to prompt them with this message until they enter false. If the police officer enters true, the program should double the ticket fine and display the new value. If they enter false, the program should terminate and display the final ticket fine. Expected output: Input true true false

plain
Copy code
The ticket fine is $100.00
Do you want to double the ticket fine?
The ticket fine is $200.00
Do you want to double the ticket fine?
The ticket fine is $400.00
Do you want to double the ticket fine?
 */

import java.util.Scanner;

public class Week4_9_2_DoubleTicket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double fine = 100.00;
        boolean answer = true;

        while (answer) {
            System.out.printf("The ticket fine is $%.2f%n", fine);
            System.out.println("Do you want to double the ticket fine?");

            answer = sc.nextBoolean();

            if (answer) {
                fine = fine * 2;
            }
        }
        sc.close();
    }
}
