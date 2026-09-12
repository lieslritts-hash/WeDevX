package week2;

import java.util.Scanner;

/*
2.8.1 United Airlines Points
easy
|
30 min
|
Share
Write a program that asks the user for the number of miles they have traveled and the number of miles they plan to travel. The program should then use the == or != operator to compare the two numbers and determine if the user has already traveled the same number of miles they plan to travel. The program should print out the following message:

plain
Copy code
Please enter the number of miles they have traveled:
Please enter the number of miles they plan to travel:
You have traveled the planned miles already: true
Where X is a true or false value based on == or != comparison of two numbers.

Example #1:
Input:

plain
Copy code
1000
1000
Output:

plain
Copy code
Please enter the number of miles they have traveled:
Please enter the number of miles they plan to travel:
You have traveled the planned miles already: true
Example #2:
Input:

plain
Copy code
500
300
Output:

plain
Copy code
Please enter the number of miles they have traveled:
Please enter the number of miles they plan to travel:
You have traveled the planned miles already: false
 */

public class Week2_8_1_UnitedAirlinesPoints {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the number of miles they have traveled:");
        int numberOfMilesTraveled = input.nextInt();

        System.out.println("Please enter the number of miles they plan to travel:");
        int numberOfMilesPlanToTravel = input.nextInt();

        boolean milesEqual = numberOfMilesTraveled == numberOfMilesPlanToTravel;

        System.out.println("You have traveled the planned miles already: " + milesEqual);
    }
}
