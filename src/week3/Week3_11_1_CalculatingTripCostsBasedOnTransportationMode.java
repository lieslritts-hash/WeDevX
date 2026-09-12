package week3;

import java.util.Scanner;

/*
3.11.1 Calculating Trip Costs Based on Transportation Mode*
easy
|
30 min
|
Share
Write a Java program that calculates the total cost of a trip based on the
user's input for the distance traveled and the mode of transportation used.
If the user chooses to drive, the program should calculate the cost of the
trip as $0.50 per mile. If the user chooses to fly, the program should
calculate the cost of the trip as $100 per hour of flight time. Additionally,
if the user selects the first-class option, an extra $50 should be added to the
total cost. Required Variables:

distanceTraveled: the distance traveled, entered by the user.

modeOfTransport: the mode of transportation used (drive/fly), entered by the user.

isFirstClass: a boolean variable indicating whether or not the user selected first-class option.

The program should perform the following steps:

Prompt the user to enter the distance traveled and mode of transportation.

Calculate the total cost of the trip based on the distance traveled and mode of transportation.

If the user selects to fly first class, add $50 to the total cost.

Display the total cost of the trip.

Assume the following:

The cost of driving is $0.50 per mile.

The cost of flying is $100 per hour of flight time.

The speed of the flight is 500 miles per hour.

The user selects first-class option by entering 'yes' for yes and 'no' for no.

The program does not need to take into account other costs associated with travel,
such as food, lodging, or rental cars. Expected Output: Test Case 1: 200 drive

plain
Copy code
Please enter the distance of the trip in miles:
Please enter the mode of transportation (drive/fly):
The cost of the trip is $100.00
Test Case 2: 500 fly no

plain
Copy code
Please enter the distance of the trip in miles:
Please enter the mode of transportation (drive/fly):
Do you want to fly first class (yes/no)?
The cost of the trip is $100.00
Test Case 3: 500 fly yes

plain
Copy code
Please enter the distance of the trip in miles:
Please enter the mode of transportation (drive/fly):
Do you want to fly first class (yes/no)?
The cost of the trip is $150.00
Test Case 4: -100 fly yes

plain
Copy code
Please enter the distance of the trip in miles:
Please enter the mode of transportation (drive/fly):
Do you want to fly first class (yes/no)?
Invalid distance value, please enter a positive value.
Test Case 5: 100 walk

plain
Copy code
Please enter the distance of the trip in miles:
Please enter the mode of transportation (drive/fly):
Invalid mode of transportation!

 */

public class Week3_11_1_CalculatingTripCostsBasedOnTransportationMode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the distance of the trip in miles:");
        double distanceTraveled = sc.nextDouble();
        sc.nextLine(); // consume leftover newline left by nextDouble()

        System.out.println("Please enter the mode of transportation (drive/fly):");
        String modeOfTransport = sc.nextLine();

        double cost = 0;
        boolean isFirstClass = false;
        boolean validMode = true;

        if (modeOfTransport.equalsIgnoreCase("drive")) {
            cost = 0.50 * distanceTraveled;
        } else if (modeOfTransport.equalsIgnoreCase("fly")) {
            double flightHours = distanceTraveled / 500;
            cost = 100 * flightHours;

            System.out.println("Do you want to fly first class (yes/no)?");
            String firstClassAnswer = sc.nextLine();
            isFirstClass = firstClassAnswer.equalsIgnoreCase("yes");

            if (isFirstClass) {
                cost = cost + 50.00;
            }
        } else {
            validMode = false;
        }

        if (!validMode) {
            System.out.println("Invalid mode of transportation!");
        } else if (distanceTraveled <= 0) {
            System.out.println("Invalid distance value, please enter a positive value.");
        } else {
            System.out.printf("The cost of the trip is $%.2f%n", cost);
        }

        sc.close();
    }
}