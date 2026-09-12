package week2;

import java.util.Scanner;

/*
2.32.3 Traffic Light Simulator*
easy
|
30 min
|
Share
In this exercise, you will create a simple traffic light
simulator program. The program should ask the user to input
the color of the traffic light, which can be red, yellow, or green.
Based on the user's input, your program will display the
corresponding traffic rules:

If the user enters green, the program should print Go! Drive safely.

If the user enters something else (red or yellow), the program should
print Slow down! Prepare to stop.

Example #1:
Input:

plain
Copy code
green
Output:

plain
Copy code
Enter the color of the traffic light (red, yellow, or green):
Go! Drive safely.
Example #2:
Input:

plain
Copy code
yellow
Output:

plain
Copy code
Enter the color of the traffic light (red, yellow, or green):
Slow down! Prepare to stop.
 */

public class Week2_32_3_TrafficLightSimulator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the color of the traffic light (red, yellow, or green):");
        String colorTrafficLight = sc.nextLine();

        if (colorTrafficLight.equals("green")) {
            System.out.println("Go! Drive safely.");
        } else {
            System.out.println("Slow down! Prepare to stop.");
        }
    }
}
