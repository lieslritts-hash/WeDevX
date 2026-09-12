package week5;

/*
5.10.2 Find Last Word Length*
easy
|
30 min
|
Share
Create a static method named findLastWordLength() that takes a String[]
array as parameter with multiple strings and calculates the sum of
lengths of the last words in each String. The program should return the sum of
lengths of the last words in each string. If there are no words in the array, return 0.

Example:
Parameters:

plain
Copy code
String[] sentences = {"Hello World", "Java Code", "Test Results"}
Return: int 16
 */
//write your static method here. No need to add Main class or main method.

public class Week5_10_2_FindLastWordLength {
    public static void main(String[] args) {

        String[] sentences = new String[]{"Hello World", "Java Code", "Test Results"};
            System.out.println(findLastWordLength(sentences));

    }
    public static int findLastWordLength(String[] sentences) {

        if  (sentences == null || sentences.length == 0) {
            return 0;
        }

        int totalLength = 0;

        for (int i = 0; i < sentences.length; i++) {
            totalLength += sentences[i].substring(sentences[i].lastIndexOf(" ") + 1).length();

        }
        return totalLength;
    }
}
