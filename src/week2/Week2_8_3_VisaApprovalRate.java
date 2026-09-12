package week2;

import java.util.Scanner;

/*
2.8.3 Visa Approval Rate*
easy
|
30 min
|
Share
Write a program that asks the user for the number of visa applications they
have submitted and the number of visa applications approved. The program
should then use the == operator to compare the two numbers and determine if
the user has a 100% visa approval rate. The program should print the following:
Expected Output:

plain
Copy code
Please enter the number of visa applications they have submitted:
Please enter the number of visa applications they have approved:
You have a 100% approval rate: X
Where X is a true or false value from == operators**.** Note: you can
use %% to print out the percentage sign using System.out.printf()


 */

public class Week2_8_3_VisaApprovalRate {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the number of visa applications they have submitted:");
        int numVisaAppsSubmitted = input.nextInt();

        System.out.println("Please enter the number of visa applications they have approved:");
        int numVisaAppsApproved = input.nextInt();

        boolean ApprovalRate100 = numVisaAppsSubmitted == numVisaAppsApproved;

        System.out.printf("You have a 100%% approval rate: %b", ApprovalRate100);
    }
}
