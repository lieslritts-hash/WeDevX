package week4;

/*
4.13.2 Password Guessing Game*
easy
|
30 min
|
Share
Create a password guessing game where the user has to guess the correct password. Initially, set a predefined password. The user keeps guessing until they enter the correct password or choose to quit. Use a do-while loop to keep the game running. Requirements:

Set a predefined password wedevx2023

Prompt the user to enter their password guess.

Use a do-while loop to repeatedly ask for guesses until the correct password is guessed or the user chooses to quit.

Provide feedback to the user if their guess is incorrect.

Allow the user to quit the game by typing "quit".

Display a congratulatory message when the correct password is guessed.

Display an exit message when user writes "quit".

Example of the outputs:
plain
Copy code
Welcome to the Password Guessing Game!
Guess the password:
> mypassword
Incorrect password. Try again or type "quit" to exit.

Guess the password:
> secret
Incorrect password. Try again or type "quit" to exit.

Guess the password:
> wedevx2023
Congratulations! You guessed the correct password.
plain
Copy code
Welcome to the Password Guessing Game!

Guess the password:
> Password123
Incorrect password. Try again or type "quit" to exit.

Guess the password:
> quit
Exiting the game.
Example of the code
java
Copy code
import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        String correctPassword = "wedevx2023";
        String guess;
        System.out.println("Welcome to the Password Guessing Game!");
        do {
            System.out.println("Guess the password:");
            guess = scanner.nextLine();

            if (guess.equals(correctPassword)) {
                System.out.println("Congratulations! You guessed the correct password.");
                break;
            } else if (guess.equalsIgnoreCase("quit")) {
                System.out.println("Exiting the game.");
                break;
            } else {
                System.out.println("Incorrect password. Try again or type \"quit\" to exit.\n");
            }
        } while (true);
    }
}
 */

import java.util.Scanner;

public class Week4_13_2_PasswordGuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String correctPassword = "wedevx2023";
        String guess;
        System.out.println("Welcome to the Password Guessing Game!");

        do {
            System.out.println("Guess the password:");
            guess = sc.nextLine();

            if (guess.equals(correctPassword)) {
                System.out.println("Congratulations! You guessed the correct password.");
                break;
            } else if (guess.equalsIgnoreCase("quit")) {
                System.out.println("Exiting the game.");
                break;
            } else {
                System.out.println("Incorrect password. Try again or type \"quit\" to exit.\n");
            }
        } while (true);
    }
}
