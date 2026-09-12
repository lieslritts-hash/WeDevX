package week4;

/*
4.16.2 User Registration with Validation*
easy
|
30 min
|
Share
Create a Java program for user registration with password validation. Implement the following steps:

Use a static method named validatePassword() to handle the registration password.

Take the input from user.

Check if the password meets the following criteria: at least 8 characters long.

If the password does not meet the criteria, inform the user and ask them to enter a new password.

Once a valid password is provided, display a success message.

Then return a message indicating successful registration.

Return Type: void

Example #1:
Input

plain
Copy code
EasyPass
Return:

plain
Copy code
Enter a password:
Registration successful!
Example #2:
Input

plain
Copy code
passw
HardPasswordWEDEVX2023
Return:

plain
Copy code
Enter a password:
Password must be at least 8 characters long.
Enter a password:
Registration successful!
 */

import java.util.Scanner;
public class Week4_16_2_UserRegistrationWithValidation {
    public static void main(String[] args) {

        validatePassword("EasyPass");
        validatePassword("passw");
    }

    public static void validatePassword(String password) {
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Enter a password:");
            password = sc.nextLine();

            if (password.length() < 8) {
                System.out.println("Password must be at least 8 characters long.");
            }

        } while (password.length() < 8);

        System.out.println("Registration successful!");
    }
}
