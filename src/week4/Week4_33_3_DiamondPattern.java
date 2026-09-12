package week4;

/*
4.33.4 Diamond pattern*
easy
|
30 min
|
Share
Description: Create a method called printDiamond() that takes an integer "n" and a character "symbol" as input and prints the following diamond pattern to the console: Params:

A positive odd integer n (1 <= n < 50), representing the number of rows in the diamond.

A character symbol, representing the character to use for printing the diamond.

Input: 5 * Output:

plain
Copy code
*
 ***
*****
 ***
  *
The program should print the diamond pattern to the console, with each row separated
by a newline character ('\n'). Additionally, the program should validate the user input and
 display an error message if the input is invalid. Input: 6 * Output:

plain
Copy code
Invalid input! n must be a positive odd integer less than 50.
 */
//write your static method here. No need to add Main class or main method.


public class Week4_33_3_DiamondPattern {
    public static void main(String[] args) {

        printDiamond(5, '*');
        printDiamond(6, '*');

    }

    public static void printDiamond(int n, char symbol) {

        if (n <= 0 || n >= 50 || n % 2 == 0) {
            System.out.println("Invalid input! n must be a positive odd integer less than 50.");
            return;
        }

        // Top half
        for (int i = 1; i <= n; i += 2) {

            for (int j = 1; j <= (n - i) / 2; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print(symbol);
            }

            System.out.println();
        }

        // Bottom half
        for (int i = n - 2; i >= 1; i -= 2) {

            for (int j = 1; j <= (n - i) / 2; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print(symbol);
            }

            System.out.println();
        }
    }
}