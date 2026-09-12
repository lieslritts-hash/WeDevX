package week4;

/*
4.11 While Loop Counter
 */

import java.util.Scanner;

public class Week4_11_WhileLoopCounter {
    public static void main(String[] args) {

        //write a program that will
        //count the number of registered users
        //the program should ask if we want to register a new user
        //if we say yes, then the activeUser counter should become 1
        //then we should ask the user if they want to register a new user again
        //keep repeating the cycle until usr says no
        //after the user says no we should print out the total number of activeUsers

        Scanner sc = new Scanner(System.in);

        System.out.println("Do you want to register a new user?)");

        String answer = sc.nextLine();
        int registeredUser = 0;

        while (answer.equalsIgnoreCase("yes")) {
            registeredUser++;

            System.out.println("Do you want to register a new user?)");
            answer = sc.nextLine();
        }

        System.out.println("Number of registered users: " + registeredUser);
    }
}
