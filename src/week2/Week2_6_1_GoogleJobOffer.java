package week2;

import java.util.Scanner;

/*
2.6.1 Google Job Offer*
easy
|
30 min
|
Share
Write a program that prompts the user for their Full name, their job title, salary. The program should then use this information to generate a personalized job offer letter, the same as the sample provided. This exercise will give you the opportunity to practice using the Scanner class to read input from the user, as well as working with string concatenation and formatting in Java. Values to all variables should be assigned using the most suitable Scanner class methods.

plain
Copy code
____ fullName = _______;
____ jobTitle = _______;
____ salary = ________;

System.out.printf();
Use System.out.printf() to format the output to match the
expected output format. Expected Output:

plain
Copy code
Dear [fullName],
Welcome to Google!
We are delighted to have you as a [jobTitle]. Your starting
salary is $[salary]

Sincerely,
Google HR Representative
 */

public class Week2_6_1_GoogleJobOffer {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        String fullName = input.nextLine();
        String jobTitle = input.nextLine();
        double salary = input.nextDouble();

        System.out.printf("Dear %s,\nWelcome to Google!\nWe are delighted to have you as a %s. Your starting salary is $%.2f\n\nSincerely,\nGoogle HR Representative", fullName, jobTitle, salary);
    }
}
