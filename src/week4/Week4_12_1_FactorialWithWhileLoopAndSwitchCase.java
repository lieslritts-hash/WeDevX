package week4;

/*
4.12.1 Factorial with while loop and switch case*
easy
|
30 min
|
Share
Description: Write a method called
calculateFactorial() that takes an integer input and
calculates its factorial (i.e. the product of all positive
integers less than or equal to the input). If the input is negative,
return -1. Params: An integer representing the input for which to
calculate the factorial. Return: An integer representing the factorial
of the input, or -1 if the input is negative. Example: calculateFactorial(5);
// Returns 120 (5 4 3 2 1 = 120) calculateFactorial(0); // Returns 1 (0! = 1)
calculateFactorial(-4); // Returns -1 (negative input) Note: use while loop and
switch case for this exercise. No input is needed for this exercise, numbers are
given at the backend.
 */

public class Week4_12_1_FactorialWithWhileLoopAndSwitchCase {
    public static void main(String[] args) {

        System.out.println(calculateFactorial(5));
        System.out.println(calculateFactorial(0));
        System.out.println(calculateFactorial(-4));
    }

    public static int calculateFactorial(int number) {

        if (number < 0) {
            return -1;
        }

        int factorial = 1;

        switch (number) {
            case 0:
            case 1:
                return 1;

            default:
                while (number > 1) {
                    factorial = factorial * number;
                    number--;
                }
        }
        return factorial;
    }
}
