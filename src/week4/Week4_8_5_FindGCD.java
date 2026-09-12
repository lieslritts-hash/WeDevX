package week4;

/*
4.8.5 Find GCD
easy
|
30 min
|
Share
Exercise Description: Write a Java program to find the greatest common divisor (GCD) of two numbers using the Euclidean algorithm and a while loop. Create a static method called findGCD() that takes two integers and returns the GCD number as int. Use the Euclidean Algorithm and while loop to complete the exercise. Example 1:

plain
Copy code
findGCD(96, 42)
Return:

plain
Copy code
6
Example 2:

plain
Copy code
findGCD(120, 440)
Return:

plain
Copy code
40
Euclidean Algorithm Explanation:
The Euclidean algorithm is a method used to find the greatest common divisor (GCD) of two integers. It is based on the principle that the GCD of two numbers does not change if the larger number is replaced by its difference with the smaller number. This process is repeated until both numbers become equal, at which point their common value is the GCD.

Here's how the Euclidean algorithm works:

Given two positive integers, "a" and "b", where "a" is greater than or equal to "b".

If "b" is 0, then the GCD is "a".

Otherwise, replace "a" with "b" and "b" with the remainder of "a" divided by "b".

Repeat steps 2 and 3 until "b" becomes 0.

The GCD is the value of "a" when "b" becomes 0.

Example:

Let's find the GCD of 36 and 48 using the Euclidean algorithm:

Start with "a = 36" and "b = 48".

Since "b" is not 0, replace "a" with "b" (48) and "b" with the remainder of "a" divided by "b" (36 % 48 = 36).

Now, "a = 48" and "b = 36".

Replace "a" with "b" (36) and "b" with the remainder of "a" divided by "b" (48 % 36 = 12).

Now, "a = 36" and "b = 12".

Replace "a" with "b" (12) and "b" with the remainder of "a" divided by "b" (36 % 12 = 0).

Since "b" is now 0, the GCD is the value of "a", which is 12.

Return Value and Parameters:

The Euclidean algorithm function "findGCD" takes two integers, "num1" and "num2", as input parameters.

It returns an integer representing the greatest common divisor (GCD) of "num1" and "num2".

This algorithm efficiently computes the GCD of two numbers and is widely used in mathematics and computer science for various applications.
 */

public class Week4_8_5_FindGCD {
    public static void main(String[] args) {

        System.out.println(findGCD(96,42));
        System.out.println(findGCD(120,440));

    }

    public static int findGCD(int num1, int num2) {

        int a = num1;
        int b = num2;

        while (b != 0) {
            int remainder = a % b;
            a = b;
            b = remainder;
        }

        return a;
    }
}
