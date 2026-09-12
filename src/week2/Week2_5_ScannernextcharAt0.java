package week2;

import java.util.Scanner;

/*
2.5 Scanner next().charAt(0)
Learn how to use the next().charAt(0) method combination
of the Scanner class and the String class in Java to read
single character input from the user, including how to handle
exceptions and errors, in this comprehensive Scanner Class
next().charAt(0) tutorial.
 */

public class Week2_5_ScannernextcharAt0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter your first name: ");
        char firstName = sc.nextLine().charAt(0);

        System.out.println("Please enter your last name: ");
        char lastName = sc.nextLine().charAt(0);

        System.out.println("" + firstName + lastName);
    }
}
