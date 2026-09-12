package week5;

/*
5.15.4 Grades Averager
easy
|
30 min
|
Share
Create a static method named calculateAverageGrade() that takes a
double[] array of student's grades as a parameter. Calculate and return
the average grade as double.

Return Type: double

Example:
Parameters:

plain
Copy code
double[] grades = {90.0, 85.5, 88.2, 92.7}
Return:

plain
Copy code
89.1
 */
//write your static method here. No need to add Main class or main method.


public class Week5_15_4_GradesAverager {
    public static void main(String[] args) {

        double[] grades = {90.0, 85.5, 88.2, 92.7};
        double average = calculateAverageGrade(grades);
        System.out.println("Average grade: " + average);

    }

    public static double calculateAverageGrade(double[] grades) {

        double sum = 0;

        for (double grade : grades) {
            sum += grade;
        }

        double average = sum / grades.length;

        return average;
    }
}
