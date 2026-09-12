package week3;

/*
3.35.1 Find Remainder*
easy
|
30 min
|
Share
Write a static method called findRemainder() that accepts two
integers as parameters and returns their remainder after division
as an int. Divide first param by second param. Expected result:

plain
Copy code
Input: 10, 3
Output: 1

Input: 50, 7
Output: 1

Input: 24, 8
Output: 0

Input: 100, 10
Output: 0

Input: 17, 5
Output: 2
 */

public class Week3_35_1_FindRemainder {

    //write your static method here. No need to add Main class or main method.
    public static void main(String[] args) {
        int remainder = findRemainder(10, 3);
        System.out.println(remainder);
        int remainder1 = findRemainder(50, 7);
        System.out.println(remainder1);
        int remainder2 = findRemainder(24, 8);
        System.out.println(remainder2);
        int remainder3 = findRemainder(100, 10);
        System.out.println(remainder3);
        int remainder4 = findRemainder(17, 5);
        System.out.println(remainder4);

    }
    public static int findRemainder(int num1, int num2) {
        return num1 % num2;
    }


}
