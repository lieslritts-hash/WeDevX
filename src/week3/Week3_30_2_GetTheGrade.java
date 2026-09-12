package week3;

/*
3.30.2 Get the Grade
easy
|
30 min
|
Share
You are given the performance of the student = 85.0. Write a method to return a grade based on the student's performance The gradation:

plain
Copy code
A if the student's performance is at least 90%
B if the student's performance is at least 80%
C if the student's performance is at least 70%
D if the student's performance is at least 60%
F if the student's performance is less than 60%
Hint
Use multiple if-else statement
 */

public class Week3_30_2_GetTheGrade {
    public static char getGrade(double studentCompletionPercentage) {
        // Get the grade based on the student's performance
        // dont't forget to add a return statement
        if (studentCompletionPercentage >= 90.0)  {
            return 'A';
        } else if (studentCompletionPercentage >= 80.0) {
            return 'B';
        } else if (studentCompletionPercentage >= 70.0) {
            return 'C';
        } else if (studentCompletionPercentage >= 60.0) {
            return 'D';
        } else {
            return 'F';
        }

    }

    // don't change this method
    public static void main(String[] args) {
        double studentPerformance = 85.0;
        char grade = getGrade(studentPerformance);

        System.out.println("The student's grade is " + grade);
    }
}
