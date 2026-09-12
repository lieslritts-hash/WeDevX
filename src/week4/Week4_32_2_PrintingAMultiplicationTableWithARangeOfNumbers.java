package week4;

/*
4.32.2 Printing a Multiplication Table with a Range of Numbers*
easy
|
30 min
|
Share
Write a method calculateMultiplicationTable() that prints a multiplication table with a range of numbers. Parameters: int start: The starting number of the multiplication table. int end: The ending number of the multiplication table. Return: void

Example:
Input:

plain
Copy code
start = 3
end = 10
Output:

plain
Copy code
3 * 3 = 9
3 * 4 = 12
...
10 * 9 = 90
10 * 10 = 100
 */
//write your static method here. No need to add Main class or main method.

public class Week4_32_2_PrintingAMultiplicationTableWithARangeOfNumbers {
    public static void main(String[] args) {

        calculateMultiplicationTable(3, 10);
    }

    public static void calculateMultiplicationTable(int start, int end) {

        for (int i = start; i <= end; i++) {

            for (int j = start; j <= end; j++) {
                System.out.println(i + " * " + j + " = " + (i * j));

            }
        }
    }
}
