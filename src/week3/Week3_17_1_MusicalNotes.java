package week3;

import java.util.Scanner;

/*
3.17.1 Musical Notes*
easy
|
30 min
|
Share
7 musical notes: (do, re, mi, fa, sol, la, ti).
Write a Java program that asks the user to input a number
between 1 and 7, inclusive. The program should then use a
switch statement to determine the corresponding musical note
for the input number, where 1 represents the note "do", 2
represents "re", and so on, up to 7 representing the note "ti".
After determining the musical note, the program should print a
message to the console indicating which note it is. If the user
inputs a number outside the range of 1 to 7, the program should
print an error message and prompt the user to input a valid number.
Your program should use appropriate variable names, and include
comments to explain the logic behind the switch statement. Test
your program with various inputs to ensure it works correctly.
Sample Output 1: 1

plain
Copy code
Enter a number between 1 and 7:
The corresponding musical note is do
Sample Output 2: 6

plain
Copy code
Enter a number between 1 and 7:
The corresponding musical note is la
Negative Scenario 1: 0

plain
Copy code
Enter a number between 1 and 7:
Error: Invalid input. Please enter a number between 1 and 7
Negative Scenario 2: 8

plain
Copy code
Enter a number between 1 and 7:
Error: Invalid input. Please enter a number between 1 and 7
 */

public class Week3_17_1_MusicalNotes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number between 1 and 7:");
        char musicalNote = sc.next().charAt(0);

        switch (musicalNote) {
            case '1':
                System.out.println("do");
                break;
            case '2' :
                System.out.println("re");
                break;
            case '3':
                System.out.println("mi");
                break;
            case '4':
                System.out.println("fa");
                break;
            case '5':
                System.out.println("sol");
                break;
            case '6':
                System.out.println("la");
                break;
            case '7':
                System.out.println("ti");
                break;
            default:
                System.out.println("Error: Invalid input. Please enter a number between 1 and 7");
                break;
        }

    }
}
