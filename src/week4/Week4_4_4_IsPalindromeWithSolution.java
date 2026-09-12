package week4;

/*
4.4.4 isPalindrome (with solution)
easy
|
30 min
|
Share
Write a static method called isPalindrome() that accepts a String as a parameter and returns true if the string is a palindrome and false otherwise. A palindrome is a word or phrase that reads the same backward as forward.

Example:
plain
Copy code
Input: "racecar"
Output: true

Input: "madam"
Output: true

Input: "hello"
Output: false
Hint
You can use 2 counters: left and right to compare chars
with if-statement, and return false if even 1 time chars
don't match, otherwise return true

Video solution:
https://youtu.be/4xXeqwDc6pA
 */
//1.prepare word -> convert to same case
//racejar -> c != j -> return false
//2. Create two points, navigate from both ends to the middle
//3. Return true if two points become equal to each other;
//and false if left and right characters are not equal

public class Week4_4_4_IsPalindromeWithSolution {
    public static void main(String[] args) {

        System.out.println(isPalindrome("racecar")); // true
        System.out.println(isPalindrome("madam"));   // true
        System.out.println(isPalindrome("hello"));   // false

    }

    public static boolean isPalindrome(String word) {

        word = word.toLowerCase();

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
