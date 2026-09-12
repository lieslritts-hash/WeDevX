package week1;

/*
1.18.4 Student's Grades
easy
|
30 min
|
Share
Write a program that prints out a student's grades.

plain
Copy code
___ mathGrade = 90;
___ englishGrade = 85;
___ scienceGrade = 95;
Expected output:
plain
Copy code
My grades are:
* Math: 90%
* English: 85%
* Science: 95%

 */

public class Week1_18_4_Students_Grades {
    public static void main(String args[]) {
        char multiplicationSymbol = '*';
        char mudulusSymbol = '%';

        short mathGrade = 90;
        short englishGrade = 85;
        short scienceGrade = 95;

        System.out.println("My grades are:");
        System.out.println(multiplicationSymbol + " Math: " + mathGrade +mudulusSymbol);
        System.out.println(multiplicationSymbol + " English: " + englishGrade +mudulusSymbol);
        System.out.println(multiplicationSymbol + " Science: " + scienceGrade +mudulusSymbol);
    }
}

