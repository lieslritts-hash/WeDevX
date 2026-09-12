package week4;

/*
4.10.2 Valid Email*
easy
|
30 min
|
Share
Create a Java program that repeatedly prompts the user to enter an email address until a valid input is provided. A valid email address should be in the format of username@domain.com. For simplicity, this program will only check if the email ends with @domain.com. The program must use a while loop to continuously ask the user for input and verify if it matches the expected email format. If the input does not comply with the specified format (username@domain.com), the program will output a message indicating the invalid input and prompt the user to enter their email address again until a valid input is provided (look at example to find the messages to print).

Example:
Input:

plain
Copy code
abc.domain.com        // no @ sign
abc@domaincom         // no . before com
abc.def@domain.com    // valid email
Output:

plain
Copy code
Enter your email address:
Invalid input. Please enter a valid email address in the format of username@domain.com.
Enter your email address:
Invalid input. Please enter a valid email address in the format of username@domain.com.
Enter your email address:
Valid input. Thank you!
 */

import java.util.Scanner;
public class Week4_10_2_ValidEmail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your email address:");

        String email = sc.nextLine();

        while (!email.endsWith("@domain.com")) {
            System.out.println("Invalid input. Please enter a valid email address in the format of username@domain.com.");
            System.out.println("Enter your email address:");
            email = sc.nextLine();

        }
        System.out.println("Valid input. Thank you!");

        sc.close();
    }
}
