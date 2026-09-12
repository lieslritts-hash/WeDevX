package week5;

/*
5.12.2 Find the Max Word Length*
easy
|
30 min
|
Share
Write a method called findMaxWord() that takes a String as parameter.
The method should split the input string into an array of Strings
(String[]) using spaces as delimiters. It should then find the longest
word in the array and return it. Delimiter is a space character:

plain
Copy code
" "
Example #1:
Parameter

plain
Copy code
String defaultStr = "The quick brown fox jumps over the lazy dog.
The dog barks, but the fox keeps running"
Return:

plain
Copy code
"running"
Explanation: The input string is split into an array of Strings
containing each word in the sentence. The method then finds the
longest word in the array, which is "running". Note: If the input
string is empty, return an empty string. If there are multiple
words with the same length, return the first one encountered.
 */
//write your static method here. No need to add Main class or main method.

public class Week5_12_2_FindTheMaxWordLength {
    public static void main(String[] args) {

        String defaultStr = "The quick brown fox jumps over the lazy dog. The dog barks, but the fox keeps running";

        System.out.println(findMaxWord(defaultStr));
    }

    public static String findMaxWord(String defaultStr) {

        String[] words = defaultStr.split(" ");

        String maxWord = "";

        for (int i = 0; i < words.length; i++) {

            if (words[i].length() > maxWord.length()) {
                maxWord = words[i];
            }
        }

        return maxWord;
    }
}
