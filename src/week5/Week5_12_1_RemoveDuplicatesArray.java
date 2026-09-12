package week5;

/*
5.12.1 Remove duplicates Array
easy
|
30 min
|
Share
Write a method called removeDuplicatesFromString() that takes a String as parameter. The method should split the input string into an array of Strings using spaces as delimiters. It should then remove all occurrences of the word if it's repeated more than one time, regardless of case, spaces at the beginning or at the end. Use String's trim() and equalsIgnoreCase() methods, Array's length property, also use loops and implement as much arrays as you need (look at example). Return Type: String[]

Example:
Parameters:

plain
Copy code
String inputString = "The quick brown fox jumps over the lazy dog The lazy dog is quick"
Subresult:
plain
Copy code
...
String[] array = ["The", "quick", "brown", "fox", "jumps", "over", "the", "lazy", "dog", "The", "lazy", "dog", "is", "quick"];
String[] subResult = new String[array.length]; // initializing new array named subResult which have the same length as array
int counter = 0; // initializing the counter which should count each time when the word puts to the array
subResult = ["brown", "fox", "jumps", "over", "is", null, null, null, null, null, null, null, null, null];
counter = 5;
String[] finalResult = new String[counter]; // initializing the string array with length of unique words array without null values
...
Return:
plain
Copy code
["brown", "fox", "jumps", "over", "is"]
: If the input string is empty, return an empty array

Solution
java
Copy code
public static String[] removeDuplicatesFromString(String inputString) {
    String[] array = inputString.trim().split(" ");
    String[] result = new String[array.length];
    int index = 0;
    for (int i = 0; i < array.length; i++) {
        String word = array[i].trim();
        if (!word.isEmpty()) {
            int counter = 0;
            for (int j = 0; j < array.length; j++) {
                if (array[j].trim().equalsIgnoreCase(word)) {
                    counter++;
                    if (counter == 2) break;
                }
            }
            if (counter == 1) result[index++] = word;
        }
    }
    String[] finalResult = new String[index];
    for (int i = 0; i  < finalResult.length; i++) {
        finalResult[i] = result[i];
    }
    return finalResult;
}
 */

import java.util.Arrays;
public class Week5_12_1_RemoveDuplicatesArray {
    public static void main(String[] args) {

        String inputString = "The quick brown fox jumps over the lazy dog The lazy dog is quick";

        String[] answer = removeDuplicatesFromString(inputString);

        System.out.println(Arrays.toString(answer));
    }

    public static String[] removeDuplicatesFromString(String inputString) {

        String[] array = inputString.trim().split(" ");

        String[] result = new String[array.length];

        int index = 0;

        for (int i = 0; i < array.length; i++) {

            String word = array[i].trim();

            int counter = 0;

            for (int j = 0; j < array.length; j++) {

                if (array[j].trim().equalsIgnoreCase(word)) {
                    counter++;
                }
            }

            if (counter == 1) {
                result[index] = word;
                index++;
            }
        }

        String[] finalResult = new String[index];

        for (int i = 0; i < finalResult.length; i++) {
            finalResult[i] = result[i];
        }

        return finalResult;
    }
}