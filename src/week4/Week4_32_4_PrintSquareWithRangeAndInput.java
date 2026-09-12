package week4;

/*
4.32.4 Print square with range and input
easy
|
30 min
|
Share
Exercise Description: Print Square Pattern Write a Java method named printSquarePattern that takes a positive integer n and a character c as parameters. The method should print a hollow square pattern with n rows and n columns, using the specified character to draw the borders of the square. Use at least one nested loop in the solution. Method Signature:

plain
Copy code
public static void printSquarePattern(int n, char c)
Description:

The method printSquarePattern should print a hollow square pattern with n rows and n columns using the specified character c.

The outermost border of the square should be filled with the specified character c, while the inner cells should be left empty.

Each row should consist of n characters, forming a hollow square shape.

Example: For n = 5 and `c = '*', the output should look like this:

plain
Copy code
*****
*   *
*   *
*   *
*****
Note

When testing, provide params to the console like this:
plain
Copy code
int,char (no spaces)
 */
//write your static method here. No need to add Main class or main method.


public class Week4_32_4_PrintSquareWithRangeAndInput {
    public static void main(String[] args) {

        printSquarePattern(5, '*');

    }

    public static void printSquarePattern(int n, char c) {

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {

                if (i == 0 || i == n - 1 || j == 0 || j == n - 1) {
                    System.out.print(c);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
