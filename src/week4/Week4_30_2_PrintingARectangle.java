package week4;

/*
4.30.2 Printing a Rectangle*
easy
|
30 min
|
Share
Write a program that prints out a rectangle of stars, using
nested while loops. The program should use a method called
printRectangle() to print out a single column of stars. Parameters:
int rows: The number of rows in the rectangle. int columns: The
number of columns in the rectangle. Example of parameters: rows = 3
columns = 5 Return data type: void Example of output:

plain
Copy code
*****
*****
*****

 */
//write your static method here. No need to add Main class or main method.


public class Week4_30_2_PrintingARectangle {
    public static void main(String[] args) {

        printRectangle(3, 5);
    }

    public static void printRectangle(int rows, int columns) {

        int counter1 = 1;

        while (counter1 <= rows) {

            int counter2 = 1;

            while (counter2 <= columns) {
                System.out.print("*");
                counter2++;
            }
            System.out.println();
            counter1++;
        }
    }
}
