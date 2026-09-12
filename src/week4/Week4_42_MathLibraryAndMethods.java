package week4;

/*
4.42 Math library and Methods
Introduction to Java's Math Library
Java provides a built-in Math class that contains various mathematical functions to perform common operations. These functions are static methods, meaning you can call them directly without creating an instance of the Math class. Below are the frequently used methods: Math.abs(double a) This method returns the absolute value (non-negative version) of a number. Here's a breakdown of accepted data types:

double: This is the most common usage.

float: Math.abs() also works with float data type.

long: You can use Math.abs() to find the absolute value of a long integer.

int: This method can be used to get the absolute value of an integer.

java
Copy code
// Absolute value of a double
double num1 = -10.5;
double absValue1 = Math.abs(num1);
System.out.println("Absolute value of " + num1 + " is: " + absValue1); // Output: Absolute value of -10.5 is: 10.5

// Absolute value of a float
float num2 = -3.14f;
float absValue2 = Math.abs(num2);
System.out.println("Absolute value of " + num2 + " is: " + absValue2); // Output: Absolute value of -3.14 is: 3.14

// Absolute value of a long
long num3 = -9234567890L;
long absValue3 = Math.abs(num3);
System.out.println("Absolute value of " + num3 + " is: " + absValue3); // Output: Absolute value of -9234567890L is: 9234567890

// Absolute value of an int
int num4 = -20;
int absValue4 = Math.abs(num4);
System.out.println("Absolute value of " + num4 + " is: " + absValue4); // Output: Absolute value of -20 is: 20
Math.max(int a, int b) This method returns the greater of two integer values. It takes two integer arguments and returns the larger one. Here's the accepted data type:

int: This method is designed specifically for integer values (int).
java
Copy code
int x = 15;
int y = 25;
int max = Math.max(x, y);
System.out.println("The greater number between " + x + " and " + y + " is: " + max); // Output: The greater number between 15 and 25 is: 25
Math.min(int a, int b) Similar to Math.max, this method returns the smaller of two integer values. Here's the accepted data type:

int: Similar to Math.max, this method works exclusively with integers (int).
java
Copy code
int a = 30;
int b = 10;
int min = Math.min(a, b);
System.out.println("The smaller number between " + a + " and " + b + " is: " + min); // Output: The smaller number between 30 and 10 is: 10
Math.sqrt(double a) This method returns the square root of a number. Here's the accepted data type:

double: Math.sqrt() requires a double-precision floating-point number (double).
java
Copy code
double num = 25.0;
double squareRoot = Math.sqrt(num);
System.out.println("Square root of " + num + " is: " + squareRoot); // Output: Square root of 25.0 is: 5.0
Math.pow(double a, double b) This method returns the value of the first argument raised to the power of the second argument. Here are the accepted data types:

double: Both the base and exponent must be double-precision floating-point numbers (double).
java
Copy code
double base = 2.0;
double exponent = 3.0;
double result = Math.pow(base, exponent);
System.out.println(base + " raised to the power of " + exponent + " is: " + result); // Output: 2.0 raised to the power of 3.0 is: 8.0
Math.round(float a) This method returns the closest integer to the argument. Here's the accepted data type:

float: Math.round() works specifically with floating-point numbers of type float.
java
Copy code
float num = 10.6f;
long roundedNum = Math.round(num);
System.out.println("Rounded value of " + num + " is: " + roundedNum);
// Output: Rounded value of 10.6 is: 11
Math.ceil(double a) This method returns the smallest integer that is
greater than or equal to the argument. Here's the accepted data type:

double: Math.ceil() requires a double-precision floating-point number
(double).
java
Copy code
double num = 10.2;
double ceilValue = Math.ceil(num);
System.out.println("Ceiling value of " + num + " is: " + ceilValue);
// Output: Ceiling value of 10.2 is: 11.0
Math.floor(double a) This method returns the largest integer that is
less than or equal to the argument. Here's the accepted data type:

double: Similar to Math.ceil(), Math.floor() works with double-precision
floating-point numbers (double).
java
Copy code
double num = 10.8;
double floorValue = Math.floor(num);
System.out.println("Floor value of " + num + " is: " + floorValue);
// Output: Floor value of 10.8 is: 10.0
Conclusion The Math class in Java provides a comprehensive set of
mathematical functions that can be utilized in various applications.
By understanding and using these methods effectively, you can perform
complex mathematical computations with ease in your Java programs.
 */
