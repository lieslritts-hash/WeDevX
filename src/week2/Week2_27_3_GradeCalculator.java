package week2;

import java.util.Scanner;

/*
2.27.3 Grade Calculator*
easy
|
30 min
|
Share
Write a program that uses an if statement to calculate a
student's grade. The program should use the following
grading scale:

A: 90+

B: 80-89

C: 70-79

D: 60-69

F: 0-59

Example of output:
plain
Copy code
Enter the student's score:
The student's grade is A

Enter the student's score:
The student's grade is C

Enter the student's score:
The student's grade is F
You shouldn't print out the score number.


 */

public class Week2_27_3_GradeCalculator {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the student's score:");
        int grade = sc.nextInt();

        if(grade >= 90) {
            System.out.println("The student's grade is A");
        }

        if(grade >= 80 && grade <= 89) {
            System.out.println("The student's grade is B");
        }

        if(grade >= 70 && grade <= 79) {
            System.out.println("The student's grade is C");
        }

        if(grade >= 60 && grade <= 69) {
            System.out.println("The student's grade is D");
        }

        if(grade >= 0 && grade <= 59) {
            System.out.println("The student's grade is F");
        }
    }
}
