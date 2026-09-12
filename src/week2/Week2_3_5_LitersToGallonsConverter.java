package week2;

import java.util.Scanner;


/*
2.3.5 Liters to gallons converter
easy
|
30 min
|
Share
Write a program that asks the user to enter how many
liters of gas they want to pump and it converts the
liters to gallons. Expected Output:

plain
Copy code
How many liters?
X liters are Y gallons
Where X is entered liters and Y is converted gallons.
Gallons = Liters * 0.264172 Where Liters (double data type)
is the volume in liters in and Gallons (double data type)
is the equivalent volume in gallons. Print 5 decimals for
gallons. Use System.out.printf() to print the specified
number of decimals.

Example:
Input:

plain
Copy code
double liters = 25.0 // use Scanner's nextDouble() method
Calculations:

plain
Copy code
gallons = 25.0 * 0.264172 = 6.6043
// 5 decimals -> 6.60430
Output:

plain
Copy code
How many liters?
25.0 liters are 6.60430 gallons

 */

public class Week2_3_5_LitersToGallonsConverter {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many liters?");
        double liters = scanner.nextDouble();

        double gallons = liters * 0.264172;
        System.out.printf("%.1f liters are %.5f gallons", liters, gallons);
    }
}
