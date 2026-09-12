package week2;

import java.util.Scanner;


/*
2.11.4 What is a String?
easy
|
30 min
|
Share
Write a quiz program that asks the user to answer the following question: Expected Output:

plain
Copy code
What is a String?
Y
Correct Answer? X
Where Y is the entered input. and X is a boolean value. If Y is String is a non-primitive data type where the value is a sequence of characters then X should be true otherwise false. sample output:

plain
Copy code
What is a String?
String is a non-primitive data type where the value is a sequence of characters
Correct Answer? true
sample output 2:

plain
Copy code
What is a String?
String is a non-primitive
Correct Answer? false
 */

public class Week2_11_4_WhatIsAString {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.println("What is a String?");
        String whatIsStringAnswer = input.nextLine();
        System.out.println(whatIsStringAnswer);

        boolean correctAnswer = whatIsStringAnswer.equals("String is a non-primitive data type where the value is a sequence of characters");
        System.out.println("Correct Answer? " + correctAnswer);
    }
}
