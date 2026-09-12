package week3;

/*
3.54.1 Remove Trailing Spaces*
easy
|
30 min
|
Share
Exercise: Create a static method named removeWhitespaces() that takes a string as input and removes all leading and trailing whitespaces. The method should return the modified string. Params: A string with leading and/or trailing whitespace. Return: A string without any leading or trailing whitespace. Expected Output:

plain
Copy code
removeWhitespaces("    Hello, World!   "); // Output: "Hello, World!"
removeWhitespaces("     Welcome to Wedevx     "); // Output: "Welcome to Wedevx"
removeWhitespaces("  This is a sentence with no whitespaces  "); // Output: "This is a sentence with no whitespaces"
removeWhitespaces(" Wedevx   is    awesome   "); // Output: "Wedevx   is    awesome"
 */
//write your static method here. No need to add Main class or main method.

public class Week3_54_1_RemoveTrailingSpaces {
    public static void main(String[] args) {

        System.out.println(removeWhitespaces("    Hello, World!   ")); // Output: "Hello, World!"
        System.out.println(removeWhitespaces("     Welcome to Wedevx     ")); // Output: "Welcome to Wedevx"
        System.out.println(removeWhitespaces("  This is a sentence with no whitespaces  ")); // Output: "This is a sentence with no whitespaces"
        System.out.println(removeWhitespaces(" Wedevx   is    awesome   ")); // Output: "Wedevx   is    awesome"

    }

    public static String removeWhitespaces(String str) {
        return str.trim();
    }
}
