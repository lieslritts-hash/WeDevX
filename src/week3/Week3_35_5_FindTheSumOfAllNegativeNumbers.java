package week3;

 /*
3.35.5 Find the Sum of All Negative Numbers
easy
|
30 min
|
Share
Write a static method called findSumOfNegativeNumbers() that accepts three integers as parameters and returns the sum of all negative numbers as an int.

Example of result:
plain
Copy code
Input: -50, 3, 5
Output: -50

Input: -10, 1, -1
Output: -11

Input: 24, 8, 100
Output: 0
Hint
Use if-statements to find out negative numbers
 */
//write your static method here. No need to add Main class or main method.


public class Week3_35_5_FindTheSumOfAllNegativeNumbers {
        public static void main(String[] args) {
            int sum1 = findSumOfNegativeNumbers(-50, 3, 5);
            System.out.println(sum1);
            int sum2 = findSumOfNegativeNumbers(-10, 1, -1);
            System.out.println(sum2);
            int sum3 = findSumOfNegativeNumbers(24, 8, 100);
            System.out.println(sum3);
        }

    public static int findSumOfNegativeNumbers(int num1, int num2, int num3) {
        int sum = 0;
        if (num1 < 0) {
            sum += num1;
        }
        if (num2 < 0) {
            sum += num2;
        }

        if (num3 < 0) {
            sum += num3;
        }

        return sum;
    }
}

