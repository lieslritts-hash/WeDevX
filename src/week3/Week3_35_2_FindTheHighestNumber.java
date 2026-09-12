package week3;

/*
3.35.2 Find the Highest Number
easy
|
30 min
|
Share
Write a static method called findHighestNumber() that accepts three integers as parameters and returns the highest number as an int.

Example of result:
plain
Copy code
Input: 10, 3, 5
Output: 10

Input: 50, 7, 24
Output: 50

Input: 24, 8, 100
Output: 100
Hint
plain
Copy code
1. Start with the first number (num1).
2. Set the variable 'max' equal to the value of the first number (num1).
3. Compare the second number (num2) with the current maximum (max). If num2 is greater, update 'max' to be equal to num2.
4. Compare the third number (num3) with the current maximum (max). If num3 is greater, update 'max' to be equal to num3.
5. 'max' now contains the largest of the three numbers.
6. Return the value of 'max' as the result.
Solution
plain
Copy code
static int findHighestNumber(int num1, int num2, int num3) {
  int max = num1;
  if (num2 > max) max = num2;
  if (num3 > max) max = num3;
  return max;
}
Pro Solution
The Math.max function is a built-in function in many programming languages, including Java. It takes two arguments and returns the maximum value among them.

plain
Copy code
static int findHighestNumber(int num1, int num2, int num3) {
  return Math.max(num1, Math.max(num2, num3));
}
 */

//write your static method here. No need to add Main class or main method.

public class Week3_35_2_FindTheHighestNumber {
    public static void main(String[] args) {
        int highestNum = findHighestNumber(10, 3, 5);
        System.out.println(highestNum);
        int highestNum1 = findHighestNumber(50, 7, 24);
        System.out.println(highestNum1);
        int highestNum2 = findHighestNumber(24, 8, 100);
        System.out.println(highestNum2);

    }

    public static int findHighestNumber(int num1, int num2, int num3) {
        int max = num1;
        if (num2 > max) max = num2;
        if (num3 > max) max = num3;
        return max;
    }
}
