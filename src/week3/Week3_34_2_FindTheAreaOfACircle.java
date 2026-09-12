package week3;
/*
3.34.2 Find the Area of a Circle
easy
|
30 min
|
Share
Create a Java program that includes a static method named calculateArea(). The method should take the radius of a circle as a param in double data type and calculate and print the area of the circle to the console using the formula A = pi*r*r. The method should have a void return type, which means it does not return a value but simply performs the calculation and prints the result. Note:

π (pi) is a mathematical constant approximately equal to 3.14159.
Expected output: r = 5.0

plain
Copy code
78.53975
 */

public class Week3_34_2_FindTheAreaOfACircle {
    public static void main(String[] args) {
        calculateArea(5.0);

    }
public static void calculateArea(double r){
       double pi = 3.14159;
    System.out.println(pi * r * r);

}
}
