package week2;

import java.util.Scanner;

/*
2.33.5 Exam Pass-Fail*
easy
|
30 min
|
Share
Write a program that prompts the user to enter their 3 exam scores. Using if and else statements, check if the average score is above or below the passing grade of 70. If it is, print "Congratulations, you passed the exam". Otherwise, print "Sorry, you failed the exam". Expected Result 1: Test Data: 100, 90, 80

plain
Copy code
Please enter your score for exam1:
Please enter your score for exam2:
Please enter your score for exam3:
Your average score is 90.00
Congratulations, you passed the exam
Expected Result 2 : Test Data: 50, 30, 60

plain
Copy code
Please enter your score for exam1:
Please enter your score for exam2:
Please enter your score for exam3:
Your average score is 46.67
Sorry, you failed the exam
Round decimal points of the average score to 2 decimal points. using the printf method.
 */

public class Week2_33_5_ExamPassFail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter your score for exam1:");
        int exam1 = sc.nextInt();

        System.out.println("Please enter your score for exam2:");
        int exam2 = sc.nextInt();

        System.out.println("Please enter your score for exam3:");
        int exam3 = sc.nextInt();

        double averageScore = (exam1 + exam2 + exam3) / 3.0;

        System.out.printf("Your average score is %.2f%n", averageScore);

        if (averageScore >= 70) {
            System.out.println("Congratulations, you passed the exam");
        } else {
            System.out.println("Sorry, you failed the exam");
        }
    }
}
