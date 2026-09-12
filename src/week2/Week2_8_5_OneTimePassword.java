package week2;

import java.util.Scanner;

/*
2.8.5 One Time Password
easy
|
30 min
|
Share
Write a program that asks the user to generate an OTP number to log in and enter the number again. Compare two numbers using ==. The program should print out the following: Expected Output:

plain
Copy code
Please generate OTP number to log in:
Please repeat the OTP number:
OTP matched: X
Where X is a boolean value from the comparison.

 */

public class Week2_8_5_OneTimePassword {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please generate OTP number to log in:");
        int OTPNum = input.nextInt();

        System.out.println("Please repeat the OTP number:");
        int repeatOTPNum = input.nextInt();

        boolean OTPMatch = OTPNum == repeatOTPNum;

        System.out.println("OTP matched: " + OTPMatch);
    }
}
