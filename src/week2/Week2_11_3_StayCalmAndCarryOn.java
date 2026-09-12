package week2;

import java.util.Scanner;

/*
2.11.3 Stay Calm and Carry On*
easy
|
30 min
|
Share
Write a program that asks the user to finish the sentence: if
the user enters Carry On then the program should print out
Correct answer: true otherwise false. Expected Output:

plain
Copy code
Stay Calm and
Stay Calm and Y
Correct answer: X
Where the Y an entered String. X is a boolean answer.
 */

public class Week2_11_3_StayCalmAndCarryOn {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.println("Stay Calm and");
        String userAnswer = input.nextLine();
        System.out.println("Stay Calm and " + userAnswer);

        boolean answerMatches = userAnswer.equals("Carry On");
        System.out.println("Correct answer: " + answerMatches);
    }
}
