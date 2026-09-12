package week2;

import java.util.Scanner;

/*
2.39 If Else If Else With Conditional Operators
Enhance your Java programming skills as this video
demonstrates how to effectively use conditional operators
 with if-else-if-else statements for powerful and efficient
 decision-making structures.
 */

public class Week2_3_IfElseIfElseWithConditionalOperators {
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
