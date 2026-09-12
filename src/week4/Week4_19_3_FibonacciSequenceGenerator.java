package week4;

/*
4.19.5 Fibonacci Sequence Generator
easy
|
30 min
|
Share
Create a Java static method generateFibonacciSequence() that takes an int number as parameter generates and prints the first n numbers in the Fibonacci sequence using a for loop. The Fibonacci sequence is defined as follows: The first two numbers in the sequence are 0 and 1. Every subsequent number is the sum of the two preceding ones (e.g., 0, 1, 1, 2, 3, 5, 8, 13, ...).

Example:
Parameters:

plain
Copy code
int n = 10
Return: void Output:

plain
Copy code
0 1 1 2 3 5 8 13 21 34
 */

public class Week4_19_3_FibonacciSequenceGenerator {
    public static void main(String[] args) {

    }

    public static void generateFibonacciSequence(int number) {

        int first = 0;
        int second = 1;

        for (int counter = 0; counter < number; counter++) {

            System.out.println(first + " ");

            int next = first + second;

            first = second;
            second = next;
        }
    }
}
