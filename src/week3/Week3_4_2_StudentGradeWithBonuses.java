package week3;

import java.util.Scanner;

/*
3.4.7 Student Grade with Bonuses*
easy
|
30 min
|
Share
Write a program that uses nested if statements to determine
whether a student receives a reward for their exam grade. The
program should ask the user for the number of bonus points the
student earned on their exam (an integer) and the student's exam
grade (A, B, C, D, or F) - char. A student receives a reward if
their exam grade is an A or B and the number of bonus points is
greater than 5.

Example of output (don't print out user's inputs):
plain
Copy code
Enter the number of bonus points: 10
Enter the exam grade: A
Congratulations! You receive a reward.

Enter the number of bonus points: 5
Enter the exam grade: B
You do not receive a reward.

Enter the number of bonus points: 6
Enter the exam grade: B
Congratulations! You receive a reward.

 */

public class Week3_4_2_StudentGradeWithBonuses {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of bonus points:");
        int bonusPoints = sc.nextInt();
        System.out.println("Enter the exam grade:");
        char examGrade = sc.next().charAt(0);

        if((examGrade == 'A' || examGrade == 'B') && bonusPoints > 5) {
            System.out.println("Congratulations! You receive a reward.");
        } else {
            System.out.println("You do not receive a reward.");
        }

        sc.close();

    }
}