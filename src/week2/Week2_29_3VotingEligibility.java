package week2;

import java.util.Scanner;

/*
2.29.4 Voting Eligibility*
easy
|
30 min
|
Share
Create a Java program that determines if a person is eligible
to vote. The program should take two parameters as input using
the Scanner class: the person's age (int) and whether they are a
citizen (boolean). It should use conditional statements (if-else)
to check the eligibility criteria. If the person is at least 18
years old and is a citizen (true), the program should display a
message indicating that they are eligible to vote. Otherwise, it
should display a message stating that they are not eligible to vote.
Look at the examples to find messages that should be printed.

Example #1:
Input:

plain
Copy code
int age = 25
boolean isCitizen = true
Output:

plain
Copy code
Enter your age:
Are you a citizen (true/false):
Eligible to vote.
Example #2:
Input:

plain
Copy code
int age = 17
boolean isCitizen = true
Output:

plain
Copy code
Enter your age:
Are you a citizen (true/false):
Not eligible to vote.
Example #3:
Input:

plain
Copy code
int age = 28
boolean isCitizen = false
Output:

plain
Copy code
Enter your age:
Are you a citizen (true/false):
Not eligible to vote.
 */

public class Week2_29_3VotingEligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your age:");
        int age = sc.nextInt();

        System.out.println("Are you a citizen (true/false):");
        boolean isCitizen = sc.nextBoolean();

        if(age >= 18 && isCitizen) {
            System.out.println("Eligible to vote.");
        } else {
            System.out.println("Not eligible to vote.");
        }
    }
}
