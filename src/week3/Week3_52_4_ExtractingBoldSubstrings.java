package week3;

/*
3.52.4 Extracting Bold Substrings
easy
|
30 min
|
Share
Write a method called extractBoldSubstrings() that takes a string as input and returns a string containing the bold substring in the input string. Return the empty string if no bold text in the input string. Params: String: The string to be extracted. Return: String: A string containing the bold substring in the input string.

Examples:
Input: This is **bold** text Output: bold Input: This is not *bold* text Output: ""

Hints
Make sure that indexOf() and lastIndexOf() are not equal. If they are equal, then ** occurs only 1 time in the String, which means ** opens and does not close, then this is not a bold text.

In addition, this will serve as an additional check to see if the text contains ** at all. If this is missing, then both indexOf() and lastIndexOf() will return -1 and be equal.
 */
//write your static method here. No need to add Main class or main method.


public class Week3_52_4_ExtractingBoldSubstrings {
    public static void main(String[] args) {

        System.out.println(extractBoldSubstrings("This is **bold** text"));
        System.out.println(extractBoldSubstrings("This is not *bold* text"));
        System.out.println(extractBoldSubstrings("This is **bold text"));
    }

    public static String extractBoldSubstrings(String str) {
        int startBold = str.indexOf("**");
        int endBold = str.lastIndexOf("**");

        if (startBold == endBold) {
            return "";
        } else {
            return str.substring(startBold + 2, endBold);
        }
    }
}
