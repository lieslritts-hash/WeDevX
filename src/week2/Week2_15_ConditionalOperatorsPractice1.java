package week2;

import java.util.Scanner;

/*
2.15 Conditional Operators Practice 1
Practice and reinforce your understanding of the
conditional & and | operators in Java through a series of
hands-on exercises and challenges in this Conditional & and |
Operators Practice tutorial.
 */

public class Week2_15_ConditionalOperatorsPractice1 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        int followerCount = input.nextInt();
        System.out.println("How many followers does the user have?");

        boolean isEmailVerified = input.nextBoolean();
        System.out.println("Is Email Verified?");

        System.out.println("User is eligible for a verified blue icon: " + (followerCount >= 100_000 && isEmailVerified));
    }
}
