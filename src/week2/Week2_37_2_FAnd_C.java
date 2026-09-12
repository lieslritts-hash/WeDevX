package week2;

import java.util.Scanner;

/*
2.37.2 F and C*
easy
|
30 min
|
Share
Write a Java program that prompts the user to enter a temperature in Celsius and converts it to Fahrenheit or vice versa based on the user's input. The program should first ask the user to input the temperature value, and then ask the user to specify whether the input temperature is in Celsius or Fahrenheit.

If the input temperature is in Celsius (C), the program should convert it to Fahrenheit (F) using the formula: F = C × 9/5 + 32. If the input temperature is in Fahrenheit (F), the program should convert it to Celsius (C) using the formula: C = (F - 32) × 5/9. If the user enter an invalid input the program should print out Invalid scale. Please enter 'C' or 'F' The program should then print out the converted temperature to the user.

Example #1:
Input:

java
Copy code
double temperature = 28.0
String type = "C"
Output:

plain
Copy code
Enter a temperature:
Enter 'C' for Celsius or 'F' for Fahrenheit:
28.0 Celsius is 82.4 Fahrenheit
Example #2:
Input:

java
Copy code
double temperature = 75.0
String type = "F"
Output:

plain
Copy code
Enter a temperature:
Enter 'C' for Celsius or 'F' for Fahrenheit:
75.0 Fahrenheit is 23.9 Celsius
Example #3:
Input:

java
Copy code
double temperature = 20.0
String type = "K"
Output:

plain
Copy code
Enter a temperature:
Enter 'C' for Celsius or 'F' for Fahrenheit:
Invalid scale. Please enter 'C' or 'F'
Note: round decimal points to 1 decimal point with System.out.printf().

 */

public class Week2_37_2_FAnd_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a temperature:");
        double temperature = sc.nextDouble();

        System.out.println("Enter 'C' for Celsius or 'F' for Fahrenheit:");
        String type = sc.next();

        if (type.equals("C")) {
            double fahrenheit = temperature * 9/5 + 32;
            System.out.printf("%.1f Celsius is %.1f Fahrenheit%n", temperature, fahrenheit);
        } else if (type.equals("F")) {
            double celsius = (temperature - 32) * 5/9;
            System.out.printf("%.1f Fahrenheit is %.1f Celsius%n", temperature, celsius);
        } else {
            System.out.println("Invalid scale. Please enter 'C' or 'F'");
        }
    }
}
