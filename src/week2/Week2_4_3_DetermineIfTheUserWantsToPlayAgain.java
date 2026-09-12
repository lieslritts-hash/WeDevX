package week2;

import java.util.Scanner;

/*
2.4.3 Determine if the User Wants to Play Again
easy
|
30 min
|
Share
Write a program that uses a Scanner object to read a
user's input. The program should print the user's input.

Example of result:
plain
Copy code
Do you want to play again? (true/false)
true

Do you want to play again? (true/false)
false
 */

public class Week2_4_3_DetermineIfTheUserWantsToPlayAgain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Do you want to play again? (true/false)");
        boolean playAgain = input.nextBoolean();
        System.out.println(playAgain);
    }
}
