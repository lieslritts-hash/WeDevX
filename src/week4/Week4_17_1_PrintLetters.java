package week4;

/*
4.17.1 Print letters*
easy
|
30 min
|
Share
The program should prompt the user to input a number that is less
than 26 and more than 0, and print all letters from the given String
letters until the given number of letter (inclusively). String letters:
abcdefghijklmnopqrstuvwxyz Input: The user should input one integer number.
Output: The program should output the resulted String. If the user enters an
invalid number, the program should output an error message: Result: Error! Invalid number

Example #1:
Parameters:

plain
Copy code
int numOfLetters = 5
Output:

plain
Copy code
Enter a number:
Result: abcde
Example #2:
Parameters:

plain
Copy code
int index = 15
Output:

plain
Copy code
Enter a number:
Result: abcdefghijklmno
Example #3:
Parameters:

plain
Copy code
int index = 27
Output:

plain
Copy code
Enter a number:
Result: Error! Invalid number

 */

import java.util.Scanner;

public class Week4_17_1_PrintLetters {
    public static void main(String[] args) {
        String letters = "abcdefghijklmnopqrstuvwxyz";

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int number = sc.nextInt();

        if (number >= 0 && number < 26) {
            System.out.print("Result: ");

            for (int counter = 0; counter < number; counter++) {
                System.out.print(letters.charAt(counter));
            }

        } else {
            System.out.println("Result: Error! Invalid number");
        }
    }
}
