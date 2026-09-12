package week4;

/*
4.6.4 Character Search
easy
|
30 min
|
Share
Create a static method named searchCharacter() that takes 2 parameters: String and char. It should search for the given character within the string using a while loop. The method should return the int number of times the character appears in the string.

Example:
plain
Copy code
Params: "hello world", 'l'
Return: 3

Params: "programming is fun", 'g'
Return: 2

Params: "apple", 'y'
Return: 0
 */

public class Week4_6_4_CharacterSearch {
    public static void main(String[] args) {

        System.out.println(searchCharacter("hello world", 'l'));
        System.out.println(searchCharacter("programming is fun", 'g'));
        System.out.println(searchCharacter("apple", 'y'));

    }

    public static int searchCharacter(String sentence, char character) {

        int counter = 0;
        int count = 0;

        while (counter < sentence.length()) {

            char currentCharacter = sentence.charAt(counter);

            if (currentCharacter == character) {
                count++;
            }

            counter++;
        }

        return count;
    }
}