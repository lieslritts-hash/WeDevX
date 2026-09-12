package week4;

/*
4.8.3 Prime Numbers Sum (with solution)
easy
|
30 min
|
Share
Create a Java program that calculates the sum of all prime numbers within a specified range. Implement a static method named calculatePrimeSum() that takes an integer N as input and returns the sum of all prime numbers from 2 to 'N' (inclusive). A prime number is a positive integer greater than 1 that is divisible by only 1 and itself. You should use a while loop to iterate through numbers from 2 to 'N' and determine if each number is prime. If a number is prime, add it to the sum. Finally, return the sum of prime numbers.

Example #1:
plain
Copy code
calculatePrimeSum(10) // 2 + 3 + 5 + 7
Return: int

plain
Copy code
17
Video solution:
https://youtu.be/ldjg4xJeG4U
 */

// 1. create a variable to hold all prime numbers, return at the end
// 2. Iterate from  up to the number itself
// 3. If current number is prime, add it to the sum and move to the next number

// Logic:
// 10 = a * b = 2 * 5
// num % 2 == 0, num % 3 == 0, num % 4, ... continue until num % num -1 == 0

// Rule: every method has to serve only one goal
// another method which checks if number is prime or not

public class Week4_8_3_PrimeNumbersSumWithSolution {
    public static void main(String[] args) {

        System.out.println(calculatePrimeSum(10));
    }

    public static int calculatePrimeSum(int input) {

        int sum = 0;
        int counter = 2;

        while (counter <= input) {
            //if number is prime, add it to the sum
            if (isPrime(counter)) {
                sum += counter;
            }
            counter++;
        }
        return sum;
    }

    public static boolean isPrime(int currentNum) {
        if (currentNum <= 1) {
            return false;
        }
        int divisor = 2;

        while (divisor < currentNum) {
            if (currentNum % divisor == 0) {
                return false;
            }
            divisor++;
        }
        return true;
    }
}

