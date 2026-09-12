package week4;

/*
4.10 While Loop with Strings 2
 */

import java.util.Scanner;

public class Week4_10_WhileLoopWithStrings2 {
    public static void main(String[] args) {

        //write a program that prints out Happy Career and Life!
        //as many times as user wants to
        //the prompt should say "Do you want to see the message again? yes/no"

        Scanner sc = new Scanner(System.in);
        System.out.println("Do you want to see the message? yes/no");

        String  answer = sc.nextLine();

        while (answer.equalsIgnoreCase("yes")) {
            System.out.println("Happy Career and Life!");

            System.out.println("Do you want to see the message again? yes/no");
            answer = sc.nextLine();
        }
    }
}
