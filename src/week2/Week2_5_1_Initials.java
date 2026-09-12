package week2;
import java.util.Scanner;

/*
2.5.1 Initials*
easy
|
30 min
|
Share
Write a program that asks the user to enter first name
and last name separately and it prints out the first
letter of the first name and the last name in two lines.
Expected Output:

plain
Copy code
Please enter your first name:
Please enter your last name:
XZ
Where X is the first letter of the fist name and Z is the first letter of the last name.
 */
public class Week2_5_1_Initials {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter your first name: ");
        char firstName = sc.nextLine().charAt(0);

        System.out.println("Please enter your last name: ");
        char lastName = sc.nextLine().charAt(0);

        System.out.println("" + firstName + lastName);
    }
}
