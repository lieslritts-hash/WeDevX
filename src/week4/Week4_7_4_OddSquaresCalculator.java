package week4;

/*
4.7.4 Odd Squares Calculator
easy
|
30 min
|
Share
Create a static method named printOddSquares() that takes an integer N as a parameter. The method should calculate and print the squares of all odd integers from 1 to N (inclusive). The output should be in the format: Number - Square Return Type: void

Example:
Parameters:

plain
Copy code
int number = 5
Output:

plain
Copy code
1 - 1
3 - 9
5 - 25
 */

public class Week4_7_4_OddSquaresCalculator {
    public static void main(String[] args) {

        printOddSquares(5);

    }

    public static void printOddSquares(int N) {

        int counter = 1;

        while (counter <= N) {
            int square = counter * counter;
            System.out.println(counter + " - "  + square);
            counter += 2;
        }
    }
}
