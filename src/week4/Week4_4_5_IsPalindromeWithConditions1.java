package week4;

/*
4.4.5 isPalindrome with conditions 1
easy
|
30 min
|
Share
Write a static method isPalindromeIgnoreWhitespace()
that accepts a String and a Boolean as parameters and
returns true if the string is a palindrome and false
otherwise. If the Boolean param is true, whitespace
characters should be ignored when checking for palindrome.
A palindrome is a word or phrase that reads the same
backward as forward.

plain
Copy code
Input: "ra ceca r",true
Output: true

Input: "ma dam",false
Output: false

Input: "ma dam",true
Output: true

Input: "he llo",true
Output: false
 */

public class Week4_4_5_IsPalindromeWithConditions1 {
    public static void main(String[] args) {

        System.out.println(isPalindromeIgnoreWhitespace("ra ceca r", true));  // true
        System.out.println(isPalindromeIgnoreWhitespace("ma dam", false));   // false
        System.out.println(isPalindromeIgnoreWhitespace("ma dam", true));    // true
        System.out.println(isPalindromeIgnoreWhitespace("he llo", true));

    }

    public static boolean isPalindromeIgnoreWhitespace(String word, boolean ignoreWhitespace) {
        word = word.toLowerCase();

        if (ignoreWhitespace) {
            word = word.replace(" ", "");
        }

        int left = 0;
        int right = word.length() -1;

        while (left < right) {

            if (word.charAt(left) != word.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
