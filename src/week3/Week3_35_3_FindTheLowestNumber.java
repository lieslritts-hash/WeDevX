package week3;

/*
3.35.3 Find the Lowest Number
easy
|
30 min
|
Share
Write a static method called findLowestNumber() that accepts three integers as parameters and returns the lowest number as an int.

Example of result:
plain
Copy code
Input: 10, 3, 5
Output: 3

Input: 50, 7, 24
Output: 7

Input: 24, 8, 100
Output: 8
Hint
plain
Copy code
1. Start with the first number (num1).
2. Set the variable 'min' equal to the value of the first number (num1).
3. Compare the second number (num2) with the current minimum (min). If num2 is smaller, update 'min' to be equal to num2.
4. Compare the third number (num3) with the current minimum (min). If num3 is smaller, update 'min' to be equal to num3.
5. 'min' now contains the smallest of the three numbers.
6. Return the value of 'min' as the result.
 */
//write your static method here. No need to add Main class or main method.

public class Week3_35_3_FindTheLowestNumber {
    public static void main(String[] args) {
        int lowestNum = findLowestNumber(10, 3, 5);
        System.out.println(lowestNum);
        int lowestNum1 = findLowestNumber(50, 7, 5);
        System.out.println(lowestNum1);
        int lowestNum2 = findLowestNumber(24, 8, 100);
        System.out.println(lowestNum2);
    }

    public static int findLowestNumber(int num1, int num2, int num3) {
        int min = num1;
        if (num2 < min) min = num2;
        else if (num3 < min)  min = num3;
        return min;
    }

}
