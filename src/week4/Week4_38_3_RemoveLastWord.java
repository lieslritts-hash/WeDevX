package week4;

/*
4.38.3 Remove Last Word*
easy
|
30 min
|
Share
Create a static method named removeLastWord() that takes a String as a parameter and removes the last word from it. A word is defined as any sequence of non-space characters. You should use StringBuilder to manipulate the input string. If the string doesn't contain spaces, the method should return the empty string. Then print the result string. You can use any learned String and StringBuilder methods, such as lastIndexOf, delete, length, contains and other.

Parameters:
input (String): The original string from which the last word needs to be removed. Return Type: void

Example #1:
Parameters:

plain
Copy code
String input = "Hello world"
Return: void Output:

plain
Copy code
Hello
Example #2:
Parameters:

plain
Copy code
String input = "SingleWord"
Return: void Output:
 */
//write your static method here. No need to add Main class or main method or import anything


public class Week4_38_3_RemoveLastWord {
    public static void main(String[] args) {

        removeLastWord("Hello world");
        removeLastWord("SingleWord");

    }

    public static void removeLastWord(String str) {

        StringBuilder sb = new StringBuilder(str);

        int index = sb.lastIndexOf(" ");

        if (index == -1) {
            System.out.println("");
            return;
        }

        sb.delete(index, sb.length());

        System.out.println(sb);
    }
}