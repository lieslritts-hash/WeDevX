package week2;

import java.util.Scanner;

/*
2.1 Scanner Class in Java
Learn how to use the Scanner class in Java to read input
from the user, including how to create a Scanner object,
read different data types, handle exceptions, and more,
in this comprehensive Scanner Class tutorial.
 */

public class Week2_1_ScannerClassInJava {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Where are you from?");
        String country = input.nextLine();

        System.out.println("Im lucky to have a friend like you from " + country);

    }
}
