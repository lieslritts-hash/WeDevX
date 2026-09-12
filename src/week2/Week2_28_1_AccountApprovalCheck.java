package week2;

import java.util.Scanner;

/*
2.28.1 Account approval check*
easy
|
30 min
|
Share
Write a program that checks if a user's account has been approved
by an administrator and prints a message if it has.

Ask the user to answer the following question Has your
account been approved by an administrator? (true/false)
If the user says true print out

plain
Copy code
Has your account been approved by an administrator? (true/false)
Congratulations! Your account has been approved and is ready
to use.
otherwise

plain
Copy code
Has your account been approved by an administrator? (true/false)
Sorry, your account has not been approved yet. Please check
back later.

 */

public class Week2_28_1_AccountApprovalCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Has your account been approved by an administrator? (true/false)");
        boolean approved = sc.nextBoolean();

        if(approved) {
            System.out.println("Congratulations! Your account has been approved and is ready to use.");
        }

        if(!approved) {
            System.out.println("Sorry, your account has not been approved yet. Please check back later.");
        }
    }
}
