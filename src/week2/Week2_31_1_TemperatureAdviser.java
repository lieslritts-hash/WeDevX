package week2;

import java.util.Scanner;

/*
2.31.1 Temperature Adviser*
easy
|
30 min
|
Share
Create a program that serves as a temperature adviser.
The program will take the current temperature as double
input (in Fahrenheit) and recommend suitable clothing based
on temperature. Here are the temperature ranges and their
corresponding clothing recommendations (print messages as
shown in the examples):

Below 70°F (excluding): Recommends a light jacket or long
sleeves, prints: Wear a light jacket or long sleeves;

Above 70°F (including): Recommends wearing a t-shirt or
summer clothing, prints: Wear a t-shirt or summer clothing.

Example #1:
Input:

java
Copy code
double temperature = 65.0
Output:

plain
Copy code
Enter a temperature:
Wear a light jacket or long sleeves
Example #2:
Input:

java
Copy code
double temperature = 70.0
Output:

plain
Copy code
Enter a temperature:
Wear a t-shirt or summer clothing
 */

public class Week2_31_1_TemperatureAdviser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a temperature:");
        double temperature = sc.nextDouble();

        if (temperature < 70) {
            System.out.println("Wear a light jacket or long sleeves");
        }   else {
            System.out.println("Wear a t-shirt or summer clothing");
        }
    }
}
