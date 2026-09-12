package week5;

/*
5.15.1 Find the sum*
easy
|
30 min
|
Share
Description: Write a method called calculateSum() that takes
an array of doubles and a double as input. The method should loop
through each element of the array and perform the following operation:
if the current element is less than the input double, subtract the current
element from the running sum; if the current element is greater than the input double,
add the current element to the running sum. The method should then return the final sum.
Params: An array of doubles and a double. Return: A double representing the calculated sum.
Example: double[] nums = {1.2, 3.4, 5.6, 7.8, 9.0}; double num = 5.0; calculateSum(nums, num);
// Returns 17.8 double[] nums = {1.2, 3.4, 5.6, 7.8, 9.0}; double num = 2.3; calculateSum(nums, num);
// Returns 24.6 Note: If the input array is empty, return 0.0.
 */
//write your static method here. No need to add Main class or main method.

public class Week5_15_1_FindTheSum {
    public static void main(String[] args) {

    }

    public static double calculateSum(double[] nums, double num) {

        double sum = 0;

        for (double n : nums) {
            if (n < num) {
                sum -= n;
            } else {
                sum += n;
            }
        }

        return sum;
    }
}
