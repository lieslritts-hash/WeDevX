package week4;

/*
4.31.2 Calculate Prime Numbers In Range*
easy
|
30 min
|
Share
Create a Java program that calculates and prints all prime numbers within a specified range. Implement this using a nested for loop structure.

Requirements:
Create a static method called calculatePrimeNumbersInRange() that takes two int parameters, start and end, representing
the inclusive range to find prime numbers.

Ensure that the method correctly calculates prime numbers within the range, including the start and end values.

Print the sum of all prime numbers in the range.

If no prime numbers are found in the range, return 0

Example:
Parameters:

plain
Copy code
int start = 10
int end = 20
Return: int Output:

plain
Copy code
60
Prime number
A prime number is a positive integer greater than 1 that has only two distinct positive divisors: 1 and itself. In
other words, a prime number cannot be evenly divided by any other number except 1 and itself. Examples of prime numbers
include 2, 3, 5, 7, 11, and so on. Prime numbers play a fundamental role in number theory and mathematics.
 */
//write your static method here. No need to add Main class or main method.


public class Week4_31_2_CalculatePrimeNumbersInRange {
    public static void main(String[] args) {

        System.out.println(calculatePrimeNumbersInRange(10, 20))
        ;

    }

    public static int calculatePrimeNumbersInRange(int start, int end) {

        int sum = 0;

        for (int i = start; i <= end; i++) {

            if (i == 1) {
                sum += i;
                continue;
            }

            if (i < 2) {
                continue;
            }

            boolean isPrime = true;

            for (int x = 2; x < i; x++) {

                if (i % x == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                sum += i;
            }
        }

        return sum;
    }
}