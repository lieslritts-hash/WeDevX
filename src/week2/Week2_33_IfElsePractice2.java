package week2;

import java.util.Scanner;

/*
2.33 If Else Practice 2
This video builds upon the previous lesson on if-else
statements in Java, showcasing advanced techniques that
can be used to create more responsive code.
 */

public class Week2_33_IfElsePractice2 {
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
