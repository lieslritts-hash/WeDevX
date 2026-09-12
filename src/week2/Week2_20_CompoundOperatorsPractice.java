package week2;

import java.util.Scanner;

/*
2.20 Compound Operators Practice
Reinforce your understanding of compound operators in
Java through practical exercises in this class.
 */

public class Week2_20_CompoundOperatorsPractice {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please Enter meters:");
        double length = sc.nextDouble();

        length *= 39.37;
        System.out.println(length + " inches");
    }
}
