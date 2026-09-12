package week5;

/*
5.10.3 Replace Last Word
easy
|
30 min
|
Share
Create a static method named replaceLastWord() that takes a String[] array as parameter and replaces the last word with a specified word provided as another String parameter. The program should then return the new or modified array with edited sentences. Use substring to split the sentences, identify the last word, and perform the replacement.

Example:
Parameters:

plain
Copy code
String[] sentences = {"Hello World", "Java Code", "Test Results"}
String replacement = "WEDEVX"
Return: String[]

plain
Copy code
{"Hello WEDEVX", "Java WEDEVX", "Test WEDEVX"}
 */
//write your static method here. No need to add Main class or main method.


public class Week5_10_3_ReplaceLastWord {
    public static void main(String[] args) {

        String[] sentences = {"Hello World", "Java Code", "Test Results"};
        String replacement = "WEDEVX";

        String[] result = replaceLastWord(sentences, replacement);

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }

    public static String[] replaceLastWord(String[] sentences, String replacement) {

        for (int i = 0; i < sentences.length; i++) {
            sentences[i] = sentences[i].substring(0, sentences[i].lastIndexOf(" ") + 1)
                    + replacement;
        }

        return sentences;
    }
}