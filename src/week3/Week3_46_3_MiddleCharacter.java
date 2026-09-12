package week3;

/*
3.46.3 Middle Character
easy
|
30 min
|
Share
Your task is to write a static method called getMiddleChars() that takes a String as parameter and returns the middle character(s) of the string as a String. If the string has an odd number of characters, the method should return the single middle character. If the string has an even number of characters, the method should return the two middle characters. If the string is empty method should return ???. if the string is only one or two character return those characters. Return Type: String

Example #1:
Parameters:

plain
Copy code
String sentence = "wedevx"
Output:

plain
Copy code
de
Example #2:
Parameters:

plain
Copy code
String sentence = "hello"
Output:

plain
Copy code
l
Example #3:
Parameters:

plain
Copy code
String sentence = "ja"
Output:

plain
Copy code
ja
Example #4:
Parameters:

plain
Copy code
String sentence = "W"
Output:

plain
Copy code
W
Example #5:
Parameters:

plain
Copy code
String sentence = ""
Output:

plain
Copy code
???
Hint for odd strings
Use the string concatenation to convert the middle char into the String and return it

Example:
plain
Copy code
int middleIndex = str.length() / 2;
char middleChar = str.charAt(middleIndex);
String strMiddleChar = "" + middleChar;
OR
plain
Copy code
int middleIndex = str.length() / 2;
String middleChar = "" + str.charAt(middleIndex);
 */
//write your static method here. No need to add Main class or main method.


public class Week3_46_3_MiddleCharacter {
    public static void main(String[] args) {

        System.out.println(getMiddleChars("wedevx"));
        System.out.println(getMiddleChars("hello"));
        System.out.println(getMiddleChars("ja"));
        System.out.println(getMiddleChars("W"));
        System.out.println(getMiddleChars(""));

    }

    public static String getMiddleChars(String str) {

        if (str.length() == 0) {
            return "???";
        } else if (str.length() % 2 == 0) {
            int middleIndex = str.length() / 2;
            return "" + str.charAt(middleIndex -1) + str.charAt(middleIndex);
        } else {
            int middleIndex = str.length() / 2;
            return "" + str.charAt(middleIndex);
        }
    }
}
