package week4;

/*
4.40.4 Conditional reverse 2*
easy
|
30 min
|
Share
Create a method called manipulateString() that takes two parameters: a String and an int. The method should do the following:

If the integer is negative, reverse the string, then insert the absolute value of the integer at the beginning of the string.

If the integer is equals to zero or positive, remove all spaces, and insert the integer at the end of the string.

Hints:

You can check if the number is negative and convert it to a positive/absolute value by multiplying it by -1;

Use the insert() method of StringBuilder to insert the string;

Use the reverse() method to reverse the string;

Use the replace() method to remove spaces.

Return Type: StringBuilder

Example #1:
Parameters:

plain
Copy code
String input = "hello world"
int num = -5
Return:

plain
Copy code
5dlrow olleh
Example #2:
Parameters:

plain
Copy code
String input = "this is a test"
int num = 3
Return:

plain
Copy code
thisisatest3
Example #3:
Parameters:

plain
Copy code
String input = ""
int num = -2
Return:

plain
Copy code
2
Extra - Math.abs() in Java
The Math.abs() method in Java is used to find the absolute (positive) value of a number. It can be especially useful when you need to work with the magnitude of numbers, regardless of their sign (positive or negative).

Here's how you can use Math.abs() with examples:

Import the Math Class: First, make sure to import the Math class at the beginning of your Java program (if you create the whole program, not just a static method):

plain
Copy code
import java.lang.Math;
Using Math.abs():

To find the absolute value of an integer:

plain
Copy code
int number = -5;
int absoluteValue = Math.abs(number);
System.out.println(absoluteValue); // Output: 5
To find the absolute value of a double or float:

plain
Copy code
double doubleNumber = -7.5;
double absoluteValue = Math.abs(doubleNumber);
System.out.println(absoluteValue); // Output: 7.5
For positive integers, the result remains the same:

plain
Copy code
int positiveNumber = 10;
int absoluteValue = Math.abs(positiveNumber);
System.out.println("Absolute Value: " + absoluteValue); // Output: 10
By using Math.abs(), you can ensure that you always work with the positive
magnitude of a number, regardless of whether it's positive or negative.
 */
//write your static method here. No need to add Main class or main method.

public class Week4_40_4_ConditionalReverse2 {
    public static void main(String[] args) {

        System.out.println(manipulateString("hello world", -5));
        System.out.println(manipulateString("this is a test", 3));
        System.out.println(manipulateString("", -2));

    }

    public static  StringBuilder manipulateString(String str, int number) {

        StringBuilder sb = new StringBuilder(str);

        if (number < 0) {

            sb.reverse();
            sb.insert(0, Math.abs(number));

        } else {

            sb.replace(0, sb.length(), sb.toString().replace(" ", ""));
            sb.append(number);
        }

        return sb;
    }
}
