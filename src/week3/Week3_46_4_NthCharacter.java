package week3;

/*
3.46.4 Nth Character
easy
|
30 min
|
Share
Write a method called findNthLetter() that accepts a String and an index (int) as parameters and returns the char at the specified index. If the index is out of range, return 'E' (Error).

Example of result:
plain
Copy code
Input: "Hello World", 2
Output: 'l'

Input: "Today is a great day", 4
Output: 'y'

Input: "12345", 3
Output: '4'
 */
//write your static method here. No need to add Main class or main method.

public class Week3_46_4_NthCharacter {
    public static void main(String[] args) {

        System.out.println(findNthLetter("Hello World", 2));
        System.out.println(findNthLetter("Today is a great day", 4));
        System.out.println(findNthLetter("12345", 3));

    }

    public static char findNthLetter(String str, int index) {

        if (index < 0 || index >= str.length()) {
            return 'E';
        }

        return str.charAt(index);
    }
}
