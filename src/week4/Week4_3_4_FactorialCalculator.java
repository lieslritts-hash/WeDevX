package week4;

/*
4.3.5 Factorial Calculator
easy
|
30 min
|
Share
Create a Java program with a static method named calculateFactorial() that takes an int as parameter and calculates the factorial of that number using a while loop. The factorial of a non-negative integer n (denoted as n!) is the product of all positive integers less than or equal to n. For example, the factorial of 5 is 5! = 5 x 4 x 3 x 2 x 1 = 120. Your program should return the factorial value as an int. Use while loop to calculate a factorial.

Example:
plain
Copy code
calculateFactorial(5) // 1 * 2 * 3 * 4 * 5 = 120
Return: int

plain
Copy code
120
 */

public class Week4_3_4_FactorialCalculator {
    public static void main(String[] args) {

        System.out.println(calculateFactorial(5));

    }

    public static int calculateFactorial(int num) {

        int factorial = 1;
        int counter = 1;

        while (counter <= num) {
            factorial = factorial * counter;
            counter++;
        }

        return factorial;
        }
}
