package week3;

/*
3.51.2 Remove a substring*
easy
|
30 min
|
Share
Write a static method called removeSubstring() takes a string and a substring to be removed as input from the user, removes all occurrences of the given substring from the string, and returns the modified string. Params: 2 Strings, 1st one for the sentence, 2nd one for the substring. Return a modified String For example, if the user inputs the string "hello world" and the substring "o" to be removed, the method should output the modified string "hell wrld". Similarly, if the user inputs the string "this is a test" and the substring "is" to be removed, the method should return the modified string "th a test". To test the method, you can call it with different input values and check that it returns the expected output. For example:

plain
Copy code
removeSubstring("oscar world", "o"); // Expected output: "scar wrld"
removeSubstring("this is a test", "is"); // Expected output: "th a test"
removeSubstring("banana", "a"); // Expected output: "bnn"
removeSubstring("mississippi", "ssi"); // Expected output: "mippi"
removeSubstring("hello", "z"); // Expected output: "hello"
 */
//write your static method here. No need to add Main class or main method.

public class Week3_51_2_RemoveASubstring {
    public static void main(String[] args) {

        System.out.println(removeSubstring("oscar world", "o")); // Expected output: "scar wrld"
        System.out.println(removeSubstring("this is a test", "is")); // Expected output: "th a test"
        System.out.println(removeSubstring("banana", "a")); // Expected output: "bnn"
        System.out.println(removeSubstring("mississippi", "ssi")); // Expected output: "mippi"
        System.out.println(removeSubstring("hello", "z")); // Expected output: "hello"
    }

    public static String removeSubstring(String str, String substring) {
        return str.replace(substring, "");
    }
}
