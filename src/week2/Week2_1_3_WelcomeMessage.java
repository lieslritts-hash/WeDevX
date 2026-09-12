package week2;

import java.util.Scanner;

/*
2.1.3 Welcome Message
easy
|
30 min
|
Share
Write a program that asks the user to enter their fullname
and company they want to work for. Then it prints out the
following message:

plain
Copy code
Please enter your full name:
Please enter your dream company:
Welcome X to Y!
Where X is the fullname and Y is the company.
 */

public class Week2_1_3_WelcomeMessage {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your full name:");
        String fullName = input.nextLine();

        System.out.println("Please enter your dream company:");
        String company = input.nextLine();

        System.out.println("Welcome " + fullName + " to " + company + "!");
    }
}
