package week2;

import java.util.Scanner;


/*
2.32.1 Light Switch*
easy
|
30 min
|
Share
Write a Java program that prompts the user to enter a boolean
value to represent whether a light is on or off. If the user
enters true, the program should print "Light is on". If the
user enters false, the program should print "Light is off".
Expected Result: Test Case 1: true

plain
Copy code
Enter true or false to indicate whether the light is on or off:
Light is on
Test Case 2: false

plain
Copy code
Enter true or false to indicate whether the light is on or off:
Light is off
 */

public class Week2_32_1_LightSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter true or false to indicate whether the light is on or off:");
        boolean lightOn = sc.nextBoolean();

        if(lightOn) {
            System.out.println("Light is on");

        } else {
            System.out.println("Light is off");
        }
    }
}