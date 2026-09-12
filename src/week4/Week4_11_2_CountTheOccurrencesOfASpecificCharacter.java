package week4;

/*
4.11.2 Count the occurrences of a specific character*
easy
|
30 min
|
Share
Implement the static method called countCharOccurrences() that takes a String and a char as a parameters and count the number of occurrences of that character in the given string using a while loop. If the character doesn't occur in the string then return out -1.

Return Type: int

Example #1:
Parameters:

plain
Copy code
String str = "hello world"
char ch = 'l'
Return:

plain
Copy code
3
Example #2:
Parameters:

plain
Copy code
String str = "programming is fun"
char ch = 'z'
Return:

plain
Copy code
-1
Example #3:
Parameters:

plain
Copy code
String str = "hello"
char ch = 'o'
Return:

plain
Copy code
1
The program should be case-sensitive. For example, if the user inputs 'H' to search for occurrences of the uppercase letter 'H', it should not count occurrences of the lowercase letter 'h'.
 */

public class Week4_11_2_CountTheOccurrencesOfASpecificCharacter {
    public static void main(String[] args) {

        System.out.println(countCharOccurrences("hello world", 'l'));
        System.out.println(countCharOccurrences("programming is fun", 'z'));
        System.out.println(countCharOccurrences("hello", 'o'));
    }

    public static int countCharOccurrences(String str, char ch) {

        int count = 0;
        int index = 0;

        while (index < str.length()) {
            if (str.charAt(index) == ch) {
                count++;
            }
            index++;
        }

            if (count == 0) {
                return -1;
            }

            return count;
    }
}
