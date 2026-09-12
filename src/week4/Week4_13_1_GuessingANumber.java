package week4;

/*
4.13.1 Guessing a Number*
easy
|
30 min
|
Share
Write a program that simulates a game of guessing a number. The program should use a do-while loop to repeatedly prompt the user to guess a number. The program should stop the loop when the user guesses the correct number. The correct number should be equal to 7. Example of output (don't print the line which starts from >:

plain
Copy code
Enter a number:
> 5
Incorrect. Try again.
Enter a number:
> 10
Incorrect. Try again.
Enter a number:
> 7
Correct!
 */

import java.util.Scanner;

public class Week4_13_1_GuessingANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number;

        do {
            System.out.println("Enter a number:");
            number = sc.nextInt();

            if (number == 7) {
                System.out.println("Correct!");
            } else {
                System.out.println("Incorrect. Try again.");
            }
        } while (number != 7);
    }
}

