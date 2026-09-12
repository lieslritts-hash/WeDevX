package week2;

import java.util.Scanner;

/*
2.39.2 Generation Finder*
easy
|
30 min
|
Share
Write a program that prompts the user to enter their
birth year and determines their generation based on the
following scale: Baby Boomer: born 1946-1964 print out You
belong to the Baby Boomer generation. Generation X: born
1965-1980 print out You belong to the Generation X generation.
Millennial: born 1981-1996 print out You belong to the
Millennial generation. Generation Z: born 1997-2012 print
out You belong to the Generation Z generation. Generation
Alpha: born 2013 or later print out You belong to the
Generation Alpha generation. If the entered year is less
than 1946 print out Invalid input.

Example #1:
Input:

java
Copy code
int year = 1962
Output:

plain
Copy code
Enter your birth year:
You belong to the Baby Boomer generation.
Example #2:
Input:

java
Copy code
int year = 1969
Output:

plain
Copy code
Enter your birth year:
You belong to the Generation X generation.
Example #3:
Input:

java
Copy code
int year = 1994
Output:

plain
Copy code
Enter your birth year:
You belong to the Millennial generation.
Example #4:
Input:

java
Copy code
int year = 2000
Output:

plain
Copy code
Enter your birth year:
You belong to the Generation Z generation.
Example #5:
Input:

java
Copy code
int year = 2015
Output:

plain
Copy code
Enter your birth year:
You belong to the Generation Alpha generation.
Example #6:
Input:

java
Copy code
int year = 1940
Output:

plain
Copy code
Enter your birth year:
Invalid input.
 */

public class Week2_39_2_GenerationFinder {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your birth year:");
        int year = sc.nextInt();

        if (year >= 1946 && year <= 1964) {
            System.out.println("You belong to the Baby Boomer generation.");
        } else if (year >= 1965 && year <= 1980) {
            System.out.println("You belong to the Generation X generation.");
        } else if (year >= 1981 && year <= 1996) {
            System.out.println("You belong to the Millennial generation.");
        } else if (year >= 1997 && year <= 2012) {
            System.out.println("You belong to the Generation Z generation.");
        } else if (year >= 2013) {
            System.out.println("You belong to the Generation Alpha generation.");
        } else if (year <= 1946) {
            System.out.println("Invalid input.");
        }
    }
}
