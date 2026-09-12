package week5;

/*
5.4.3 Power of 2*
easy
|
30 min
|
Share
Description: Write a method called powerOfTwo() that takes an int array
as a parameter. If the first number raised to the power of 2 is greater
or equal to the sum of the second and third numbers, print "First is the
greatest". Else, print "There is no power in first". If the array contains
only two numbers or less, print "Not enough data". Params: A int array.
Return: None, only print. Example: powerOfTwo([2,3,5,12,56,53,5]);
//Output There is no power in first powerOfTwo([6, 7, 20, 67]);
//Output First is the greatest powerOfTwo([-9, 54, 27, -123]);
//Output First is the greatest powerOfTwo([100, 99]);
//Output Not enough data Note: No input is needed for this exercise.
Arrays are already created at the back.
 */
//write your static method here. No need to add Main class or main method.

public class Week5_4_3_PowerOf2 {
    public static void main(String[] args) {

        powerOfTwo(new int[]{2, 3, 5, 12, 56, 53, 5});
    }

    public static void powerOfTwo(int[] numbers) {
        if (numbers.length <= 2) {
            System.out.println("Not enough data");
        } else if (Math.pow(numbers[0], 2) >= numbers[1] + numbers[2]) {
            System.out.println("First is the greatest");
        } else {
            System.out.println("There is no power in first");
        }
    }
}
