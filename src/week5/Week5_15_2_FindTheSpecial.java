package week5;

/*
5.15.2 Find the special*
easy
|
30 min
|
Share
Description: Write a method called findStringsContainingSpecialChars()
that takes an array of Strings as input. The method should loop through
each element of the array and check if it contains any of the special characters
specified below. If the element contains any of the special characters,
add it to a new array. The method should then return the new array.

plain
Copy code
(',', '.', '!', '?', ';', ':', '-', "&", "#")
Params: An array of Strings. Return: An array of Strings containing elements
from the input array that contain special characters. Example: String[]
inputArray = {"Hello!", "This is a test", "1234", "#$%^&*", "Goodbye!"};
findStringsContainingSpecialChars(inputArray); // Returns {"Hello!", "#$%^&*",
"Goodbye!"} Note: If the input array is empty or does not contain any elements
that contain special characters, return an empty array.
 */
//write your static method here. No need to add Main class or main method

import java.util.Arrays;

public class Week5_15_2_FindTheSpecial {
    public static void main(String[] args) {

        String[] inputArray = {
                "Hello!",
                "This is a test",
                "1234",
                "#$%^&*",
                "Goodbye!"
        };

        String[] result = findStringsContainingSpecialChars(inputArray);

        System.out.println(Arrays.toString(result));

    }

    public static String[] findStringsContainingSpecialChars(String[] inputArray) {

        char[] specialCharacters = {',', '.', '!', '?', ';', ':', '-', '&', '#'};

        String[] result = new String[0];

        for (String character : inputArray) {

            for (char specialChar : specialCharacters) {

                if (character.indexOf(specialChar) != -1) {

                    result = Arrays.copyOf(result, result.length + 1);
                    result[result.length - 1] = character;

                    break;
                }
            }
        }

        return result;
    }
}