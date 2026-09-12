package week4;

/*
4.19.1 Replace vowels*
easy
|
30 min
|
Share
Description: Create a method called replaceVowels() that takes a string as input and replaces all vowels
in the string with the character "*". Vowels are defined as the letters "a", "e", "i", "o", and "u", both
uppercase and lowercase. Params: A string containing characters. Return: A string with all vowels replaced
with the character "*".

Input: Hello, World! Return: H*ll*, W*rld! Output:

plain
Copy code
String without vowels: H*ll*, W*rld!
Input: Welcome to Wedevx Return: W*lc*m* t* W*d*vx Output:

plain
Copy code
String without vowels: W*lc*m* t* W*d*vx
Input: This is a sentence with multiple spaces Return: Th*s *s * s*nt*nc* w*th m*lt*pl* s*p*c*s Output:

plain
Copy code
String without vowels: Th*s *s * s*nt*nc* w*th m*lt*pl* s*p*c*s
Input: " " Return: "" Output:

plain
Copy code
String without vowels:
: In the last example, the input string contains only whitespace characters, so it should return an empty string.
 */

public class Week4_19_1_ReplaceVowels {
    public static void main(String[] args) {

        System.out.println(replaceVowels("Hello, World!"));
        System.out.println(replaceVowels("Welcome to Wedevx"));
        System.out.println(replaceVowels("This is a sentence with multiple spaces"));
        System.out.println(replaceVowels("        "));
    }

    public static String replaceVowels(String str) {

       String result = "";

        for (int index = 0; index <= str.length()-1; index++) {

            if (str.charAt(index) == 'a' || str.charAt(index) == 'A') {
                result = result + "*";
            } else if (str.charAt(index) == 'e' || str.charAt(index) == 'E') {
                result = result + "*";
            } else if (str.charAt(index) == 'i' || str.charAt(index) == 'I') {
                result = result + "*";
            } else if (str.charAt(index) == 'o' || str.charAt(index) == 'O') {
                result = result + "*";
            } else if (str.charAt(index) == 'u' || str.charAt(index) == 'U') {
                result = result + "*";
            } else {
                result = result + str.charAt(index);
            }
        }
        return result;
    }
}
