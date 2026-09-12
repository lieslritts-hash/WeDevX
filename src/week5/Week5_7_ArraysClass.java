package week5;

/*
5.7 Arrays Class
1. Overview
Hello superstars! Welcome back to another session! In this session,
we gonna learn about Arrays class.

2.What is Array class?
The Arrays class in java.util package is a part of the Java Collection Framework.
This class provides static methods to dynamically create and access Java arrays.
It consists of only static methods and the methods of Object class.
The methods of this class can be used by the class name itself.
The class hierarchy is as follows:

plain
Copy code
java.lang.Object
 ↳ java.util.Arrays
We need to print out all element's value in an array. Before, we used loop and
accessed each of them by index number and printed out. With Arrays class we can
perform the same task using Arrays.toString(int[ ] arrays) method. Example 1

java
Copy code
public static void main(String[] args) {

    int[] nums = {23,45,67,34};
    System.out.println(Arrays.toString(nums));

    System.out.println("======================");

    String[] names = {"Jane", "kite", "Rose"};
    System.out.println(Arrays.toString(names));
}
plain
Copy code
Output is:
[23, 45, 67, 34]
======================
[Jane, kite, Rose]
##### **3\. Conclusion**
I hope today's class was helpful. See you guys in the next
class! Keep working hard!
 */
//write your static method here. No need to add Main class or main method or import anything

//import statement for using Arrays class
import java.util.Arrays;

public class Week5_7_ArraysClass {

    public static void main(String[] args) {
        int[] nums = {12, 45, 667, 22, 11};
        //String toString()
        //"[12, 45, 667, 22, 11]"
        System.out.println(Arrays.toString(nums));

        String[] names = {"Elon", "May", "Steve"};
        System.out.println(Arrays.toString(names));
    }
}
