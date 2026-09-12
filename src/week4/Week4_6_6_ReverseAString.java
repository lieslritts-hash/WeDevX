package week4;

/*
4.6.6 Reverse a String
easy
|
30 min
|
Share
Write a static method called reverseString() that accepts a String as a parameter. The method should return a String that is the reverse of the specified string. Example of result:

plain
Copy code
Input: "Hello"
Output: "olleH"

Input: "World"
Output: "dlrow"

Input: "12345"
Output: "54321"
 */

public class Week4_6_6_ReverseAString {
    public static void main(String[] args) {

        System.out.println(reverseString("Hello"));
        System.out.println(reverseString("World"));
        System.out.println(reverseString("12345"));

    }

    public static String reverseString(String str)  {

        String result = "";
        int counter = str.length() -1;

        while (counter >= 0) {
            result = result + str.charAt(counter);
            counter--;
        }

        return result;
    }
}
