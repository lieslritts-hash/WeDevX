package week2;

import java.util.Scanner;

/*
2.6.3 Temperature Converter
easy
|
30 min
|
Share
Write a program that uses a Scanner object to read a
temperature in Celsius from the user as a double. The
program should then convert the temperature to theFahrenheit
and print the result.

Formula:
°F = °C · 1,8 + 32

Example result:
plain
Copy code
Enter a temperature in Celsius:
100.0
The temperature in Fahrenheit is 212.0 degrees.

Enter a temperature in Celsius:
36.6
The temperature in Fahrenheit is 97.88 degrees.
 */

public class Week2_6_3_TemperatureConverter {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a temperature in Celsius:");
        double celsius = input.nextDouble();
        System.out.printf("%.1f", celsius);

        double fahrenheit = (celsius * 1.8) + 32.0;

        System.out.printf("%nThe temperature in Fahrenheit is %.1f degrees.", fahrenheit);
    }
}
