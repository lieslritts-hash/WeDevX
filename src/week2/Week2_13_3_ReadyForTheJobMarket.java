package week2;

import java.util.Scanner;

/*
2.13.3 Ready for the job market?
easy
|
30 min
|
Share
Write a program that takes in two booleans, finishedWedevx and
hasStrongResume, and determines if a job candidate is eligible
for a senior-level position. The criteria are:

The candidate must have finished WeDevX AND have a strong resume.
plain
Copy code
Have you finished WeDevX?
Do you have a Strong Resume?
Candidate is eligible for senior-level position: X
Where X is a true or false value. It should be true if both
finishedWedevx AND hasStrongResume are true. Otherwise false.
 */

public class Week2_13_3_ReadyForTheJobMarket {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        boolean finishedWeDevX = input.nextBoolean();
        System.out.println("Have you finished WeDevX? ");

        boolean hasStrongResume = input.nextBoolean();
        System.out.println("Do you have a Strong Resume? ");

        System.out.println("Candidate is eligible for senior-level position: " + (finishedWeDevX && hasStrongResume));
    }
}
