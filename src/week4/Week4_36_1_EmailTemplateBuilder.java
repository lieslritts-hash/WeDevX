package week4;

/*
4.36.1 Email Template Builder*
easy
|
30 min
|
Share
Create a program that utilizes the Scanner class to receive input for a user's name and domain name. Using StringBuilder, generate an email address in the format username@domain. The program should prompt the user for the username and domain separately and then construct the email address by appending them together. Finally, print the formatted email address using System.out.println().

Example:
Input:

plain
Copy code
askar
wedevx.co
Output:
plain
Copy code
askar@wedevx.co
Example of the main method
plain
Copy code
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Prompt the user for the username and domain name
    String userName = scanner.nextLine();
    String domainName = scanner.nextLine();

    // Construct the email address using StringBuilder
    StringBuilder emailAddress = new StringBuilder(userName);
    emailAddress.append('@').append(domainName);

    // Display the formatted email address
    System.out.println(emailAddress);
}
 */

import java.util.Scanner;

public class Week4_36_1_EmailTemplateBuilder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String username = sc.nextLine();
        String domainName = sc.nextLine();

        StringBuilder emailAddress = new StringBuilder(username);
        emailAddress.append('@').append(domainName);

        System.out.println(emailAddress);
    }
}
