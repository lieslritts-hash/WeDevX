package week2;

import java.util.Scanner;

/*
2.9.4 Offer Negotiation
easy
|
30 min
|
Share
Write a program that asks the user to enter their expected
salary and offered salary. The program should compare the
values and print the following message:

plain
Copy code
Please enter the expected salary:
Please enter the offered salary:
Should I negotiate? X
Where X is a boolean value from the comparison.

Example #1:
Input:

plain
Copy code
130000.00
100000.00
Output:

plain
Copy code
Please enter the expected salary:
Please enter the offered salary:
Should I negotiate? true
Example #2:
Input:

plain
Copy code
130000.00
150000.00
Output:

plain
Copy code
Please enter the expected salary:
Please enter the offered salary:
Should I negotiate? false

 */

public class Week2_9_4_OfferNegotiation {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the expected salary:");
        double expectedSalary = input.nextDouble();

        System.out.println("Please enter the offered salary:");
        double offeredSalary = input.nextDouble();

        boolean meetsExpectedSalary = expectedSalary >= offeredSalary;

        System.out.println("Should I negotiate? " + meetsExpectedSalary);
    }
}
