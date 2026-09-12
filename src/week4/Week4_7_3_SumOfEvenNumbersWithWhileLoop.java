package week4;

/*
4.7.3 Sum of Even Numbers with While Loop
easy
|
30 min
|
Share
Write a program that prompts the user to input a positive integer N. Using a while loop with an increment of 2, calculate the sum of all even numbers from 2 to N (inclusive). Display the message The sum of even numbers from 2 to N is X. If the user enters a number less than 2, display an error message Error: Please enter a positive integer more than 1

Example of input:
plain
Copy code
10
Example of output:
plain
Copy code
The sum of even numbers from 2 to 10 is 30
Example of input:
plain
Copy code
-6
Example of output:
plain
Copy code
Error: Please enter a positive integer more than 1
 */

import java.util.Scanner;

public class Week4_7_3_SumOfEvenNumbersWithWhileLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();

        if (N < 2) {
            System.out.println("Error: Please enter a positive integer more than 1");
        } else {
            int counter = 2;
            int sum = 0;

            while (counter <= N) {
                sum += counter;
                counter += 2;
            }

            System.out.println("The sum of even numbers from 2 to " + N + " is " + sum);
        }

        input.close();
    }
}