package week4;

/*
4.41.3 Count words in String
easy
|
30 min
|
Share
Description: Write a method called wordCount() that takes a string as input
and returns the number of words in the string. A word is defined as any
sequence of non-space characters surrounded by one or more spaces. Params:
A string. Return: An integer representing the number of words in the string.
Example:

plain
Copy code
wordCount("This is a sentence."); // Returns 4
wordCount("       Here      are       some          extra            spaces ");
// Returns 4
wordCount("NoSpacesHere"); // Returns 1
: Use only StringBuilder methods, no arrays and other collections
 */
//write your static method here. No need to add Main class or main method.


public class Week4_41_3_CountWordsInString {
    public static void main(String[] args) {

        System.out.println(wordCount("This is a sentence."));
        System.out.println(wordCount("       Here      are       some          extra            spaces "));
        System.out.println(wordCount("NoSpacesHere"));

    }

    public static int wordCount(String str) {

        StringBuilder sb = new StringBuilder(str);

        int counter = 0;

        for (int i = 0; i < sb.length(); i++) {

            if (sb.charAt(i) != ' ') {

                if (i == 0 || sb.charAt(i - 1) == ' ') {
                    counter++;
                }
            }
        }

        return counter;
    }
}
