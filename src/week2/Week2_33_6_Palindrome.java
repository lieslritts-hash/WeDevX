package week2;

import java.util.Scanner;

/*
2.33.6 Palindrome*
easy
|
30 min
|
Share
Write a program that prompts the user to enter a three-digit
number and checks if it is a palindrome (reads the same
backwards as forwards) Expected Result: Test Data: 121

plain
Copy code
Enter a three-digit number:
121 is a palindrome
Expected Result: Test Data: 222

plain
Copy code
Enter a three-digit number:
222 is a palindrome
Expected Result: Test Data: 123

plain
Copy code
Enter a three-digit number:
123 is not a palindrome
HINT: You can extract the first digit and last digit of
the three-digit number using integer division and modulus.
Then, you can compare these two digits to check if the number
is a palindrome. If the first and last digits are the same,
the number is a palindrome. Otherwise, it is not a palindrome.


 */

public class Week2_33_6_Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a three-digit number:");
        int number = sc.nextInt();

        int firstDigit = number / 100;
        int lastDigit = number % 10;

        if (firstDigit == lastDigit) {
            System.out.println(number + " is a palindrome");
        } else {
            System.out.println(number + " is not a palindrome");
        }
    }
}
