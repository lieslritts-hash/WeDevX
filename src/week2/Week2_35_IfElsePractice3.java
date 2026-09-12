package week2;

import java.util.Scanner;

/*
2.35 If Else Practice 3
Solidify your understanding of if-else statements in
Java through practical exercises in this comprehensive tutorial.
 */

public class Week2_35_IfElsePractice3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the distance traveled in miles:");
        double distance = sc.nextDouble();

        System.out.println("Enter the time taken in hours:");
        double hours = sc.nextDouble();

        double averageSpeed = distance / hours;
        System.out.printf("The average speed was %.2f miles per hour.%n", averageSpeed);

        double milesPerGallon;

        if (averageSpeed <= 60) {
            milesPerGallon = 15;
        } else {
            milesPerGallon = 9;
        }

        double gallonsPerMile = 1.0 / (averageSpeed / milesPerGallon);

        System.out.printf("The Ferrari used %.2f gallons of fuel per mile.", gallonsPerMile);
    }
}
