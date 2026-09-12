package week2;

import java.util.Scanner;


/*
2.38 If, Else If, Else Practice
Reinforce your understanding of if-else-if
statements and practice using them in combination
with logical operators to create advanced decision-making
structures in Java with this class.
 */

public class Week2_38_IfElseIfElsePractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        if (number == 1) {
            System.out.println("January");
        } else if (number == 2) {
            System.out.println("February");
        } else if (number == 3) {
            System.out.println("March");
        } else if (number == 4) {
            System.out.println("April");
        } else if (number == 5) {
            System.out.println("May");
        } else if (number == 6) {
            System.out.println("June");
        } else if (number == 7) {
            System.out.println("July");
        } else if (number == 8) {
            System.out.println("August");
        } else if (number == 9) {
            System.out.println("September");
        } else if (number == 10) {
            System.out.println("October");
        } else if (number == 11) {
            System.out.println("November");
        } else if (number == 12) {
            System.out.println("December");
        } else {
            System.out.println("Invalid input");
        }
    }
}
