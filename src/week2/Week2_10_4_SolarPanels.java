package week2;

import java.util.Scanner;

/*
2.10.4 Solar Panels
easy
|
30 min
|
Share
Typically, solar panels can start generating electricity when
the solar radiation intensity is around 1200 watts per square
meter (W/m²). This is the minimum amount of solar radiation
required to generate a usable amount of electricity. Write a
program that asks the user to enter the average solar intensity
in their region, then compares them using >= and prints out the
following message: Expected Output:

plain
Copy code
Please enter the average solar intensity in your region:
Your region should install solar panels: X
Where X is a boolean value.
 */

public class Week2_10_4_SolarPanels {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.println ("Please enter the average solar intensity in your region:");
        int averageSolarIntensityInRegion = input.nextInt();

        boolean canGenerateElectricty = averageSolarIntensityInRegion >= 1200;
        System.out.println("Your region should install solar panels: " + canGenerateElectricty);
    }
}
