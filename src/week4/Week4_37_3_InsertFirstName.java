package week4;

/*
4.37.3 Insert First Name*
easy
|
30 min
|
Share
Create a program that asks the user for their last name, initializes a StringBuilder with it, then prompts the user for their first name. Insert the first name at the beginning of the last name with a space in between using the insert method of StringBuilder. Finally, print the full name.

Example:
Input:

plain
Copy code
Smith
John
Expected output:

plain
Copy code
Enter your last name:
Enter your first name:
Full Name: John Smith
 */

import java.util.Scanner;

public class Week4_37_3_InsertFirstName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your last name:");
        String lastName = sc.nextLine();

        System.out.println("Enter your first name:");
        String firstName = sc.nextLine();

        StringBuilder fullName = new StringBuilder(lastName);

        fullName.insert(0, firstName + " ");

        System.out.println("Full Name: " + fullName);
    }
}
