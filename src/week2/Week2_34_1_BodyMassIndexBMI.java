package week2;

import java.util.Scanner;

/*
2.34.1 Body Mass Index (BMI)*
easy
|
30 min
|
Share
Write a program that prompts the user to enter their height and weight, and checks if they are in a healthy weight range. A person is considered to be in a healthy weight range if their body mass index (BMI) is between 18.5 and 24.9. The formula for BMI is weight in kilograms divided by height in meters squared. Expected Output 1:

plain
Copy code
Enter your height in meters:
Enter your weight in kilograms:
Your BMI is within the healthy weight range
Expected Output 2:

plain
Copy code
Enter your height in meters:
Enter your weight in kilograms:
Your BMI is outside the healthy weight range
 */

public class Week2_34_1_BodyMassIndexBMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your height in meters:");
        double height = sc.nextDouble();

        System.out.println("Enter your weight in kilograms:");
        double weight = sc.nextDouble();

        double bmi = weight / (height * height);

        if (bmi > 18.5 && bmi < 24.9) {
            System.out.println("Your BMI is within the healthy weight range");
        } else {
            System.out.println("Your BMI is outside the healthy weight range");
        }
    }
}
