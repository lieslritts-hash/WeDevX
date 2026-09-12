package week2;

import java.util.Scanner;

/*
2.19 Compound Operators 2
Boost Java skills with practical examples of compound
operators, building on the previous lesson.
 */

public class Week2_19_CompoundOperators2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        double price = 149.45;
        double shipping = 12.50;
        price *= 2;
        price += shipping;
        System.out.println(price);
    }
}
