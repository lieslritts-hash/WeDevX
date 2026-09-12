package week4;

/*
4.40.5 Reverse odd words
easy
|
30 min
|
Share
Exercise Description: Write a method called reverseWordsWithDigits() that takes a string as input and modifies it according to the following conditions:

The input string may contain any number of words separated by digits.

On each occurrence of a digit within the string, replace the digit with whitespace.

Between each occurrence of a digit, reverse the substring of characters in the word from the previous digit to the current digit. Only reverse the substrings between odd occurrences of digits.

Params: String Return: A modified String where digits are replaced by whitespace, and substrings between odd occurrences of digits are reversed. Example 1:

plain
Copy code
Input: "This8is0complex7sentence"
Output: "sihT is xelpmoc sentence"
Example 2:

plain
Copy code
Input: "Any1number1of0words3and4digits7can2be8present"
Output: "ynA number fo words dna digits nac be tneserp"
In both examples, only odd-located words are reversed.
 */
//write your static method here. No need to add Main class or main method.


public class Week4_40_5_ReverseOddWords {
    public static void main(String[] args) {

        System.out.println(reverseWordsWithDigits("This8is0complex7sentence"));
        System.out.println(reverseWordsWithDigits("Any1number1of0words3and4digits7can2be8present"));

    }

    public static String reverseWordsWithDigits(String str) {

        StringBuilder sb = new StringBuilder(str);

        int wordStart = 0;
        int wordNumber = 1;

        for (int i = 0; i < sb.length(); i++) {

            char current = sb.charAt(i);

            if (current >= '0' && current <= '9') {

                if (wordNumber % 2 == 1) {

                    StringBuilder word = new StringBuilder();

                    for (int j = wordStart; j < i; j++) {
                        word.append(sb.charAt(j));
                    }

                    word.reverse();

                    for (int j = wordStart; j < i; j++) {
                        sb.replace(j, j + 1, String.valueOf(word.charAt(j - wordStart)));
                    }
                }

                sb.replace(i, i + 1, " ");

                wordStart = i + 1;
                wordNumber++;
            }
        }

        if (wordNumber % 2 == 1) {

            StringBuilder word = new StringBuilder();

            for (int j = wordStart; j < sb.length(); j++) {
                word.append(sb.charAt(j));
            }

            word.reverse();

            for (int j = wordStart; j < sb.length(); j++) {
                sb.replace(j, j + 1, String.valueOf(word.charAt(j - wordStart)));
            }
        }

        return sb.toString();
    }
}