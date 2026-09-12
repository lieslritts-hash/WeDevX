package week4;

/*
4.9.4 Password Length Validator
easy
|
30 min
|
Share
Create a program with a static method named validatePasswordLength() that takes a password as a String parameter. The program should repeatedly prompt the user to input a password until it meets the following criteria: the password must be more than 8 characters in length. Use a while loop with a boolean condition to enforce this rule.

Example:
Input:

plain
Copy code
EasyPass
HardPassword@!#
Return:

plain
Copy code
Please enter a password:
Password must be more than 8 characters. Please try again:
Password is valid
 */

import java.util.Scanner;

public class Week4_9_3_PasswordLengthValidator {
    public static void main(String[] args) {

        validatePasswordLength("EasyPass");
        validatePasswordLength("HardPassword@!#");

    }

    public static String validatePasswordLength(String password) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter a password:");

        boolean isValid = password.length() > 8;

        while (!isValid) {
            System.out.println("Password must be more than 8 characters. Please try again:");
            password = sc.nextLine();
            isValid = password.length() > 8;
        }

        System.out.println("Password is valid");
        return password;
    }
}