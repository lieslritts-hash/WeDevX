package week2;

import java.util.Scanner;

/*
2.34.2 Admission Eligibility Checker*
easy
|
30 min
|
Share
You need to create a Java program that checks if a student is eligible
for university admission based on their academic performance. The program
should use conditional operators and if-else statements to make the
admission decision. Here are the details:

In your main program, take user input for the GPA and entrance exam score.

Use conditional operators and if-else statements to determine if the
student is eligible for admission. To be eligible for admission, the
student must meet the following criteria:

The GPA should be greater than or equal to 3.0.

The entrance exam score should be 80 or higher.

If the student meets both criteria, display the message:
Admission Eligible

If the student fails to meet one or both criteria, display the
message: Admission Not Eligible

Example #1:
Input:

plain
Copy code
3.5
85
Output:

plain
Copy code
GPA:
Entrance Exam Score:
Admission Eligible
Example #2:
Input:

plain
Copy code
3.8
75
Output:

plain
Copy code
GPA:
Entrance Exam Score:
Admission Not Eligible
 */

public class Week2_34_2_AdmissionEligibilityChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("GPA:");
        double gpa = sc.nextDouble();

        System.out.println("Entrance Exam Score:");
        double examScore = sc.nextDouble();

        if(gpa >= 3.0 && examScore >= 80) {
            System.out.println("Admission Eligible");
        } else {
            System.out.println("Admission Not Eligible");
        }
    }
}
