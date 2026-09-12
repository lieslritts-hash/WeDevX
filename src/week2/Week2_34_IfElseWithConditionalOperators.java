package week2;

import java.util.Scanner;

/*
2.34 If Else With Conditional Operators
Master the use of conditional operators with
if-else statements in Java to create more powerful
and efficient code in this practical lesson.
 */

public class Week2_34_IfElseWithConditionalOperators {
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
