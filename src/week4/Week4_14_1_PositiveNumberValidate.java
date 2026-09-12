package week4;

/*
4.14.1 Positive Number Validate*
easy
|
30 min
|
Share
Create a program that validates user input to ensure it is a positive integer. You should implement a static method called validateInput() and uses a do-while loop to repeatedly prompt the user until they enter a valid positive integer. Here are the detailed steps for the validateInput method:

Display a prompt to the user to enter a positive integer.

Use a do-while loop to repeatedly perform the following steps:

Prompt the user for input.

Check if the integer is greater than 0.

If the input is valid, break out of the loop and print the message.

If the input is not valid, display an error message and continue to the next iteration of the loop.

Example:
Input:

plain
Copy code
validateInput()
-10
0
5
Output:

plain
Copy code
Enter a positive integer:
Error: Please enter a positive integer.
Error: Please enter a positive integer.
Valid number: 5
Return: void
 */

import java.util.Scanner;

public class Week4_14_1_PositiveNumberValidate {
    public static void main(String[] args) {

    }

    public static void validateInput() {
        Scanner sc = new Scanner(System.in);

        int number;

        System.out.println("Enter a positive integer:");

        do {
            number = sc.nextInt();

            if (number >0) {
                System.out.println("Valid number: " + number);
                break;
            } else {
                System.out.println("Error: Please enter a positive integer.");
            }

        } while (true);
    }
}
