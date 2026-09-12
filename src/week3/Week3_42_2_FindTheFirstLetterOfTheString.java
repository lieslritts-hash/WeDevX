package week3;

/*
3.42.4 Find the First Letter of The String
easy
|
30 min
|
Share
Write a static method called findFirstLetter() that accepts a sentence as a String parameter and returns the first letter of the string as a char.

Example of output:
plain
Copy code
Input: "Hello World"
Output: 'H'

Input: "Today is a great day"
Output: 'T'

Input: "12345"
Output: '1'

Input: "987 654 321"
Output: '9'
 */
//write your static method here. No need to add Main class or main method.

public class Week3_42_2_FindTheFirstLetterOfTheString {
    public static void main(String[] args) {
        String result1 = findFirstLetter("Hello World");
        System.out.println(result1);

        String result2 = findFirstLetter("Today is a great day");
        System.out.println(result2);

        String result3 = findFirstLetter("12345");
        System.out.println(result3);

        String result4 = findFirstLetter("987 654 321");
        System.out.println(result4);
    }

    public static String findFirstLetter(String sentence) {
        char firstLetter = sentence.charAt(0);

        return "" + firstLetter;
    }
}
