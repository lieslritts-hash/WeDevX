package week4;

/*
4.23.3 Vowel Detector*
easy
|
30 min
|
Share
Create a static method named detectVowels() that takes a String as a parameter. Implement a for loop to iterate through the characters in the input string. Within the loop, check if each character is a vowel (a, e, i, o, or u). If a vowel is found, print a message indicating the position (index) and the vowel detected (look at example). If a character is not a vowel, use the continue statement to skip it. The method shouldn't return anything. Return Type: void

Example:
Parameters:

plain
Copy code
String str = "Hello, World!"
Return:

plain
Copy code
Vowel detected at position 1: e
Vowel detected at position 4: o
Vowel detected at position 8: o

 */

public class Week4_23_3_VowelDetector {
    public static void main(String[] args) {

        detectVowels("Hello, World!");
    }

    public static void detectVowels(String str) {

        for (int i = 0; i < str.length(); i++) {
            char letter = str.charAt(i);

            if (letter != 'a'
                    && letter != 'e'
                    && letter != 'i'
                    && letter != 'o'
                    && letter != 'u') {
                continue;
            }
            System.out.println("Vowel detected at position " + i + ": " + letter);
        }
    }
}