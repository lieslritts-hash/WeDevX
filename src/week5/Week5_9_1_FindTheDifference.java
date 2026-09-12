package week5;

/*
5.9.1 Find the difference*
easy
|
30 min
|
Share
Write a method called findAndCalculate() that takes two arrays as
input: an array of integers (int[]) and an array of doubles (double[]).
The method should find the largest value in the integer array and the
smallest value in the double array. It should then calculate the difference
between these two values and return the result.

Return Type: double

Example #1:
Parameters:

plain
Copy code
int[] intArray = [2, 6, 8, 12, 24]
double[] doubleArray = [0.5, 1.25, 0.75, 2.5, 0.1]
Return:

plain
Copy code
23.9
// The largest integer in the intArray is 24, and the smallest double in the
doubleArray is 0.1. The difference between these two values is 23.9.
 */
//write your static method here. No need to add Main class or main method.


public class Week5_9_1_FindTheDifference {
    public static void main(String[] args) {

        int[] intArray = {2, 6, 8, 12, 24};
        double[] doubleArray = {0.5, 1.25, 0.75, 2.5, 0.1};

        double result = findAndCalculate(intArray, doubleArray);

        System.out.println(result);

    }

    public static double findAndCalculate(int[] intArray, double[] doubleArray) {

        int largest = intArray[0];

       for (int i = 0; i < intArray.length; i++) {
           if (intArray[i] > largest) {
               largest = intArray[i];
           }
       }

       double smallest = doubleArray[0];

       for (int i = 0; i < doubleArray.length; i++) {
           if (doubleArray[i] < smallest) {
               smallest = doubleArray[i];
           }
       }

       return largest - smallest;
    }
}
