package week2;

import java.util.Scanner;

/*
2.33.1 Will Smith vs Leonardo DiCaprio*
easy
|
30 min
|
Share
Write a program to get Will Smith and Leonardo DiCaprio's
salary per movie and print the name of the person that has a
greater salary. Required Variables:

plain
Copy code
____ willSalary = ____;
____ leaonardoSalary = _____;
Expected Result 1:

plain
Copy code
What is the salary of Will Smith?
What is the salary of Leonardo DiCaprio?
Will Smith earns more per movie than Leonardo DiCaprio
Expected Result 2:

plain
Copy code
What is the salary of Will Smith?
What is the salary of Leonardo DiCaprio?
Leonardo DiCaprio earns more per movie than Will Smith
 */

public class Week2_33_1_WillSmithvsLeonardoDiCaprio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("What is the salary of Will Smith?");
        double willSalary = sc.nextDouble();

        System.out.println("What is the salary of Leonardo DiCaprio?");
        double leaonardoSalary = sc.nextDouble();

        if(willSalary > leaonardoSalary) {
            System.out.println("Will Smith earns more per movie than Leonardo DiCaprio");
        } else {
            System.out.println("Leonardo DiCaprio earns more per movie than Will Smith");
        }
    }
}
