package week4;

/*
4.12.2 Typing a Password*
easy
|
30 min
|
Share
Write a method called passwordForm() that simulates a user typing a password. The program should use a while loop to repeatedly prompt the user to enter their password. The program should stop the loop when the user enters the correct password. Solve this exercise using Switch statement. Correct password is WEDEVX Input: String password: The password. Output:

If password is correct: Correct password. Welcome!

If password is incorrect: Incorrect password. Try again.

Example:
plain
Copy code
Enter your password:
Incorrect password. Try again.

Enter your password:
Incorrect password. Try again.

Enter your password:
Correct password. Welcome!
Example of the code
java
Copy code
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        String enteredPassword = "";
        boolean isAuthenticated = false;
        while (!isAuthenticated) {
            System.out.println("Enter your password:");
            enteredPassword = scanner.nextLine();

            switch (enteredPassword) {
                case "WEDEVX":
                    System.out.println("Correct password. Welcome!");
                    isAuthenticated = true;
                    break;
                default:
                    System.out.println("Incorrect password. Try again.");
                    System.out.println("");
            }
        }
    }
}
 */

import java.util.Scanner;
public class Week4_12_2_TypingAPassword {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String enteredPassword = "";

        boolean isAuthenticated = false;

        while (!isAuthenticated) {
            System.out.println("Enter your password:");
            enteredPassword = sc.nextLine();

            switch (enteredPassword) {
                case "WEDEVX":
                System.out.println("Correct password. Welcome!");

                isAuthenticated = true;
                break;
                default:
                    System.out.println("Incorrect password. Try again.");
                    System.out.println("");
            }
        }

    }
}
