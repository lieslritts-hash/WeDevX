package week4;

/*
4.16.1 Calculate two numbers*
easy
|
30 min
|
Share
Description: The program should prompt the user to input two numbers and an operation and output the result of the operation. The program should keep running until the user chooses to quit. Input: The user should input two numbers and an operation. Output: The program should output the result of the operation. If the user enters an invalid input or an operation that is not supported, the program should output an error message and prompt the user to input valid data again. Sample Output:

plain
Copy code
Enter first number: 10
Enter second number: 5
Enter operator (+, -, *, /): +
Result: 15.0
Do you want to continue? (y/n) y

Enter first number: 13.5
Enter second number: 2.0
Enter operator (+, -, *, /): *
Result: 27.0
Do you want to continue? (y/n) y

Enter first number: 5.0
Enter second number: 9.0
Enter operator (+, -, *, /): -
Result: -4.0
Do you want to continue? (y/n) y

Enter first number: 2
Enter second number: 0
Enter operator (+, -, *, /): /
Result: Infinity
Do you want to continue? (y/n) y

Enter first number: 10.0
Enter second number: 2
Enter operator (+, -, *, /): &
Invalid operator!
Do you want to continue? (y/n) n
there should be an empty line after each iteration.
 */

import java.util.Scanner;

public class Week4_16_1_CalculateTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double num1;
        double num2;
        String operator;
        double result;

        String continueChoice;

        do {
            System.out.println("Enter first number:");
            num1 = sc.nextDouble();

            System.out.println("Enter second number:");
            num2 = sc.nextDouble();

            System.out.println("Enter operator (+, -, *, /):");
            operator = sc.next();

            if (operator.equals("+")) {
                result = num1 + num2;
                System.out.println("Result: " + result);

            } else if (operator.equals("-")) {
                result = num1 - num2;
                System.out.println("Result: " + result);
            } else if (operator.equals("*")) {
                result = num1 * num2;
                System.out.println("Result: " + result);
            } else if (operator.equals("/")) {
                result = num1 / num2;
                System.out.println("Result: " + result);
            } else if (num2 == 0 && operator.equals("/")) {
                System.out.println("Result: Infinity");
            } else{
            System.out.println("Invalid operator!");
        }
        System.out.print("Do you want to continue? (y/n) ");
        continueChoice = sc.next();

        System.out.println();
        System.out.println();

        } while (continueChoice.equalsIgnoreCase("y"));
    }
}
