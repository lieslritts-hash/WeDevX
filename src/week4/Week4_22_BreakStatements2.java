package week4;

/*
4.22 Break Statements 2
Master the use of break statements in Java to create efficient and
responsive code that can exit loops prematurely with this comprehensive
lesson.
//write your static method here. No need to add Main class or main method.
 */

import java.util.Scanner;

public class Week4_22_BreakStatements2 {
    public static void main(String[] args) {

        //write a program that takes an int input from a user
        //and validates if the input is a positive number or not
        //if it's not then users should get - "invalid input message"
        //and should be prompt to enter a number again

        //if the user enters a positive number we should print that number and
        //stop the program

        // not the best to use while for this
        //  System.out.println("Please enter a number");
        //
        //        int num = sc.nextInt();
        //
        //        while (num < 0) {
        //            System.out.println("Invalid input"); //invalid
        //
        //            System.out.println("Please enter a number");
        //
        //            num = sc.nextInt(); //- 1
        //        }

        Scanner sc = new Scanner(System.in);
//   This is actually the best industry standard
        int num = 0;

        do {
            System.out.println("Please enter a number");

            num = sc.nextInt(); //2

            if (num < 0) {
                System.out.println("Invalid number, please try again");
            }

        } while (num < 0);

        System.out.println(num);
// This is better than just a while loop
// but not as good as do while without a break statement.
// See above for best practice.

//        System.out.println("===========================");
//
//        int num2 = 0;
//
//        do {
//            System.out.println("Please enter a number");
//
//            num2 = sc.nextInt(); //2
//
//            if (num2 < 0) {
//                System.out.println("Invalid number, please try again");
//            } else {
//                System.out.println(num2);
//                break;
//            }
//        } while (true);
    }
}
