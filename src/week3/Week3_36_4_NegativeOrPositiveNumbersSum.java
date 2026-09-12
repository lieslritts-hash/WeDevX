package week3;

/*
3.36.4 Negative or Positive Numbers Sum
easy
|
30 min
|
Share
Write a static method called calculateTwoNumbers() that accepts two double numbers as parameters and returns their sum if they are both positive, their difference if they are both negative or 0 if they have different signs as double.

Example of result:
plain
Copy code
Input: 10.5, 20.3
Output: 30.8

Input: -10.5, -20.3
Output: 9.8

Input: 10.5, -20.3
Output: 0.0
Hint
Use if-statements and comparison operators to determine if numbers are positive or negative.
 */
//write your static method here. No need to add Main class or main method.

public class Week3_36_4_NegativeOrPositiveNumbersSum {
    public static void main(String[] args) {
        double sum1 = calculateTwoNumbers(10.5, 20.3);
        System.out.println(sum1);

        double sum2 = calculateTwoNumbers(-10.5, -20.3);
        System.out.println(sum2);

        double sum3 = calculateTwoNumbers(10.5, -20.3);
        System.out.println(sum3);


    }
    public static double calculateTwoNumbers(double num1, double num2) {
        double sum = 0;

        if (num1 > 0 && num2 > 0) {
            sum = num1 + num2;
        } else if (num1 < 0 && num2 < 0) {
            sum = num1 - num2;
        } else if (num1 < 0 && num2 > 0) {
            sum = 0;
        } else if (num1 > 0 && num2 < 0) {
            sum = 0;
        }

        return sum;
    }
}
