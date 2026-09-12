package week4;

/*
4.6.5 Remove Spaces
easy
|
30 min
|
Share
Create a static method named removeSpaces() that takes 1 parameter String. It should removes all spaces from the string using a while loop and returns the modified String.

Examples:
plain
Copy code
Params: "NoSpacesHere"
Return: "NoSpacesHere"

Params: " Java Programming is Fun "
Return: "JavaProgrammingisFun"
 */

public class Week4_6_5_RemoveSpaces {
    public static void main(String[] args) {

        System.out.println(removeSpaces("NoSpacesHere"));
        System.out.println(removeSpaces(" Java Programming is Fun "));
    }

    public static String removeSpaces(String str) {

        int counter = 0;
        String result = "";

        while (counter < str.length()) {

            char currentCharacter = str.charAt(counter);

            if (currentCharacter != ' ') {
                result = result + currentCharacter;
            }

            counter++;
        }

        return result;
    }
}