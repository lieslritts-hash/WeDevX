package week3;

/*
3.33 Parameters Practice 1
This course covers various Java programming exercises
to practice method parameters
 */

import java.util.Scanner;

public class Week3_33_ParametersPractice1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("What is your name?");

        String name = sc.nextLine();

        printUserName(name);

    }

    public static void printUserName(String var){
        System.out.println("Welcome " + var);
    }
}
