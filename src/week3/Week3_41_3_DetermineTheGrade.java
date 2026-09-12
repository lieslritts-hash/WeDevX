package week3;

/*
3.41.3 Determine the Grade
easy
|
30 min
|
Share
Write a static method called determineGrade() that accepts a score as an int parameter and returns the grade for that score as char.

Expected result:
plain
Copy code
Input: 100
Output: 'A'

Input: 90
Output: 'A'

Input: 80
Output: 'B'

Input: 70
Output: 'C'

Input: 60
Output: 'D'

Input: 50
Output: 'F'
 */
//write your static method here. No need to add Main class or main method.

public class Week3_41_3_DetermineTheGrade {
    public static void main(String[] args) {
       char grade = determineGrade(100);
       System.out.println(grade);

        char grade2 = determineGrade(90);
        System.out.println(grade2);

        char grade3 = determineGrade(80);
        System.out.println(grade3);

        char grade4 = determineGrade(70);
        System.out.println(grade4);

        char grade5 = determineGrade(60);
        System.out.println(grade5);

        char grade6 = determineGrade(50);
        System.out.println(grade6);

    }
    public static char determineGrade(int grade) {
        switch (grade) {
            case 100:
                return 'A';
            case 90:
                return 'A';
            case 80:
                return 'B';
            case 70:
                return 'C';
            case 60:
                return 'D';
            case 50:
                return 'F';
            default:
                return '0';
        }
    }
}
