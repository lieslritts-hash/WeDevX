package week5;

/*
5.7.1 String Array to String*
easy
|
30 min
|
Share
Create a static method named convertStringArrayToString() that takes an array of strings as a parameter (String[]) and converts it to a string representation using Arrays.toString() method. Print the resulting string, the program shouldn't return anything.

Return Type: void

Example:
Parameters:

plain
Copy code
String[] arr = ["apple", "banana", "cherry"]
Output:

plain
Copy code
["apple", "banana", "cherry"]
 */
//write your static method here. No need to add Main class or main method or import anything

import java.util.Arrays;

public class Week5_7_1_StringArrayToString {
    public static void main(String[] args) {

        convertStringArrayToString(new String[]{"apple", "banana", "cherry"});

    }

    public static void convertStringArrayToString(String[] arr) {
        System.out.println(Arrays.toString(arr));
    }
}
