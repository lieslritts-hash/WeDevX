package week2;

import java.util.Scanner;

/*
2.26 If Statement Practice
Master if statements in Java with practical exercises.
 */

public class Week2_26_IfStatementPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        System.out.println("Please enter an int num:");

        if(num > 42) {
            System.out.println("Superstar");
        }
    }
}
