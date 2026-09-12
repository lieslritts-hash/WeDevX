package week4;

/*
4.40.3 Conditional reverse*
easy
|
30 min
|
Share
Write a method called reverseString() that takes a string as input and returns the reversed string only if it contains an odd number of spaces. If a number of spaces is even, return Can't reverse.

Return Type: StringBuilder

Example #1:
Parameters:

plain
Copy code
String input = "hello world"
Return:

plain
Copy code
"dlrow olleh"
Example #2:
Parameters:

plain
Copy code
String input = "abcdef ghijklmnopqr stuvwxyz"
Return:

plain
Copy code
"Can't reverse"
Example #3:
Parameters:

plain
Copy code
String input = ""
Return:

plain
Copy code
"Can't reverse"
Example #4:
Parameters:

plain
Copy code
String input = " "
Return:

plain
Copy code
" "
 */
//write your static method here. No need to add Main class or main method.


public class Week4_40_3_ConditionalReverse {
    public static void main(String[] args) {

        System.out.println(reverseString("hello world"));
        System.out.println(reverseString("abcdef ghijklmnopqr stuvwxyz"));
        System.out.println(reverseString(""));
        System.out.println(reverseString(" "));

    }

    public static StringBuilder reverseString(String str) {

        StringBuilder sb = new StringBuilder(str);

        int spaceCount = 0;

        for (int i = 0; i < sb.length(); i++) {

            if (sb.charAt(i) == ' ') {
                spaceCount++;
            }
        }

        if (spaceCount % 2 == 1) {
            sb.reverse();
            return sb;
        }
        return new StringBuilder("Can't reverse");
    }
}
