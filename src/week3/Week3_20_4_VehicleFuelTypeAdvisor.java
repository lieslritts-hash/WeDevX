package week3;

import java.util.Scanner;

/*
3.20.4 Vehicle Fuel Type Advisor
easy
|
30 min
|
Share
Create a program that advises users on the most suitable fuel or engine type for
their vehicles based on their vehicle type and driving habits. The program should
use nested switch statements to provide recommendations. Instructions:

Ask the user for their vehicle type (options: Sedan, SUV, Truck, Motorcycle).

Ask the user for their typical driving habits (options: City, Highway, Mixed) if user
selected Sedan or SUV.

Use nested switch statements to provide fuel type recommendations based on the following
criteria:

If the vehicle is a Sedan:

For City driving: Recommend Electric for eco-conscious users.

For Highway driving: Recommend Diesel for better mileage.

For Mixed driving: Recommend Petrol for versatility.

If the vehicle is an SUV:

For City driving: Recommend Petrol for fuel efficiency.

For Highway driving: Recommend Diesel for long-distance travel.

For Mixed driving: Recommend Hybrid for a balance of efficiency and power.

If the vehicle is a Truck:

Recommend Diesel.
If the vehicle is a Motorcycle:

Recommend Petrol.
Display the recommended fuel type to the user.

Example of expected output #1:
Input:

plain
Copy code
Sedan
City
Output:
plain
Copy code
Welcome to the Vehicle Fuel Type Advisor!
Enter your vehicle type (Sedan, SUV, Truck, Motorcycle):
Enter your typical driving habits (City, Highway, Mixed):
Recommended Fuel Type: Electric
Example of expected output #2:
Input:

plain
Copy code
Motorcycle
Output:
plain
Copy code
Welcome to the Vehicle Fuel Type Advisor!
Enter your vehicle type (Sedan, SUV, Truck, Motorcycle):
Recommended Fuel Type: Petrol
 */

public class Week3_20_4_VehicleFuelTypeAdvisor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to the Vehicle Fuel Type Advisor!");
        System.out.println("Enter your vehicle type (Sedan, SUV, Truck, Motorcycle):");
        String vehicleType = sc.nextLine();

        switch (vehicleType) {

            case "Sedan":
                System.out.println("Enter your typical driving habits (City, Highway, Mixed):");
                String sedanDrivingHabit = sc.nextLine();

                switch (sedanDrivingHabit) {
                    case "City":
                        System.out.println("Recommended Fuel Type: Electric");
                        break;
                    case "Highway":
                        System.out.println("Recommended Fuel Type: Diesel");
                        break;
                    case "Mixed":
                        System.out.println("Recommended Fuel Type: Petrol");
                        break;
                }
                break;

            case "SUV":
                System.out.println("Enter your typical driving habits (City, Highway, Mixed):");
                String suvDrivingHabit = sc.nextLine();

                switch (suvDrivingHabit) {
                    case "City":
                        System.out.println("Recommended Fuel Type: Petrol");
                        break;
                    case "Highway":
                        System.out.println("Recommended Fuel Type: Diesel");
                        break;
                    case "Mixed":
                        System.out.println("Recommended Fuel Type: Hybrid");
                        break;
                }
                break;

            case "Truck":
                System.out.println("Recommended Fuel Type: Diesel");
                break;

            case "Motorcycle":
                System.out.println("Recommended Fuel Type: Petrol");
                break;
        }
    }
}
