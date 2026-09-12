package week4;

/*
4.22.2 Calculator with Break
easy
|
30 min
|
Share
Create a simple calculator program that allows the user to perform basic mathematical operations (addition, subtraction, multiplication, division). The program should use a loop to continuously accept user input for mathematical operations and operands. The user should be able to input an operator (+, -, *, /) followed by two numbers. The program should then perform the corresponding operation and display the result. However, there should be an option for the user to exit the calculator by typing "q" or "quit". When the user enters "q" or "quit", the program should use the break statement to terminate the loop and display a goodbye message. Here is the expected workflow:

Display a message asking the user to enter a mathematical operation (+, -, *, /) or type "q" to quit.

If the user enters "q" or "quit", display a goodbye message and exit the loop.

If the user enters a valid operator, prompt the user to enter two numbers.

Perform the requested operation on the two numbers and display the result.

Repeat the process, allowing the user to perform more calculations or exit by typing "q" or "quit".

Examples:
Input:
3
q
Copy code
/
Hint
Use method .next() instead of .nextLine() to take an input of operator.
 */

import java.util.Scanner;

public class Week4_22_2_CalculatorWithBreak {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("Enter a mathematical operation (+, -, *, /) or type \"q\" to quit:");
            String mathematicalOperator = sc.next();

            if (mathematicalOperator.equalsIgnoreCase("q")
                    || mathematicalOperator.equalsIgnoreCase("quit")) {

                System.out.println("Goodbye!");
                break;
        }
            System.out.println("Enter the first number:");
            double num1 = sc.nextInt();

            System.out.println("Enter the second number:");
            double num2 = sc.nextInt();

            if (mathematicalOperator.equals("+")) {
                System.out.println("Result: " + (num1 + num2));

            } else if (mathematicalOperator.equals("-")) {
                System.out.println("Result: " + (num1 - num2));

            } else if (mathematicalOperator.equals("*")) {
            System.out.println("Result: " + (num1 * num2));

            } else if (mathematicalOperator.equals("/")) {
            System.out.println("Result: " + (num1 / num2));
            }
        }
    }
}
