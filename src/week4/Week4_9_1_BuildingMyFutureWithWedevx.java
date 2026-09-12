package week4;

/*
4.9.1 Building my future with wedevx*
easy
|
30 min
|
Share
Objective: Write a Java program that repeatedly prints a message and prompts the user to decide whether they want to see the message again or not. Steps:

Display the message "I'm building my bright future with WeDevX" on the console.

Ask the user if they want to see the message again, using the message "Do you want to see this message again? (true/false)".

Read the user's response as a boolean variable.

If the user's response is true, go to step 1. If the user's response is false, end the program.

Constraints:

The program should use a while loop to repeat the message until the user chooses to stop.

The program should not use arrays or nested loops.

Sample output: input: true true false

plain
Copy code
I'm building my bright future with WeDevX
Do you want to see this message again? (true/false)
I'm building my bright future with WeDevX
Do you want to see this message again? (true/false)
I'm building my bright future with WeDevX
Do you want to see this message again? (true/false)
 */
import java.util.Scanner;

public class Week4_9_1_BuildingMyFutureWithWedevx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("I'm building my bright future with WeDevX");

        System.out.println("Do you want to see this message again? (true/false)");

        boolean answer = sc.nextBoolean();

        while (answer) {
            System.out.println("I'm building my bright future with WeDevX");

            System.out.println("Do you want to see this message again? (true/false)");
            answer = sc.nextBoolean();
        }
    }
}
