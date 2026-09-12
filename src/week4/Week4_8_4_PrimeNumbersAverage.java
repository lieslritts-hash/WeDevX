package week4;

/*
4.8.4 Prime Numbers Average
easy
|
30 min
|
Share
Exercise Description: Create a Java program that calculates the average of all prime numbers within a specified range. Implement a static method named calculatePrimeAverage() that takes an integer N as input and returns the average of all prime numbers from 2 to 'N' (inclusive). A prime number is a positive integer greater than 1 that is divisible by only 1 and itself. You should use a while loop to iterate through numbers from 2 to 'N' and determine if each number is prime. If a number is prime, add it to the sum of prime numbers. Finally, calculate the average of the prime numbers and return it. Example:

plain
Copy code
calculatePrimeAverage(10) // 2, 3, 5, 7
Return: double

plain
Copy code
4.25
The average, or arithmetic mean, is obtained by adding up all values in a dataset and dividing the sum by the total number of values.
 */

public class Week4_8_4_PrimeNumbersAverage {
    public static void main(String[] args) {

        System.out.println(calculatePrimeAverage(10));

    }

    public static double calculatePrimeAverage(int input) {

        int sum = 0;
        int count = 0;
        int counter = 2;

        while (counter <= input) {
            //if number is prime, add it to the sum
            if (isPrime(counter)) {
                sum += counter;
                count++;
            }
            counter++;
        }

        if (count == 0) {
            return 0.0;
        }

        return (double) sum / count;
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
