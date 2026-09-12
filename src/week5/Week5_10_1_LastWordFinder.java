package week5;

/*
5.10.1 Last Word Finder*
easy
|
30 min
|
Share
Create a static method named findLastWord() that takes a String[]
as parameter and returns the last word of the sentence. The program
should then print the last word. Use arrays to extract a substring.
If there are no words in the sentence, return No words found.

Example:
Parameters:

plain
Copy code
String[] sentence = ["Today", "is", "a", "good", "day"]
Return: "day"
 */
//write your static method here. No need to add Main class or main method.


public class Week5_10_1_LastWordFinder {
    public static void main(String[] args) {
        String[] sentence = {"Today", "is", "a", "good", "day"};
        System.out.println(findLastWord(sentence));

    }

    public static String findLastWord(String[] words) {
        if (words == null || words.length == 0 || words[0].isEmpty()) {
            return "No words found";
        }
        return words[words.length - 1];
    }
}

