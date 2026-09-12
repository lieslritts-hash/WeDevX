package week5;

/*
5.7.2 Student Grades Display*
easy
|
30 min
|
Share
Create a static method named displayStudentGrades() that takes an
array of student grades (double[]) as a parameter. This method should
use the Arrays.toString() method from the java.util.Arrays class
(no need to import anything) to convert the array into a readable
string format and display the students' grades.

Example #1:
Parameter:

plain
Copy code
double[] grades1 = { 85.0, 90.5, 78.0, 92.5, 87.5 }
Output:

plain
Copy code
[85.0, 90.5, 78.0, 92.5, 87.5]
 */
//write your static method here. No need to add Main class or main method or import anything

import java.util.Arrays;

public class Week5_7_2_StudentGradesDisplay {
    public static void main(String[] args) {

        displayStudentGrades(new double[] { 85.0, 90.5, 78.0, 92.5, 87.5 });

    }

    public static void displayStudentGrades(double[] grades1) {

        System.out.println(Arrays.toString(grades1));
    }
}
