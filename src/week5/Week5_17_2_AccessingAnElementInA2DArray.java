package week5;

/*
5.17.3 Accessing an Element in a 2D Array*
easy
|
30 min
|
Share
Write a method accessElement2D() that prints out the element at
the specified row and column of a 2D array. Parameters:

int[][] array: The 2D array to access.

int row: The row of the element to access.

int column: The column of the element to access.

Example of parameters:
plain
Copy code
array = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}
row = 2
column = 1
plain
Copy code
1  2  3
array = 4  5  6
        7  8  9
### **Example of output:**
plain
Copy code
4
 */
//write your static method here. No need to add Main class or main method.

public class Week5_17_2_AccessingAnElementInA2DArray {
    public static void main(String[] args) {

        int[][] array = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int result = accessElement2D(array, 2, 2);

        System.out.println(result);
    }

    public static int accessElement2D(int[][] array, int row, int column) {
        return array[row - 1][column - 1];
    }
}
