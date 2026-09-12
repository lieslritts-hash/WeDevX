package week4;

/*
4.11.3 Square Numbers
easy
|
30 min
|
Share
Write a program that uses a while loop to print all the square numbers from 1 to a given number (int). You can use the Compound Operator to find the square of the number. If the given number is less than 1, then print out the message The number should be positive.

Example of output (don't print the given number into the first line):
plain
Copy code
Enter a number: 10
The square numbers from 1 to 10 are:
1
4
9
16
25
36
49
64
81
100

Enter a number: -5
The number should be positive
 */

import java.util.Scanner;
public class Week4_11_3_SquareNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");

        int number = sc.nextInt();

        if (number < 1) {
            System.out.println("The number should be positive");
        } else {
            System.out.println("The square numbers from 1 to " + number + " are:");

            int index = 1;

            while (index <= number) {
                int numberSquared = index * index;
                System.out.println(numberSquared);
                index++;
            }
        }
    }
}
