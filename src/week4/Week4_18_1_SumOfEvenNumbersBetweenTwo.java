package week4;

/*
4.18.1 Sum of even numbers between two*
easy
|
30 min
|
Share
Description: Create a static sumOfEvenNumbers() method
that accepts two integer numbers and returns the sum of
all even numbers between those two exclusively. Params:
The method should initialize two integer numbers. Return:
The method should return the result of the operation as int.

Input: 5 10 Return: 14 Output:

plain
Copy code
The sum of even numbers between 5 and 10 is 14
Input: -10 10 Return: 0 Output:

plain
Copy code
The sum of even numbers between -10 and 10 is 0
Input: 0 1 Return: 0 Output:

plain
Copy code
The sum of even numbers between 0 and 1 is 0
Input: 5 -20 Return: -84 Output:

plain
Copy code
The sum of even numbers between 5 and -20 is -84
: make sure to iterate from the smaller to the
bigger number when using incrementation. An extra
check is needed for the first and second numbers within a method.
 */


public class Week4_18_1_SumOfEvenNumbersBetweenTwo {
    public static void main(String[] args) {


    }

    public static int sumOfEvenNumbers(int num1, int num2) {

        int result = 0;

        if (num1 < num2) {

            for (int counter = num1 +1; counter < num2; counter++) {

                if (counter % 2 == 0) {
                    result = result + counter;
                }
            }

        } else {

            for (int counter = num2 + 1; counter < num1; counter++) {

                if (counter % 2 == 0) {
                    result = result + counter;
                }
            }
        }

        return result;
    }
}
