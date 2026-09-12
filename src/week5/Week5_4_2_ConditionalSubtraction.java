package week5;

/*
5.4.2 Conditional subtraction*
easy
|
30 min
|
Share
Description: Write a method called subtractFromArray() that takes an int array as a parameter.

If the first number is greater than the second, it should return first - second (Subtraction).

If the second is greater, it should return second - first (Subtraction).

If both of them are equal or the size of an array equals 1 or less than 1, return 777.

Params: A int array. Return: The result of a subtraction or 777. Example: subtractFromArray([2,3,5,12,56,53,5]);
// Returns 1 subtractFromArray([100,-1]); // Returns 101 subtractFromArray([18]); // Returns 777 subtractFromArray([0, 0]);
// Returns 777 Note: No input is needed for this exercise. Arrays are already created at the back.
 */
//write your static method here. No need to add Main class or main method.

public class Week5_4_2_ConditionalSubtraction {
    public static void main(String[] args) {
        int[] num = {10, 4};
        int[] num2 = {10, 10};
        int[] num3 = {10, 10};
        int[] num4 = {4};


    }

    public static int subtractFromArray(int[] numbers) {
        if(numbers.length < 2 || numbers[0] == numbers[1]) {
            return 777;
        } else if(numbers[0] > numbers[1]) {
            return numbers[0] - numbers[1];
        } else {
            return numbers[1] - numbers[0];
        }
    }
}
