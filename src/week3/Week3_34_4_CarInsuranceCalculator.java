package week3;

/*
3.34.4 Car Insurance Calculator
easy
|
30 min
|
Share
You need to create a Java program method named
calculateInsuranceCost() that calculates the insurance
cost for a customer's car. The program should perform the
following steps:

The method should take four parameters:

The brand of the car is String;

The model of the car is String;

The year of the car is int;

The color of the car is String.

Calculate the insurance cost based on the provided
information using the following criteria:

The base insurance cost is $500.0;

If the car's brand is "BMW", "Mercedes-Benz" or "Lexus"
add a premium of $1000.0 to the base
insurance cost;

If the car's year is greater than or equals 2022, add a
premium of $500.0 to the base insurance cost;

If the car's color is "White" remove a premium of $250.0 from
the base insurance cost.

Display the calculated insurance cost along with the vehicle
information to the customer.

For example: calculateInsuranceCost("Lincoln", "Navigator",
2023, "White")

plain
Copy code
Vehicle info
Brand: Lincoln
Model: Navigator
Year: 2023
Color: White
Insurance cost: $750
Hint
Use if-statements and print the text into calculateInsuranceCost()
method using System.out.println()
 */

public class Week3_34_4_CarInsuranceCalculator {

    public static void main(String[] args) {
        calculateInsuranceCost("Lincoln", "Navigator", 2023, "White");
    }

    public static void calculateInsuranceCost(String brand, String model, int year, String color) {
        double insuranceCost = 500.0;

        if (brand.equals("BMW") || brand.equals("Mercedes-Benz") || brand.equals("Lexus")) {
            insuranceCost += 1000.0;
        }

        if (year >= 2022) {
            insuranceCost += 500.0;
        }

        if (color.equals("White")) {
            insuranceCost -= 250.0;
        }

        System.out.println("Vehicle info");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Color: " + color);
        System.out.printf("Insurance cost: $%.0f%n", insuranceCost);
    }
}
