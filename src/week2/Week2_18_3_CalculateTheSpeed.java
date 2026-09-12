package week2;

import java.util.Scanner;

/*
2.18.3 Calculate the Speed*
easy
|
30 min
|
Share
Write a program that uses a compound operator to calculate the speed of a car. You need to accept the traveled distance and the taken time. Use System.out.print() instead of System.out.println(). Distances and times must be of double data type

Example of output:
plain
Copy code
Enter the distance traveled (miles): 100.0
Enter the time taken (hours): 2.0
The speed of the car is 50.0 mph.

 */

public class Week2_18_3_CalculateTheSpeed {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        double distance = sc.nextDouble();
        System.out.print("Enter the distance traveled (miles): " + distance);

        double time = sc.nextDouble();
        System.out.print("\nEnter the time taken (hours): " + time);

        distance /= time;

        System.out.print("\nThe speed of the car is " + distance + " mph.");
    }
}
