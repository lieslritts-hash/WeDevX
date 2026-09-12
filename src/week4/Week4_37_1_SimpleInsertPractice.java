package week4;

/*
4.37.1 Simple insert practice*
easy
|
30 min
|
Share
Description: Create a method called insertCharacters() that takes two
parameters: a string and a character. The method should return a new
string where the character is inserted after every character in the
original string. For example, if the original string is "hello" and the
character is '_', the method should return "h_e_l_l_o". Params: A string
and a character. Return: A new string where the character is inserted after
every character in the original string. Note: No character should be inserted
after the last character

Input: hello * Return: h*e*l*l*o

Input: world - Return: w-o-r-l-d

Input: "" * //empty string Return: "" //empty string
 */
//write your static method here. No need to add Main class or main method.

public class Week4_37_1_SimpleInsertPractice {
    public static void main(String[] args) {

        insertCharacters("hello", '*');
        insertCharacters("world", '-');
        insertCharacters("", '*');

    }

    public static String insertCharacters(String sentence, char character) {

        StringBuilder result = new StringBuilder();

        for (int i = 1; i < sentence.length(); i += 2) {
            result.insert(i, character);
            }
        return result.toString();
        }
}