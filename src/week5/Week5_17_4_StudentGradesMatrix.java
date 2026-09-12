package week5;

/*
5.17.5 Student Grades Matrix*
easy
|
30 min
|
Share
Create a static method named setStudentGrade() that takes a 2D integer
array (int[][]) representing student grades across multiple subjects as the
first parameter, student ID as the second int parameter, subject ID as the third
int parameter and the updated grade as the fourth int parameter. The first index
in the array represents the student ID, and the second index represents the subject ID.
The method should modify the grades array by setting a specific grade for a given student
and subject identified by their IDs. Then, return the updated 2D array.

Return Type: int[][]

Example #1:
Parameters:

plain
Copy code
{
                             {75, 80, 90},
int[][] studentGradesList =  {85, 70, 78},
                             {92, 88, 86}
                           }
int studentId = 1
int subjectId = 2
int newGrade = 95
Return:

plain
Copy code
// note that index (ID) starts with 0
{
 {75, 80, 90},
 {85, 70, 95},
 {92, 88, 86}
}
 */
//write your static method here. No need to add Main class or main method or import anything


public class Week5_17_4_StudentGradesMatrix {
    public static void main(String[] args) {

        int[][] studentGradesList = {
                {75, 80, 90},
                {85, 70, 78},
                {92, 88, 86}
        };

        int[][] result = setStudentGrade(studentGradesList, 1, 2, 95);

        for (int row = 0; row < result.length; row++) {
            for (int column = 0; column < result[row].length; column++) {
                System.out.print(result[row][column] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] setStudentGrade(int[][] grades, int studentID, int subjectID, int newGrade) {
        grades[studentID][subjectID] = newGrade;

        return grades;
    }
}
