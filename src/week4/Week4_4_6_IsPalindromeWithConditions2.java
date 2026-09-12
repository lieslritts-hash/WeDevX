package week4;

/*
4.4.6 isPalindrome with conditions 2
easy
|
30 min
|
Share
Write a static method called isPalindromeIgnoreDigit() that accepts a String and a Boolean as parameters and returns true if the string is a palindrome and false otherwise. If the Boolean param is true, digits should be ignored when checking for palindrome. A palindrome is a word or phrase that reads the same backward as forward.

plain
Copy code
Input: "re2di1vide33r",true
Output: true

Input: "re2di1vide33r",false
Output: false

Input: "ro1ta2v2at1or",false
Output: true

Input: "ro1ta2v2at1or",true
Output: true

Input: "di2gi13ts",true
Output: false

Input: "di2gi13ts",false
Output: false

Input: "digits",true
Output: false
 */

public class Week4_4_6_IsPalindromeWithConditions2 {
    public static void main(String[] args) {

        System.out.println(isPalindromeIgnoreDigit("re2di1vide33r",true));  // true
        System.out.println(isPalindromeIgnoreDigit("re2di1vide33r",false));    // false
        System.out.println(isPalindromeIgnoreDigit("ro1ta2v2at1or",false));    // true
        System.out.println(isPalindromeIgnoreDigit("ro1ta2v2at1or",true)); // true
        System.out.println(isPalindromeIgnoreDigit("di2gi13ts",true)); // false
        System.out.println(isPalindromeIgnoreDigit("di2gi13ts",false)); // false
        System.out.println(isPalindromeIgnoreDigit("digits",true)); // false
    }

    public static boolean isPalindromeIgnoreDigit(String word, boolean ignoreDigit) {
        word = word.toLowerCase();

        int left = 0;
        int right = word.length() - 1;

        while (left < right) {

            if (ignoreDigit) {

                while (left < right && word.charAt(left) >= '0' && word.charAt(left) <= '9') {
                    left++;
            }

            while (left < right && word.charAt(right) >= '0' && word.charAt(right) <= '9') {
                right--;
            }
        }

            if (word.charAt(left) != word.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }
        return true;
    }
}
