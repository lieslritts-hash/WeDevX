package week4;
/*
4.33.2 Print multiple X*
easy
|
30 min
|
Share
Description: Create a method called printMultipleX() that takes two parameters - a positive integer "n" and a positive integer "m". The method should print "X" characters "n" times in a row, and repeat this pattern "m" times in a line. Params: A positive integer "n" representing the number of "X" characters to print in a row. A positive integer "m" representing the number of times to repeat the pattern in a line. Return: None. The method should print the "X" pattern to the console. For example, if n is 3 and m is 4: Input: 3 4 Output:

plain
Copy code
XXX XXX XXX XXX
 */
//write your static method here. No need to add Main class or main method.

//write your static method here. No need to add Main class or main method.
//1.  Outer loop -> rows, start with 0, end on input - 1 (println("") == print("\n")
//2.  Inner loop -> columns, start with 0, end on input - 1
//3. Logic:
// Positive line: inner counter == outer counter -> print "*", else " "
// Negative line: inner counter + outer counter == num - 1
// i = 0
// j = 4
// 0 + 4 == 5 - 1
//
// i = 2
// j = 2
// 2 + 2 == 5 - 1
//
// i = 3
// j = 1
// 3 + 1 == 5 - 1
//
// i = 4
// j = 0
// 4 + 0 == 5 - 1
// fixed condition

public class Week4_33_1_PrintMultipleX {
    public static void main(String[] args) {

       printMultipleX(3,4);

    }

    public static void printMultipleX(int n, int m) {

        for (int i = 0; i < m; i++) {

            for (int j = 0; j < n; j++) {
                System.out.print("X");
            }

            System.out.print(" ");
        }

        System.out.println();
    }
}