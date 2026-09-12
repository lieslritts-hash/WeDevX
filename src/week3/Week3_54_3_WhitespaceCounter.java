package week3;

/*
3.54.3 Whitespace Counter
easy
|
30 min
|
Share
Create a Java program that includes a static method named countWhitespaces() to count the total number of whitespace characters ( ) within a given sentence. The program should take a sentence as String parameter, calculate and return the count of whitespace characters as int. Ensure that the method countWhitespaces() makes use of the trim() method to remove any leading and trailing spaces, ensuring accurate counting of spaces within the sentence. Consider handling long sentences with multiple spaces between words.

Example #1:
Parameters:

plain
Copy code
String sentence = "      There are many spaces here.  "
Return: int

plain
Copy code
4
 */
//write your static method here. No need to add Main class or main method.


public class Week3_54_3_WhitespaceCounter {
    public static void main(String[] args) {

        System.out.println(countWhitespaces("      There are many spaces here.  "));
    }

    public static int countWhitespaces(String str) {

        String trimmed = str.trim();

        int originalLength = trimmed.length();
        int noSpacesLength = trimmed.replace(" ", "").length();
        return originalLength - noSpacesLength;
    }
}
