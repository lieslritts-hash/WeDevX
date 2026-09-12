package week3;

import java.util.Scanner;

/*
In this class, we will build upon the concepts and skills
covered in the previous class and dive deeper into the topic
of nested "if" statements.
 */

public class Week3_11_NestedIfPractice4 {
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