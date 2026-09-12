package week5;

/*
5.6.2 Print Values Until Index Inclusively*
easy
|
30 min
|
Share
Create a static method named printValuesUntilIndex()
that takes two parameters: an array of integers (int[]) and an index (int).
The method should print all values from the start of the array up to the specified index (inclusive).
Ensure the index is within the bounds of the array. If the index is out of bounds, print an appropriate error message:
Index out of bounds

Return: void

Example #1:
Params:
plain
Copy code
int[] arr = {1, 2, 3, 4, 5}
int index = 3
Output:
plain
Copy code
1
2
3
4
Example #2:
Params:
plain
Copy code
int[] arr = {1, 2, 3, 4, 5}
int index = 6
Output:
plain
Copy code
Index out of bounds
: No input is needed for this exercise. Arrays are already created at the back.
 */
//write your static method here. No need to add Main class or main method.


public class Week5_6_1_PrintValuesUntilIndexInclusively {
    public static void main(String[] args) {

      printValuesUntilIndex(new int[]{1, 2, 3, 4, 5}, 3);
      printValuesUntilIndex(new int[]{1, 2, 3, 4, 5}, 6);

    }

    public static void printValuesUntilIndex(int[] array, int index) {

        if (index < 0 || index >= array.length) {
            System.out.println("Index out of bounds");
        } else {

            for (int i = 0; i <= index; i++) {
                System.out.println(array[i]);
            }
        }
    }
}
