package week1;

/*
1.20.1 Apple HQ*
easy
|
30 min
|
Share
In this exercise, you will write a Java program that
stores the address of Apple's headquarters in separate
String variables and concatenates them to print the full address.

Requirements:
Declare the following String variables:

street and initialize it with 1 Infinite Loop

city and initialize it with Cupertino

state and initialize it with California

zipCode and initialize it with 95014

Write a program to concatenate all the variables and print
the full address to the console.

Expected output:
plain
Copy code
1 Infinite Loop, Cupertino, California 95014
 */

public class Week1_20_1_Apple_HQ {
    public static void main(String[] args) {
        String street = "1 Infinite Loop";
        String city = "Cupertino";
        String state = "California";
        String zipCode = "95014";

        String fullAddress = street + ", " + city + ", " + state + " " + zipCode;
        System.out.println(fullAddress);
    }
}

