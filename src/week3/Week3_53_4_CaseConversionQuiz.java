package week3;

/*
3.53.4 Case Conversion Quiz
easy
|
30 min
|
Share
Create a static method named convertTextCase() that takes two parameters: String and char. The String parameter represents the input sentence, and the char parameter can have two values: 'L' or 'U', indicating whether the text should be converted to lowercase or uppercase, respectively. Your program should perform the specified case conversion and return the transformed text as String.

Example:
Parameters:

plain
Copy code
String "CoMpUtEr ScIeNcE"
char "U"
Return: String

plain
Copy code
"COMPUTER SCIENCE"
 */
//write your static method here. No need to add Main class or main method.


public class Week3_53_4_CaseConversionQuiz {
    public static void main(String[] args) {

        System.out.println(convertTextCase("CoMpUtEr ScIeNcE",'U'));

    }

    public static String convertTextCase(String sentence, char value) {
        if (value == 'L') {
            return sentence.toLowerCase();
        } else if (value == 'U') {
            return sentence.toUpperCase();
        } else {
            return sentence;
            }
        }
}
