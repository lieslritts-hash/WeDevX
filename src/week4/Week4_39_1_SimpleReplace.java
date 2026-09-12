package week4;

/*
4.39.1 Simple replace*
easy
|
30 min
|
Share
Write a method called replaceSubstring() that takes a string, a substring to be replaced, and a replacement substring as input and returns the resulting StringBuilder object with all occurrences of the first substring replaced with the second substring using a StringBuilder.

Return Type: StringBuilder

Example #1:
Parameters:

plain
Copy code
// A string representing the original string.
String origin = "Hello, world!"
// A string representing the substring to be replaced.
String replaceIt = "world"
// A string representing the replacement substring.
String replacement = "everyone"
Return:

plain
Copy code
Hello, everyone!
 */
//write your static method here. No need to add Main class or main method.

public class Week4_39_1_SimpleReplace {
    public static void main(String[] args) {

        System.out.print(replaceSubstring("Hello, world!", "world","everyone"));

    }

    public static StringBuilder replaceSubstring(String str1, String str2, String replacement) {

        StringBuilder sb = new StringBuilder(str1);

        int index = sb.indexOf(str2);

        while (index != -1) {

            sb.replace(index, index + str2.length(), replacement);

            index = sb.indexOf(str2);
        }

        return sb;

    }
}
