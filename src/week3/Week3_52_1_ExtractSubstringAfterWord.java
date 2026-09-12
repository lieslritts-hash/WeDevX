package week3;

/*
3.52.1 Extract Substring After Word*
easy
|
30 min
|
Share
Description: Write a Java static method called extractSubstringAfterWord() that reads a sentence from the user and extracts a substring after a given word. Param: The method should take two inputs: A string representing the sentence to be analyzed. A string representing the word after which the substring should be extracted. Return: The method should return a string that represents the substring after the given word in the input sentence. Task: The method should search for the given word in the input sentence, and if it is found, extract the substring after it. If the word is not found, the method should return an empty string. Examples of using the method with different inputs:

plain
Copy code
extractSubstringAfterWord("I love programming and coding", "programming") -> returns " and coding"
extractSubstringAfterWord("Java is a popular programming language", "Python") -> returns ""
extractSubstringAfterWord("The quick brown fox jumps over the lazy dog", "over") -> returns " the lazy dog"
 */
//write your static method here. No need to add Main class or main method.

public class Week3_52_1_ExtractSubstringAfterWord {
    public static void main(String[] args) {

        System.out.println(extractSubstringAfterWord(
                "I love programming and coding", "programming")); //returns " and coding"
        System.out.println(extractSubstringAfterWord(
                "Java is a popular programming language", "Python")); //returns ""
        System.out.println(extractSubstringAfterWord(
                "The quick brown fox jumps over the lazy dog", "over")); //returns " the lazy dog"

    }

    public static String extractSubstringAfterWord(String str, String word) {
        int index = str.indexOf(word);

        if (index == -1) {
            return "";
        } else {
            return str.substring(index + word.length());
        }
    }
}
