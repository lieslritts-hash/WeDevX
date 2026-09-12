package week4;

/*
4.41.2 Unique chars*
easy
|
30 min
|
Share
Write a method called uniqueCharacters() that takes a string as input and returns true if all characters in the string are unique, or false otherwise. Make sure the method is case-insensitive. Here are the conditions for the method:

The input string may be empty.

The method should use only the following methods from the StringBuilder class: length(), charAt(int index), and indexOf(String str, int fromIndex).

Return: boolean - true if all characters in the string are unique, or false otherwise.

Example #1:
Parameter:

plain
Copy code
String sentence = "abcdefg"
Returns:

plain
Copy code
true
Example #2:
Parameter:

plain
Copy code
String sentence = "ABCa123"
Returns:

plain
Copy code
false
Example #3:
Parameter:

plain
Copy code
String sentence = ""
Returns:

plain
Copy code
true
 */
//write your static method here. No need to add Main class or main method.

public class Week4_41_2_UniqueChars {
    public static void main(String[] args) {

        System.out.println(uniqueCharacters("abcdefg"));
        System.out.println(uniqueCharacters("ABCa123"));
        System.out.println(uniqueCharacters(""));

    }

    public static boolean uniqueCharacters(String input) {

        StringBuilder sb = new StringBuilder(input.toLowerCase());

        for (int i = 0; i < input.length(); i++) {

            String character = "" + sb.charAt(i);

            if (sb.indexOf(character, i + 1) != -1) {
               return false;
            }
        }

        return true;
    }
}
