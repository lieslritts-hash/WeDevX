package week4;

/*
4.12.3 Calculator App with Menu
easy
|
30 min
|
Share
Create a Java program for a simple calculator with a menu-driven interface. The program should use a while loop and a switch statement to repeatedly display a menu of options to the user. The menu should include the following choices:

Addition

Subtraction

Multiplication

Division

Exit

The program should prompt the user to select an option by entering the corresponding number as double. Based on the user's choice, the program should then prompt the user to input two numbers (operands). After receiving the operands, perform the selected arithmetic operation and display the result to the user. Continue displaying the menu and performing calculations until the user chooses to exit.

Example:
Input:

plain
Copy code
1 // for addition
5 // first number
3 // second number
0 // exit
Output:

plain
Copy code
Calculator Menu:
1. Addition
2. Subtraction
3. Multiplication
4. Division
0. Exit
Choose an option:
Enter first number:
Enter second number:
Result: 5 + 3 = 8
Calculator Menu:
1. Addition
2. Subtraction
3. Multiplication
4. Division
0. Exit
Exiting the calculator. Goodbye!
 */

import java.util.Scanner;

public class Week4_12_3_CalculatorAppWithMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int menuItem = -1;

        while (menuItem != 0) {

            System.out.println("Calculator Menu:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("0. Exit");
            System.out.println("Choose an option:");

            menuItem = sc.nextInt();

            switch (menuItem) {

            case 1:
                System.out.println("Enter first number:");
                double num1 = sc.nextDouble();

                System.out.println("Enter second number:");
                double num2 = sc.nextDouble();

                System.out.printf("Result: %.1f + %.1f = %.1f", num1, num2, (num1 + num2));
                break;

            case 2:
                System.out.println("Enter first number:");
                num1 = sc.nextDouble();

                System.out.println("Enter second number:");
                num2 = sc.nextDouble();

                System.out.printf("Result: %.1f - %.1f = %.1f", num1, num2, (num1 - num2));
                break;

            case 3:
                System.out.println("Enter first number:");
                num1 = sc.nextDouble();

                System.out.println("Enter second number:");
                num2 = sc.nextDouble();

                System.out.printf("Result: %.1f * %.1f = %.1f", num1, num2, (num1 * num2));
                break;

            case 4:
                System.out.println("Enter first number:");
                num1 = sc.nextDouble();

                System.out.println("Enter second number:");
                num2 = sc.nextDouble();

                System.out.printf("Result: %.1f / %.1f = %.1f", num1, num2, (num1 / num2));
                break;

            case 0:
                System.out.println("Exiting the calculator. Goodbye!");
                break;
            }

        }

    }
}
