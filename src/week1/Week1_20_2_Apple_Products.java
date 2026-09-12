package week1;

/*
1.20.2 Apple Products*
easy
|
30 min
|
Share
In this exercise, you will write a Java program that uses String
variables to store the names of several Apple products and
concatenates them to print a list of all the products.
Requirements:

Declare a String variable company and initialize it with "Apple".

Declare a String variable iphone14 and initialize it with
"iPhone 14".

Declare a String variable macbookPro and initialize it with
"MacBook Pro".

Declare a String variable appleWatch and initialize it with
"Apple Watch".

Declare a String variable ipad and initialize it with "iPad".

Write a program to concatenate all the product names and print
the list of all the products to the console.

Expected output:

plain
Copy code
Apple's product line includes: iPhone 14, MacBook Pro, Apple Watch, iPad.
 */

public class Week1_20_2_Apple_Products {
    public static void main(String[] args) {
        String company = "Apple";
        String iphone14 = "iPhone 14";
        String macbookPro = "MacBook Pro";
        String appleWatch = "Apple Watch";
        String ipad = "iPad";

        String products = iphone14 + ", " + macbookPro + ", " + appleWatch + ", " + ipad + ".";
        System.out.println(company + "'s product line includes: " + products);
    }
}

