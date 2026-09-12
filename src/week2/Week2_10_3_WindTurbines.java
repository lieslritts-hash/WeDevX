package week2;

import java.util.Scanner;

/*
2.10.3 Wind Turbines
easy
|
30 min
|
Share
Typically, wind turbines can start generating electricity at
wind speeds as low as 11 miles per hour. Write a program that
asks the user to enter the average wind speed in their region,
then compares them using >= and prints out the following message:
Expected Output:

plain
Copy code
Please enter the average wind speed in your region:
Your region should install wind turbines: X
Where X is a boolean value.
 */

public class Week2_10_3_WindTurbines {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the average wind speed in your region:");
        int averageWindSpeedInRegion = input.nextInt();

        boolean meetsMinimumWindSpeed = averageWindSpeedInRegion >= 11;
        System.out.println("Your region should install wind turbines: " + meetsMinimumWindSpeed);
    }
}