//write your static method here. No need to add Main class or main method.

public class Week4_42_MathLibraryAndMethods {
    public static void main(String[] args) {

        // Match.abs(double a)
        // This method returns the absolute value (non-negative version) of a number
        // absolute value accepts; double, float, long, int

        double absDouble = Math.abs(-10.5);
        System.out.println(Math.abs(-10.5));

        System.out.println("========================");

        // Math.max(int a, int b)
        // This method returns the greater of two integer values
        // It takes two integer arguments and returns the larger one
        // Max accepts int

        int a = 100;
        int b = -100;
        int c = Math.max(a, b);

        System.out.println(c);

        System.out.println("========================");

        int a2 = 100;
        int b2 = -150;
        int c2 = Math.max(a2, Math.abs(b2));

        System.out.println(c2);

        System.out.println("========================");

        int a3 = 100;
        int b3 = -150;
        int c3 = 145;
        int d3 = Math.max(a3, Math.max(b3, c3));

        System.out.println(d3);

        System.out.println("========================");

        // Math.min(int a, int b)
        // Similar to Match.max, this method returns the smaller of two integer values
        // Min accepts int

        int a4 = 100;
        int b4 = -150;
        int c4 = 145;
        int d4 = Math.min(a4, Math.min(b4, c4));

        System.out.println(d4);

        System.out.println("========================");

        // Math.sgrt(double)
        // This method returns the square roo of a number
        // Sqrt only accepts double

        // 5 * 5 = 25
        double num = 36; // 36.0
        double result = Math.sqrt(num);
        System.out.println(result); //result is a double

        System.out.println("========================");

        double num2 = -5 * -5; //25.0
        double result2 = Math.sqrt(num2);
        System.out.println(result2);

        System.out.println("========================");

        // Math.pow(double a, double b)
        // This method returns the value of the first argument raised to the power of the second argument
        // Pow accepts double

        // 2 * 2 * 2 = 8

        double base = -3;
        double exponent = 2;
        double result3 = Math.pow(base, exponent);
        System.out.println(result3);

        // -3 * -3 = 9


        System.out.println("========================");

        double base2 = -3;
        double exponent2 = 4;
        double result4 = Math.pow(base2, exponent2);
        System.out.println(result4);

        // -3 * -3 * -3 * -3 = 81

        System.out.println("========================");

        double base3 = -3;
        double exponent3 = 3;
        double result5 = Math.pow(base3, exponent3);
        System.out.println(result5);

        // -3 * -3 * -3 = 9 * -3 = -27

        System.out.println("========================");

        double base4 = -3;
        double exponent4 = 3;
        double result6 = Math.abs(Math.pow(base4, exponent4));
        System.out.println(result6);

        // 3 * 3 * 3 = 9 * 3 = 27

        System.out.println("========================");

        // Math.round(float a)
        // This method returns the closest integer to the argument
        // Round accepts float or double

        float num3 = 10.4f;
        long result7 = Math.round(num3);
        System.out.println(result7); //10

        System.out.println("========================");

        float num4 = 10.9f;
        long result8 = Math.round(num4);
        System.out.println(result8); //11

        System.out.println("========================");

        // Math.ceil(double a)
        // This method returns the smallest integer that is greater than
        // or equal to the argument. (French for sky, so think sky -- the highest)
        // Ceil accepts double

        double num5 = 10.1;
        double result9 = Math.ceil(num5);
        System.out.println(result9); //11.0, will always return the higher integer

        System.out.println("========================");

        // Math.floor(double a)
        // This method returns the largest integer that is less than
        // or equal to the argument. (floor -- think lowest opposite of sky (ciel))
        // Floor accepts double

        double num6 = 10.9;
        double result10 = Math.floor(num6);
        System.out.println(result10); //10.0, will always return the lower integer
    }
}
