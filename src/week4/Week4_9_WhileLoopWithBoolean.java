package week4;

/*
4.9 While Loop With Boolean
 */

//while loop can and should be used to run the loops
//with undefined number of iterations.
//each loop is called an iteration.

//I want to write a program
//that's going to print out Superstar
//as many times as the user wants to.
//I need to ask the user if he/she wants to see the message

import java.util.Scanner;

public class Week4_9_WhileLoopWithBoolean {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Do you want to see the message? true/false");

        boolean answer = sc.nextBoolean();

        while (answer) {
            System.out.println("Superstar");

            System.out.println("Do you want to see the message? true/false");
            answer = sc.nextBoolean();
        }
    }
}
