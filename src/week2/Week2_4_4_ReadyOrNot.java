package week2;

import java.util.Scanner;

/*
2.4.4 Ready or Not?
easy
|
30 min
|
Share
Write a program that prompts the user to enter true or false to indicate if they are ready to continue. The program should then print a message that input was handled.

Example of outputs:
Input: true Output:

plain
Copy code
Input "true" or "false" to indicate if you are ready to continue:
true
Welcome to the next part of the program!
Input: false Output:

plain
Copy code
Input "true" or "false" to indicate if you are ready to continue:
false
Welcome to the next part of the program!
Hint
Use escape characters to print out double quotes

Example:
plain
Copy code
System.out.println("\"Quote\", - said someone");
 */

public class Week2_4_4_ReadyOrNot {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Input \"true\" or \"false\" to indicate if you are ready to continue:");
        boolean readyContinue = input.nextBoolean();
        System.out.println(readyContinue);

        System.out.println("Welcome to the next part of the program!");
    }
}
