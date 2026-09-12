package week2;

import java.util.Scanner;

/*
2.5.2 Gender*
easy
|
30 min
|
Share
Write a program that uses a Scanner object to read a
gender from the user. The program should then print the
gender in the appropriate form. Print the first letter of
the answer: Male - M Female - F Other - O

Example of output:
plain
Copy code
Please enter your gender:
Your gender is M

Please enter your gender:
Your gender is F

Please enter your gender:
Your gender is O

 */

public class Week2_5_2_Gender {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter your gender: ");
        char gender = sc.nextLine().charAt(0);
        System.out.println("Your gender is " + gender);
    }
}
