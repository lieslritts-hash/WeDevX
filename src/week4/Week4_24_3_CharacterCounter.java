package week4;

/*
4.24.3 Character Counter
easy
|
30 min
|
Share
Create a static method named countCharacter() that takes two parameters: a String and a char. The method should use a for loop to iterate through the given string and count how many times the specified character appears. If the character is found, print a message indicating the match along with the count (look at example). If it's not found at the current position, use the continue statement. Finally, return the total count, return 0 if no occurrences found. Total count will be printed automatically. Return Type: int

Example:
Parameters:

plain
Copy code
String str = "programming is fun"
char ch = 'g'
Return:

plain
Copy code
2
Output:

plain
Copy code
Match found at index 3
Match found at index 10
 */

public class Week4_24_3_CharacterCounter {
    public static void main(String[] args) {

        countCharacter("programming is fun", 'g');

    }

    public static int countCharacter(String str, char ch) {

        int count = 0;

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) != ch) {
                continue;
            }
            count++;
            System.out.println("Match found at index " + i);
        }

        return count;
    }
}
