package week3;

/*
easy
|
30 min
|
Share
Write a Java program that asks the user to input a number
between 1 and 7, inclusive. The program should then use a
switch statement to determine the corresponding day of the
week for the input number, where 1 represents Sunday, 2
represents Monday, and so on, up to 7 representing Saturday.
After determining the day of the week, the program should
print a message to the console indicating which day it is.
Your program should use appropriate variable names, and include
comments to explain the logic behind the switch statement.
Test your program with various inputs to ensure it works correctly.
Sample Output 1: 5
plain
Copy code
Enter a number between 1 and 7:
The corresponding day of the week is Thursday
Sample Output 3: 2

plain
Copy code
Enter a number between 1 and 7:
The corresponding day of the week is Monday
 */

import java.util.Scanner;

public class Week3_16_1_WhatDayIsIt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number between 1 and 7:");
        int num = sc.nextInt();

        switch(num) {
            case 1:
                System.out.println("The corresponding day of the week is Sunday");
                break;
            case 2:
                System.out.println("The corresponding day of the week is Monday");
                break;
            case 3:
                System.out.println("The corresponding day of the week is Tuesday");
                break;
            case 4:
                System.out.println("The corresponding day of the week is Wednesday");
                break;
            case 5:
                System.out.println("The corresponding day of the week is Thursday");
                break;
            case 6:
                System.out.println("The corresponding day of the week is Friday");
                break;
            case 7:
                System.out.println("The corresponding day of the week is Saturday");
                break;
            default:
                System.out.println("Invalid number. Please enter a number between 1 and 7.");
        }
    }
}