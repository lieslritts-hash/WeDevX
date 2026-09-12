package week5;

/*
5.6.5 Student Grade Book
easy
|
30 min
|
Share
Create a static method displayGrades() that takes two
arrays of the same length as parameters: an array of student
names (String values) and an array of their corresponding grades (double values).
The program should associate and print all the grades in the ordered list format "#. Name - grade".

Example:
Parameters:

plain
Copy code
String[] names = {"John", "Alice", "Bob"}
double[] grades = {85.5, 92.0, 78.5}
Return: void Output:

plain
Copy code
1. John - 85.5
2. Alice - 92.0
3. Bob - 78.5
 */
//write your static method here. No need to add Main class or main method.


public class Week5_6_3_StudentGradeBook {
    public static void main(String[] args) {

        displayGrades(new String[]{"John", "Alice", "Bob"}, new double[]{85.5, 92.0, 78.5});

    }

    public static void displayGrades(String[] names, double[] grades) {

        for (int i = 0; i < names.length; i++) {
            System.out.println((i + 1) + ". " + names[i] + " - " + grades[i]);
        }
    }
}
