package week2;

import java.util.Scanner;

/*
2.20.1 Meters to Inch*
easy
|
30 min
|
Share
Write a Java program to take input from users on length in
meters as a double and convert it to inches using the compound
assignment operator. Print the result to the console. Note: 1 meter
is 39.37 inches.

plain
Copy code
___ length = ____;
length *= ____;
Expected Output:

plain
Copy code
Please Enter meters:
X inches
Where X is length * 39.37 ;


 */

public class Week2_20_1_MetersToInch {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please Enter meters:");
        double length = sc.nextDouble();

        length *= 39.37;
        System.out.println(length + " inches");
    }
}
