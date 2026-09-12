package week3;

/*
3.54.2 String Validator*
easy
|
30 min
|
Share
Write a method called validateString() that uses the trim() and length() methods to validate a string. The string is valid if it contains at least one character and does not contain any whitespace at the edges of the sentence.

Params:
String: The string to be validated.

Return:
boolean: The method should return true or false indicating whether the string is valid or not.

Examples:
Input: "Hello World!" Output: true Input: " Hello World!" Output: false

Example of the code
java
Copy code
public static boolean validateString(String input) {
  if (input.trim().length() == input.length()) return true;
  else return false;
}
 */
//write your static method here. No need to add Main class or main method.


public class Week3_54_2_StringValidator {
    public static void main(String[] args) {

        System.out.println(validateString("Hello World!")); //true
        System.out.println(validateString(" Hello World!")); //false
        System.out.println(validateString("Hello World! ")); // false
        System.out.println(validateString(""));              // false
    }

    public static boolean validateString(String str) {

        if (str.length() > 0 && str.trim().length() == str.length()) {
            return true;
        } else {
            return false;
        }
    }

}
