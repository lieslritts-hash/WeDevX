package week5;

/*
5.17.4 Sum of Row or Column (with solution)
easy
|
30 min
|
Share
Create a static method named calculateSum() that takes three
parameters: a 2D integer array matrix (int[][]), a String that can take
only 2 options indicating whether to calculate the sum of a row or column,
and an int index representing the row or column number. The method should
calculate and return the sum of the specified row or column as int. If the
provided index is out of bounds (less than 0 or greater than the length of the array),
return 0.

Example #1:
Parameters:

plain
Copy code
{ {1, 2, 3},
int[][] matrix =   {4, 5, 6},
                   {7, 8, 9} }
String rowOrColumnt = "column"
int index = 3
Return: int

plain
Copy code
18
Example #2:
Parameters:

plain
Copy code
{ {1, 2, 3},
int[][] matrix =   {4, 5, 6},
                   {7, 8, 9} }
String rowOrColumnt = "row"
int index = 3
Return: int

plain
Copy code
24
Example #3:
Parameters:

plain
Copy code
{ {1, 2, 3},
int[][] matrix =   {4, 5, 6},
                   {7, 8, 9} }
String rowOrColumnt = "row"
int index = 4
Return: int

plain
Copy code
0
Video solution:
https://youtu.be/VNKJOiCY9C8
 */
//write your static method here. No need to add Main class or main method.

// 1. 2 variables that keep the number of rows and columns
// 2. separate logic for column and row (type)
// 3. if type is wrong, or index < 0, or index > arrays length -> return 0

public class Week5_17_3_SumOfRowOrColumn {
    public static void main(String[] args) {

    }

    public static int calculateSum(int[][] matrix, String type, int index) {
        int numRows = matrix.length;
        int numCols = matrix[0].length;

        if (type.equals("row") && index > 0 && index <= numRows) {
            int sum = 0;
            for (int col = 0; col < numCols; col++) {
                sum += matrix[index - 1][col];
            }
            return sum;
        } else if (type.equals("column") && index > 0 &&  index <= numCols) {
            int sum = 0;
            for (int row = 0; row < numRows; row++) {
                sum += matrix[row][index -1];
            }
            return sum;
        } else {
            return 0;
        }
    }
}
