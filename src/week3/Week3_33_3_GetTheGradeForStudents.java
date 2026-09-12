package week3;

/*
3.33.3 Get the Grade for Students
easy
|
30 min
|
Share
You are given the performance of the students. Write a method named getGrade() that takes a double as a parameter and prints the message with a grade based on the student's performance: The student's grade is X. Need to print a grade where X. Use if-else statement:

plain
Copy code
A if the student's performance is more than or equals 90%
B if the student's performance is more than or equals 80%
C if the student's performance is more than or equals 70%
D if the student's performance is more than or equals 50%
F if the student's performance is less than 50% (excluded)
Return Type: void

Example:
Parameter:

plain
Copy code
double studentPerformance = 95.0
Output:

plain
Copy code
The student's grade is A
Hint
Void method doesn't return anything. You need print the
message directly into getGrade() method
 */

public class Week3_33_3_GetTheGradeForStudents {
    static void main(String[] args) {
        getGrade(95.0);
    }

    public static void getGrade(double studentPerformance) {
        // Get the grade based on the student's performance
        if (studentPerformance >= 90.0) {
            System.out.println("The student's grade is A");
        } else if (studentPerformance >= 80.0) {
            System.out.println("The student's grade is B");
        } else if (studentPerformance >= 70.0) {
            System.out.println("The student's grade is C");
        } else if (studentPerformance >= 50.0) {
            System.out.println("The student's grade is D");
        } else if (studentPerformance < 50.0) {
            System.out.println("The student's grade is F");
        }
    }
}
