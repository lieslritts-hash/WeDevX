package week1;

/*
1.27.1 Area of a Circle*
easy
|
30 min
|
Share
Area of a Circle: Given the radius of a circle is 5 cm,
write a program to calculate the area of a circle given
its radius using the multiplication and the value of pi.
1. Declare a variable for a radius 2. Declare a variable
for a pi 3. Declare a variable for the area. The formula
for the area of a circle is:

plain
Copy code
area = pi * radius  * radius
You can use the value of pi as 3.14159 Expected output:

plain
Copy code
The area of the circle with radius X cm is: Y
Where X is the value of the radius and Y is the value of the area.


 */

public class Week1_27_1_AreaOfACircle {
    public static void main(String[] args) {
        int radius = 5;
        double pi = 3.14159;
        double area = pi * radius * radius;

        System.out.println("The area of the circle with radius " + radius + " cm is: " + area);
    }
}

