package week5;

/*
5.8.4 Student Grade Analysis
easy
|
30 min
|
Share
Create a static method analyzeStudentGrades() that takes two arrays
of the same length as parameters: an array of student names (String values)
and an array of their corresponding grades (double values). The program should
calculate and display the following information:

The average grade;

The highest grade;

The lowest grade;

The names of students who scored the highest and lowest grades.

Example:
Parameters:

plain
Copy code
String[] names = {"Alice", "Bob", "Charlie", "David"}
double[] grades = {92.5, 88.0, 95.5, 79.0}
Return: void Output:

plain
Copy code
Average Grade: 88.75
Highest Grade: 95.5
Lowest Grade: 79.0
Top Scorer: Charlie
Lowest Scorer: David
 */
//write your static method here. No need to add Main class or main method.


public class Week5_8_4_StudentGradeAnalysis {
    public static void main(String[] args) {

        analyzeStudentGrades(
                new String[]{"Alice", "Bob", "Charlie", "David"},
                new double[]{92.5, 88.0, 95.5, 79.0});
    }

    public static void analyzeStudentGrades(String[] names, double[] grades) {

       double total = 0;
       double highest = grades[0];
       double lowest = grades[0];

       String topScorer = names[0];
       String lowestScorer = names[0];

       for (int i = 0; i < grades.length; i++) {

           total += grades[i];

           if (grades[i] > highest) {
               highest = grades[i];
               topScorer = names[i];
           }

           if (grades[i] < lowest) {
               lowest = grades[i];
               lowestScorer = names[i];
           }
       }

       double average = total / grades.length;

       System.out.println("Average Grade: " + average);
       System.out.println("Highest Grade: " + highest);
       System.out.println("Lowest Grade: " + lowest);
       System.out.println("Top Scorer: " + topScorer);
       System.out.println("Lowest Scorer: " + lowestScorer);
    }
}
