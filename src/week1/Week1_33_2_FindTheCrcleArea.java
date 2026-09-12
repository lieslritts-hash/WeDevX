package week1;

/*
1.33.2 Find the Circle Area*
easy
|
30 min
|
Share
Write a program that calculates the area of a circle with a
given radius. The area should be printed to the console with a
precision of 3 digits (%.3f). A circle has an area of pi*r²,
where r is the radius. Use double/float data type for all
variables. The given radius is - 5.5 The given pi number is -
3.14159265359

Expected output:
plain
Copy code
The area of the circle is X
Where X - calculated area of the circle
 */

public class Week1_33_2_FindTheCrcleArea {
    public static void main(String[] args) {
        double pi = 3.14159265359;
        double r = 5.5;
        double area = pi * (r * r);

        System.out.printf("The area of the circle is %.3f", area);
    }
}

