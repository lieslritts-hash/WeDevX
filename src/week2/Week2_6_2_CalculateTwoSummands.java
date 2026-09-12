package week2;

import java.util.Scanner;

/*
2.6.2 Calculate Two Summands*
easy
|
30 min
|
Share
Write a program that uses a Scanner object to read two int
numbers from the user. The program should then perform the
addition operation on the numbers and print the result.

Example of result:
plain
Copy code
Enter the first number:
1
Enter the second number:
2
The result is 3

Enter the first number:
90
Enter the second number:
1
The result is 91

Enter the first number:
-20
Enter the second number:
40
The result is 20

 */

public class Week2_6_2_CalculateTwoSummands {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first number:");
        int firstNumber = input.nextInt();
        System.out.println(firstNumber);

        System.out.println("Enter the second number:");
        int secondNumber = input.nextInt();
        System.out.println(secondNumber);

        int result = firstNumber + secondNumber;
        System.out.printf("The result is %d", result);

    }
}
