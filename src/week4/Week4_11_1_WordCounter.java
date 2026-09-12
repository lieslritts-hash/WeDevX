package week4;

/*
4.11.1 Word Counter*
easy
|
30 min
|
Share
The program should take a sentence as input and count the number of words in it using a while loop. A word is defined as a sequence of characters separated by one or more spaces. The program should ignore any leading or trailing spaces in the input sentence.

Input: The user should input a sentence. Output: The program should output the number of words in the sentence.

Example #1:
Input:

plain
Copy code
The quick brown fox jumps over the lazy dog.
Output:

plain
Copy code
Enter a sentence:
Number of words: 9
Hint: Use a while loop to iterate through the characters of the sentence and count the number of whitespaces + 1 (e.g. if there is only 1 word in a sentence, then it will be 0 whitespaces + 1, 2 words = 1 whitespace + 1)
 */


import java.util.Scanner;

public class Week4_11_1_WordCounter {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a sentence:");
        String sentence = sc.nextLine();

        System.out.println("Number of words: " + countWords(sentence));

        sc.close();

    }

        public static int countWords(String sentence) {

            String trimmed = sentence.trim();
            int wordCount = 1;
            int index = 0;

            while (index < trimmed.length()) {
                if (trimmed.charAt(index) == ' ') {
                wordCount++;
                //skip any conditional consecutive spaces
                while (index < trimmed.length() && trimmed.charAt(index) == ' ') {
                    index++;
                }
                } else{
                    index++;
                }
            }
            return wordCount;
        }
}
