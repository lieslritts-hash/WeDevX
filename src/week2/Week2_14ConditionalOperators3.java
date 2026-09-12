package week2;

import java.util.Scanner;

/*
2.14 Conditional Operators 3
Discover the use of the conditional & and |
operators in Java, how they differ from the logical
&& and || operators, in this comprehensive Conditional &
and | Operators tutorial.
 */

public class Week2_14ConditionalOperators3 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        boolean hasBalconyView = input.nextBoolean();
        System.out.println("Does your room have a balcony view? ");

        boolean hasKingBed = input.nextBoolean();
        System.out.println("Does your room have a king sized bed? ");

        System.out.println("You are eligible for a premium upgrade: " + (hasBalconyView || hasKingBed));
    }
}
