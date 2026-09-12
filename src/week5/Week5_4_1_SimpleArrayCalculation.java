package week5;

/*
5.4.1 Simple array calculation*
easy
|
30 min
|
Share
Description: Write a method called calculateArray() that takes an int array
as a parameter and returns the sum of the first and last elements in it.
If the size of an array is less than or equal to 1, return 1. Params: A int array.
Return: The sum of the first and last elements if the size is bigger than 1. Else, return 1.
Example: calculateArray([2,3,5,12,56,53,5]); // Returns 7 calculateArray([100,-1]);
// Returns 99 calculateArray([18]); // Returns 1 Note: No input is needed for this exercise.
Arrays are already created at the back. Use .length method without parenthesis to find the length of the Array
 */
//write your static method here. No need to add Main class or main method.

public class Week5_4_1_SimpleArrayCalculation {
    public static void main(String[] args) {
        int[] numbers = {2, 3, 4, 2, 6, 7, 45, 2, 34, 34,  2, 7 ,2}; //14
        int[] numbers1 = {2, 3, 2, 7, 32}; //34
        int[] numbers2 = {2, 3, 2, 7, 7862}; //7864
        int[] numbers3 = {12}; //1

        System.out.println(calculateArray(numbers));
        System.out.println(calculateArray(numbers1));
        System.out.println(calculateArray(numbers2));
        System.out.println(calculateArray(numbers3));


    }

    public static int calculateArray(int[] numbers) {
        if(numbers.length > 1) {
            return numbers[0] + numbers[numbers.length -1];
        } else {
            return 1;
        }

    }
}
