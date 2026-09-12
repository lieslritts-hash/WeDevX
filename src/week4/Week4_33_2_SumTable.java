package week4;

/*
4.33.3 Sum table*
easy
|
30 min
|
Share
Description: Create a method called printSumTable() that takes a positive integer n as input and prints a table of sums to the console. The table should have n rows and n columns, where each cell contains the sum of its row and column indices. Params:

A positive integer n representing the number of rows and columns in the table.
Return:

None. The method should print the table of sums to the console.
: The table should be printed in a tabular format, with each cell separated by a tab character ('\t').

Input: 5 Output:

plain
Copy code
1 2 3 4 5
2 3 4 5 6
3 4 5 6 7
4 5 6 7 8
5 6 7 8 9
Input: 3 Output:

plain
Copy code
1 2 3
2 3 4
3 4 5
 */
//write your static method here. No need to add Main class or main method.


public class Week4_33_2_SumTable {
    public static void main(String[] args) {

        printSumTable(5);

    }

    public static void printSumTable(int n) {

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n; j++) {
                System.out.print((i + j - 1) + "\t");
            }

            System.out.println();
        }
    }
}
