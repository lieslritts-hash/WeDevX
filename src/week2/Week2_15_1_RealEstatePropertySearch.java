package week2;

import java.util.Scanner;

/*
2.15.1 Real Estate Property Search*
easy
|
30 min
|
Share
Write a program that helps Twitter to help find out if the user
is eligible for a verified blue icon. Requirements: 1. User must
have at least 100000 followers 2. User must have a verified Email
Follower count and isEmailVerified must be taken from a Scanner.

plain
Copy code
____ followerCount = ____;
____ isEmailVerified = ____;
Expected Output:

plain
Copy code
How many followers does the user have?
Is Email Verified?
User is eligible for a verified blue icon: X
Where X is a boolean.
 */

public class Week2_15_1_RealEstatePropertySearch {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        int followerCount = input.nextInt();
        System.out.println("How many followers does the user have?");

        boolean isEmailVerified = input.nextBoolean();
        System.out.println("Is Email Verified?");

        System.out.println("User is eligible for a verified blue icon: " + (followerCount >= 100_000 && isEmailVerified));
    }
}
