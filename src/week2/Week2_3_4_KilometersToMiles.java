package week2;

import java.util.Scanner;

/*
2.3.4 Kilometers to Miles
easy
|
30 min
|
Share
Write a program that asks the user to enter kilometers
and the program converts kilometers to miles. Expected Output:

plain
Copy code
Please enter the distance in kilometers:
X kilometers are Y miles
Where X is the entered distance in kilometers and Y is
converted miles. The formula for kilometers to miles
Miles = Kilometers * 0.621371
 */

public class Week2_3_4_KilometersToMiles {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the distance in kilometers:");
        double kilometers = scanner.nextDouble();

        double miles = kilometers * 0.621371;

        System.out.printf("%.1f kilometers are %.5f miles", kilometers, miles);
    }
}
