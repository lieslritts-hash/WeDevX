package week3;

/*
3.35.4 Find the Sum of Four Numbers
easy
|
30 min
|
Share
Write a static method called findSumOfFourNumbers() that accepts four integers as parameters and returns their sum as an int.

Example of result:
plain
Copy code
Input: 10, 3, 5, 7
Output: 25

Input: 50, 7, 24, 4
Output: 85

Input: 24, 8, 100, 21
Output: 153
 */
//write your static method here. No need to add Main class or main method.

public class Week3_35_4_FindTheSumOfFourNumbers {
    public static void main(String[] args) {
        int sum1 = findSumOfFourNumbers(10, 3, 5, 7);
        System.out.println(sum1);
        int sum2 = findSumOfFourNumbers(50, 7, 24, 4);
        System.out.println(sum2);
        int sum3 = findSumOfFourNumbers(24, 8, 100, 21);
        System.out.println(sum3);

    }
    public static int findSumOfFourNumbers(int num1, int num2, int num3, int num4) {
        return num1 + num2 + num3 + num4;
    }


}
