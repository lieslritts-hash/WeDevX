package week2;

import java.util.Scanner;

/*
2.2 Scanner nextInt()
Discover how to use the nextInt() method of the Scanner
class in Java to read integer input from the user, including
how to handle exceptions and errors, in this comprehensive
Scanner Class nextInt() tutorial.
 */

public class Week2_2_ScannernextInt {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("How many goals did you close today?");
        int goals = sc.nextInt();

        System.out.printf("Good job on closing %d goals today.", goals);


    }
}
