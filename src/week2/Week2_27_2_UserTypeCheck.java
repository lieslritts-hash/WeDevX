package week2;

import java.util.Scanner;

/*
2.27.2 User Type Check*
easy
|
30 min
|
Share
Write a program that asks the user: What is your user type? - then checks a user's type from user's input and prints a message based on their level of access. Get input from the user by using Scanner.

Available user types:
admin

mentor

free trial users

paid users

If the user is admin, then print out:

plain
Copy code
What is your user type?
Access to all features and functionalities of the platform
Ability to create and manage user accounts
Ability to adjust platform settings and configurations
For mentor:

plain
Copy code
What is your user type?
Ability to communicate with mentees through the platform
Ability to track and analyze mentee progress and performance
For free trial users:

plain
Copy code
What is your user type?
Limited access to certain features, functionalities and support of the platform
Ability to explore and experiment with the platform's basic features
For paid users:

plain
Copy code
What is your user type?
Full access to all features and functionalities of the platform
Access to premium support and resources
Ability to collaborate and communicate with other users on the platform
For wrong input:

plain
Copy code
What is your user type?
User's type is wrong. Try again
 */

public class Week2_27_2_UserTypeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("What is your user type?");
        String type = sc.nextLine();

        if(type.equals("admin")) {
            System.out.println("Access to all features and functionalities of the platform");
            System.out.println("Ability to create and manage user accounts");
            System.out.println("Ability to adjust platform settings and configurations");
        }

        if(type.equals("mentor")) {
            System.out.println("Ability to communicate with mentees through the platform");
            System.out.println("Ability to track and analyze mentee progress and performance");
        }

        if(type.equals("free trial users")) {
            System.out.println("Limited access to certain features, functionalities and support of the platform");
            System.out.println("Ability to explore and experiment with the platform's basic features");
        }

        if(type.equals("paid users")) {
            System.out.println("Full access to all features and functionalities of the platform");
            System.out.println("Access to premium support and resources");
            System.out.println("Ability to collaborate and communicate with other users on the platform");
        }

        if(type.equals("freemium")) {
            System.out.println("User's type is wrong. Try again");
        }
    }
}
