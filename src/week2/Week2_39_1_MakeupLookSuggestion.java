package week2;

import java.util.Scanner;

/*
2.39.1 Makeup Look Suggestion*
easy
|
30 min
|
Share
Write a program that prompts the user to enter their eye
color (blue, green, brown, or hazel) and hair color
(blonde, brown, black, or red) and suggests a makeup
look based on their input.

If the user has blue or green eyes, and blonde or brown
hair, the program should print out We suggest a natural
makeup look. If the user has blue or green eyes, and black
or red hair, the program should print out We suggest a bold
lip look. If the user has brown or hazel eyes, the program
should print out We suggest a smokey eye look. Otherwise the
program should print out Sorry, we couldn't identify your eye
color or hair color.

Example #1:
Input (using Scanner):

java
Copy code
String eyeColor = "blue"
String hairColor = "blonde"
Output:

plain
Copy code
Enter your eye color (blue, green, brown, or hazel):
Enter your hair color (blonde, brown, black, or red):
We suggest a natural makeup look
Example #2:
Input:

java
Copy code
String eyeColor = "blue"
String hairColor = "black"
Output:

plain
Copy code
Enter your eye color (blue, green, brown, or hazel):
Enter your hair color (blonde, brown, black, or red):
We suggest a bold lip look
Example #3:
Input:

java
Copy code
String eyeColor = "hazel"
String hairColor = "black"
Output:

plain
Copy code
Enter your eye color (blue, green, brown, or hazel):
Enter your hair color (blonde, brown, black, or red):
We suggest a smokey eye look
Example #4:
Input:

java
Copy code
String eyeColor = "Yellow"
String hairColor = "Orange"
Output:

plain
Copy code
Enter your eye color (blue, green, brown, or hazel):
Enter your hair color (blonde, brown, black, or red):
Sorry, we couldn't identify your eye color or hair color
 */

public class Week2_39_1_MakeupLookSuggestion {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your eye color (blue, green, brown, or hazel):");
        String eyeColor = sc.nextLine();

        System.out.println("Enter your hair color (blonde, brown, black, or red):");
        String hairColor = sc.nextLine();

        if (eyeColor.equals("brown") || eyeColor.equals("hazel")) {
            System.out.println("We suggest a smokey eye look");
        } else if (eyeColor.equals("blue") && hairColor.equals("blonde")) {
            System.out.println("We suggest a natural makeup look");
        } else if(eyeColor.equals("blue") && hairColor.equals("brown")) {
            System.out.println("We suggest a natural makeup look");
        } else if(eyeColor.equals("green") && hairColor.equals("blonde")) {
            System.out.println("We suggest a natural makeup look");
        } else if(eyeColor.equals("green") && hairColor.equals("brown")) {
            System.out.println("We suggest a natural makeup look");
        } else if (eyeColor.equals("blue") && hairColor.equals("black")) {
            System.out.println("We suggest a bold lip look");
        } else if (eyeColor.equals("blue") && hairColor.equals("red")) {
            System.out.println("We suggest a bold lip look");
        } else if (eyeColor.equals("green") && hairColor.equals("black")) {
            System.out.println("We suggest a bold lip look");
        } else if (eyeColor.equals("green") && hairColor.equals("red")) {
            System.out.println("We suggest a bold lip look");
        } else {
            System.out.println("Sorry, we couldn't identify your eye color or hair color");
        }
    }
}
