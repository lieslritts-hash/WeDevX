package week2;

import java.util.Scanner;

/*
2.28 If Statement with a Boolean
Master the use of boolean variables in if statements to
control program flow.
 */

public class Week2_28_IfStatementWithABoolean {
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
