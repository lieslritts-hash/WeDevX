package week4;

/*
4.19.4 Prime Number Checker*
easy
|
30 min
|
Share
Create a static method named isPrime() that takes an int as a parameter and
returns a boolean value indicating whether the input number is prime or not. A prime number is a positive integer greater than 1 that is divisible by only 1 and itself*. Implement the method using a for loop to check for divisors.*

Example:
Parameter:

plain
Copy code
int number = 7
Return: boolean

plain
Copy code
true
 */

public class Week4_19_2_PrimeNumberChecker {
    public static void main(String[] args) {

    }

    public static boolean isPrime(int number) {

        if (number <= 1) {
            return false;
        }

        for (int counter = 2; counter < number; counter++) {

            if (number % counter == 0) {
                return false;
            }
        }

        return true;
    }
}
