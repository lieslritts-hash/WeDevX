package week2;

import java.util.Scanner;

/*
2.35.2 Ferrari Fuel Consumption*
easy
|
30 min
|
Share
Write a Java program that calculates the gallons of fuel used per mile for a Ferrari based on the average speed traveled. The program should prompt the user to enter the distance traveled and the time taken to travel that distance, and then use that information to calculate the average speed. The program should then calculate the gallons of fuel used per mile for the Ferrari, based on the formula: gallons per mile = 1.0 / (average speed / miles per gallon) Assume that the Ferrari has an average fuel efficiency of 15 miles per gallon if the average speed is less than or equal to 60 miles per hour, otherwise 9 miles per gallon. The program should then print out the result, rounded to two decimal places. Expected Result: Test case 1: 100 2

plain
Copy code
Enter the distance traveled in miles:
Enter the time taken in hours:
The average speed was 50.00 miles per hour.
The Ferrari used 0.30 gallons of fuel per mile.
Explanation: The user traveled a distance of 100 miles in 2 hours, which means the average speed was 50 miles per hour. Since the average speed is less than or equal to 60 miles per hour, the fuel efficiency is 15 miles per gallon. Using the formula, we can calculate that the Ferrari used 0.30 gallons of fuel per mile. Test case 2: 120 1

plain
Copy code
Enter the distance traveled in miles:
Enter the time taken in hours:
The average speed was 120.00 miles per hour.
The Ferrari used 0.08 gallons of fuel per mile.
Explanation: The user traveled a distance of 120 miles in 1 hour, which means the average speed was 120 miles per hour. Since the average speed is greater than 60 miles per hour, the fuel efficiency is 9 miles per gallon. Using the formula, we can calculate that the Ferrari used 0.08 gallons of fuel per mile. Test case 3: 50 1.5

plain
Copy code
Enter the distance traveled in miles:
Enter the time taken in hours:
The average speed was 33.33 miles per hour.
The Ferrari used 0.45 gallons of fuel per mile.
Explanation: The user traveled a distance of 50 miles in 1.5 hours, which means the average speed was 33.33 miles per hour. Since the average speed is less than or equal to 60 miles per hour, the fuel efficiency is 15 miles per gallon. Using the formula, we can calculate that the Ferrari used 0.45 gallons of fuel per mile. Test case 4: 80 0.5

plain
Copy code
Enter the distance traveled in miles:
Enter the time taken in hours:
The average speed was 160.00 miles per hour.
The Ferrari used 0.06 gallons of fuel per mile.
Explanation: The user traveled a distance of 80 miles in 0.5
hours, which means the average speed was 160 miles per hour.
Since the average speed is greater than 60 miles per hour,
the fuel efficiency is 9 miles per gallon. Using the formula,
we can calculate that the Ferrari used 0.06 gallons of fuel
per mile. Test case 5: 150 3

plain
Copy code
Enter the distance traveled in miles: 150
Enter the time taken in hours: 3
The average speed was 50.00 miles per hour.
The Ferrari used 0.30 gallons of fuel per mile.
Explanation: The user traveled a distance of 150 miles in
3 hours, which means the average speed was 50 miles per hour.
Since the average speed is less than or equal to 60 miles per
hour, the fuel efficiency is 15 miles per gallon. Using the
formula, we can calculate that the Ferrari used 0.30 gallons
 of fuel per mile. This test case is similar to the first test
 case, but with a different distance and time taken.

 */

public class Week2_35_1_FerrariFuelConsumption {
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
