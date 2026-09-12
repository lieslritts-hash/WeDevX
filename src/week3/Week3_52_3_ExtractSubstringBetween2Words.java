package week3;

/*
3.52.3 Extract substring between 2 words
easy
|
30 min
|
Share
Description: Write a static method called extractBetween2Words() that reads a sentence from the user and extracts a substring between two given words. 3 Params:

A string representing the sentence.

A string representing the starting word of the desired substring

A string representing the ending word of the desired substring.

Return: A string representing the extracted substring. Both starting and ending words should be excluded from the final String. if the ending word is not found, return the String from starting word till the end of the String if the starting word is not found, return the from the String from the beginning(index 0) till the ending word if both starting and ending words are not found then return "Invalid input, starting word and ending words not found" Expected Output:

plain
Copy code
extractBetween2Words("I like to eat pizza", "I", "pizza");//"I like to eat "
extractBetween2Words("The cat in the hat", "cat", "hat");//" in the "
extractBetween2Words("The quick brown fox jumps over the lazy dog.", "quick", "over");//" brown fox jumps "

//if the ending word is not found
extractBetween2Words("Hello wedevx SDET Superstar", "wedevx", "astronaut");//" SDET Superstar"

//if the starting word is not found
extractBetween2Words("Hello wedevx SDET Superstar", "SpaceX", "SDET");//"Hello wedevx "
 */
//write your static method here. No need to add Main class or main method.


public class Week3_52_3_ExtractSubstringBetween2Words {
    public static void main(String[] args) {

        System.out.println(extractBetween2Words(
                "I like to eat pizza", "I", "pizza")); //"I like to eat "
        System.out.println(extractBetween2Words(
                "The cat in the hat", "cat", "hat")); //" in the "
        System.out.println(extractBetween2Words(
                "The quick brown fox jumps over the lazy dog.", "quick", "over")); //" brown fox jumps "
        System.out.println(extractBetween2Words(
               "Hello wedevx SDET Superstar", "wedevx", "astronaut")); //" SDET Superstar"
        System.out.println(extractBetween2Words(
                "Hello wedevx SDET Superstar", "SpaceX", "SDET")); //"Hello wedevx "
    }

    public static String extractBetween2Words(String sentence, String startingWord, String endingWord) {
        int startIndex = sentence.indexOf(startingWord);
        int endIndex = sentence.indexOf(endingWord);

        if (startIndex == -1 && endIndex == -1) {
            return "Invalid input, starting word and ending words not found";
        } else if (startIndex == -1) {
                return sentence.substring(0, endIndex);
        } else if (endIndex == -1) {
                return sentence.substring(startIndex + startingWord.length());
        } else {
                return sentence.substring(startIndex + startingWord.length(), endIndex);
        }
    }
}
