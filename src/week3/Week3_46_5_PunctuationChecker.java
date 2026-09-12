package week3;

/*
3.46.5 Punctuation Checker
easy
|
30 min
|
Share
Create a Java program with a static method named checkPunctuation() that checks if the last character of the given string is a common punctuation mark or not. Common punctuation marks include . , ! ? : ;. The method should take a single String as a parameter and return P if the last character is a common punctuation mark or N if it's not. Your task is to implement the checkPunctuation() method and provide a program that demonstrates its usage. Use String's charAt() and length() methods to complete the exercise.

Return Type: char

Example #1:
Parameters:

plain
Copy code
String str = "Hello, World."
Return:

plain
Copy code
P
Example #2:
Parameters:

plain
Copy code
String str = "Hello, World"
Return:

plain
Copy code
N
 */
//write your static method here. No need to add Main class or main method.

public class Week3_46_5_PunctuationChecker {
    public static void main(String[] args) {

        String str1 = "Hello, World.";
        char result1 = checkPunctuation(str1);
        System.out.println(result1);

        String str2 = "Hello, World";
        char result2 = checkPunctuation(str2);
        System.out.println(result2);

    }

    public static char checkPunctuation(String str) {

        if (str.charAt(str.length() -1) == '.') {
            return 'P';
        } else if (str.charAt(str.length() -1) == ',') {
            return 'P';
        } else if (str.charAt(str.length() -1) == '!') {
            return 'P';
        } else if (str.charAt(str.length() -1) == '?') {
            return 'P';
        } else if (str.charAt(str.length() -1) == ':') {
            return 'P';
        } else if (str.charAt(str.length() -1) == ';') {
            return 'P';
        } else {
            return 'N';
        }
    }
}
