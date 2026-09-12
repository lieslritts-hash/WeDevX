package week1;

/*
1.21.1 Apple's Corporate Culture*
easy
|
30 min
|
Share
In this exercise, you will write a Java program that uses
String variables and escape characters to describe the
culture of Apple Inc.

Requirements:
Declare a String variable company and initialize it with
"Apple".

Declare a String variable motto and initialize it with "Think
Different".

Declare a String variable philosophy and initialize it with
"Design is not just what it looks like and feels like. Design
is how it works." said by Steve Jobs.

Write a program to print the description of the culture of
Apple Inc. to the console, using escape characters to format
the output.

Expected output:
plain
Copy code
Apple's culture is defined by its motto "Think Different" and
its philosophy, "Design is not just what it looks like and
feels like. Design is how it works." said by Steve Jobs.
 */

public class Week1_21_1_ApplesCorporateCulture {
    public static void main(String[] args) {
        String company = "Apple";
        String motto = "\"Think Different\"";
        String philosophy = "\"Design is not just what it looks like and feels like. Design is how it works.\" said by Steve Jobs";

        System.out.println(company +"'s culture is defined by its motto " + motto + " and its philosophy, " + philosophy + ".");
    }
}

