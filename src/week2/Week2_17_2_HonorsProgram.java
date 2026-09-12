package week2;

import java.util.Scanner;

/*
2.17.2 Honors program*
easy
|
30 min
|
Share
Write a program that takes in a student's major and cumulative GPA as input, and then outputs a message based on the following criteria: If the student's major is computer science and their cumulative GPA is equals or above 3.0 or their major is engineering and their cumulative GPA is equals or above 3.5, print messages as printed in the example outputs.

Example #1:
Input:

plain
Copy code
computer science
3.0
Output:
plain
Copy code
What is your major?
What is your GPA?
You are eligible for the honors program: true
Example #2:
Input:

plain
Copy code
marketing
4.0
Output:
plain
Copy code
What is your major?
What is your GPA?
You are eligible for the honors program: false
Hints:
major and gpa variables should be initialized from a Scanner:

plain
Copy code
_____ major = ___;
____ gpa = _____;
The logic is gonna look like this: ((Is major equals computer science and gpa is greater than or equal to 3.0) or (is major equals engineering and gpa is greater or equal to 3.5)) The logic above is called pseudocode.

The major value should be all lowercase String: computer science, engineering, etc.

Extra: What is pseudocode?

 */

public class Week2_17_2_HonorsProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("What is your major?");
        String major = sc.nextLine();

        System.out.println("What is your GPA?");
        double gpa = sc.nextDouble();


        boolean eligibleHonorsProgram = (major.equals("computer science") && (gpa >= 3.0)) || (major.equals("engineering") && (gpa >= 3.5));

        System.out.println("You are eligible for the honors program: " + eligibleHonorsProgram);
    }
}
