package week2;

import java.util.Scanner;

/*
2.39.4 Temperature Feedback
easy
|
30 min
|
Share
Create a program that takes the user's input temperature
in Celsius as a double. Based on the temperature range,
provide feedback to the user using if-else-if conditions
and conditional operators. Use the following temperature
ranges and corresponding feedback:

If the temperature is less than 0°C, display It's freezing cold!

If the temperature is between 0°C (inclusive) and 10°C
(exclusive), display It's very cold

If the temperature is between 10°C (inclusive) and 20°C
(exclusive), display It's cold

If the temperature is between 20°C (inclusive) and 30°C
(exclusive), display It's mild

If the temperature is between 30°C (inclusive) and 40°C
(exclusive), display It's warm

If the temperature is 40°C or higher, display It's hot!

Example:
Input:

plain
Copy code
25.0
Output:
plain
Copy code
Enter the temperature in Celsius:
It's mild
 */

public class Week2_39_4_TemperatureFeedback {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the temperature in Celsius:");
        double temperature = sc.nextDouble();

        if (temperature <0) {
            System.out.println("It's freezing cold!");
        } else if (temperature >= 0 && temperature < 10) {
            System.out.println("It's very cold");
        } else if (temperature >= 10 && temperature < 20) {
            System.out.println("It's cold");
        } else if (temperature >= 20 && temperature < 30) {
            System.out.println("It's mild");
        } else if (temperature >= 30 && temperature < 40) {
            System.out.println("It's warm");
        } else {
            System.out.println("It's hot!");
        }
    }
}
