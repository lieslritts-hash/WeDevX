package week3;

import java.util.Scanner;

/*
3.17.2 Calculator*
easy
|
30 min
|
Share
Write a Java program that prompts the user to enter two
numbers and an operator (+, -, *, /). The program should
then use a switch statement to perform the corresponding
arithmetic operation on the two numbers, and output the
result to the console. For example, if the user inputs 5, 3,
and "+", the program should output 8, which is 5+3. If the
user inputs 10, 2, and "*", the program should output 20 which
is 10*2. If the user inputs an invalid operator, the program
should print an error message and prompt the user to enter a
valid operator. Your program should use appropriate variable names
and include comments to explain the logic behind the switch statement.
Test your program with various inputs to ensure it works correctly.

Hint: Use the Scanner class to read input from the console, and the charAt()
method to extract the operator character from the input string. Sample Output 1: 5 3 +

plain
Copy code
Enter first number:
Enter second number:
Enter operator (+, -, *, /):
Result: 8.0
Sample Output 2: 10 2 *

plain
Copy code
Enter first number: 10
Enter second number: 2
Enter operator (+, -, , /):
Result: 20.0
Negative Scenario: 8 2 &

plain
Copy code
Enter first number:
Enter second number:
Enter operator (+, -, *, /):
Error: Invalid operator

 */

public class Week3_17_2_Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number:");
        int num1 = sc.nextInt();

        System.out.println("Enter second number:");
        int num2 = sc.nextInt();

        System.out.println("Enter operator (+, -, *, /):");
        char operator = sc.next().charAt(0);

        switch (operator) {
            case '+' :
                System.out.printf("Result: %.1f", num1 + num2);
                break;
            case '-' :
                System.out.printf("Result: %.1f", num1 - num2);
                break;
            case '*' :
                System.out.printf("Result: %.1f", num1 * num2);
                break;
            case '/' :
                System.out.printf("Result: %.1f", num1 / num2);
                break;
            default :
                System.out.println("Error: Invalid operator");
        }
    }

    public static class Class3_22_2 {
        public static void main(String[] args) {
            Class3_22_2 object = new Class3_22_2();
            object.displayInfo();
        }

        public void displayInfo(){
            System.out.println("Title: Leonardo da Vinci");
            System.out.println("Author: Isaacson, Walter");
            System.out.println("Year published: October 17, 2017");
        }
    }
}
