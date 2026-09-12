package week4;

/*
4.32.5 Print centered triangle with range
easy
|
30 min
|
Share
Exercise Description: Print Centered Triangle Pattern Write a Java method named printTrianglePattern that takes a positive integer n as a parameter. The method should print a centered triangle pattern with n rows, where each row contains an increasing number of characters of the asterisk. Method Signature:

plain
Copy code
public static void printTrianglePattern(int n)
Description:

The method printCenteredTrianglePattern should print a centered triangle pattern with n rows.

Each row should contain an increasing number of characters of the specified character c.

The triangle should be centered within the output.

Example: For n = 5, the output should look like this:

plain
Copy code
*
   ***
  *****
 *******
*********
For n = 7, the output should look like this:

plain
Copy code
*
     ***
    *****
   *******
  *********
 ***********
*************
 */
//write your static method here. No need to add Main class or main method.


public class Week4_32_5_PrintCenteredTriangleWithRange {
    public static void main(String[] args) {

        printTrianglePattern(5);
        printTrianglePattern(7);

    }

    public static void printTrianglePattern(int n) {

        for (int i = 0; i < n; i++) {

            // Print spaces
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }

            // Print stars
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}