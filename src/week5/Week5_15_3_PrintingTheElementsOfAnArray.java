package week5;

/*
5.15.3 Printing the Elements of an Array*
easy
|
30 min
|
Share
Write a printAllNumbersInArray() method that prints out the elements
of an array using a for-each loop. Parameters: int[] array: The array to print.
Return: void Example of parameters:

plain
Copy code
array = {1, 2, 3, 4, 5}
Example of output:

plain
Copy code
1
2
3
4
5
 */
//write your static method here. No need to add Main class or main method.


public class Week5_15_3_PrintingTheElementsOfAnArray {
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5};
        printAllNumbersInArray(array);

    }

    public static void printAllNumbersInArray(int[] array) {

        for (int number : array) {
            System.out.print(number + " \n");
        }
    }
}
