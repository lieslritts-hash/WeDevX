package week2;

import java.util.Scanner;

/*
2.10.2 Apricots
easy
|
30 min
|
Share
According to the USDA's Agricultural Research Service, apricot trees can withstand winds of up to 30 miles per hour without suffering significant damage. However, in regions with particularly strong winds, apricot trees may need to be protected with windbreaks or staked to prevent damage. Write a program that asks the user to enter the maximum wind speed in their region and compares it to the maximum apricot trees can withstand using <=. Then prints out the following message: Expected Output:

plain
Copy code
Please enter the maximum wind speed in your region:
You can grow apricot: X
Where X is a boolean value from comparison.


 */

public class Week2_10_2_Apricots {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the maximum wind speed in your region:");
        int maximumWindSpeedInReagion = input.nextInt();

        boolean apricotTreeWithstands = maximumWindSpeedInReagion <= 30;
        System.out.println("You can grow apricot: " + apricotTreeWithstands);
    }
}
