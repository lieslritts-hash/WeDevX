package week4;

/*
4.10.1 Enter a valid name*
easy
|
30 min
|
Share
Description: The program should repeatedly prompt the user to enter their name until a valid input is entered. The program should only accept a non-empty String as a valid input. A String which contains only spaces is considered invalid as well. You can get rid of white spaces and turn the String into an empty String using .trim() Input: The user should input their name. Output: The program should output a message indicating that the input is invalid and prompt the user to input their name again until a valid input is entered. Sample Output Format: Input: [User enters an empty string] [User enters another empty string] Sophia

plain
Copy code
Please enter your name:
Invalid input. Please enter your name:
Invalid input. Please enter your name:
Welcome, Sophia!
 */

import java.util.Scanner;
public class Week4_10_1_EnterAValidName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter your name:");
        String name = sc.nextLine();

        while (name.trim().isEmpty()) {
            System.out.println("Invalid input. Please enter your name:");
            System.out.println("Enter your email address:");
            name = sc.nextLine();
        }

        System.out.println("Welcome, " + name + "!");

        sc.close();
    }
}
