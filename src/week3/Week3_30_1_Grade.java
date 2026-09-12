package week3;

/*
3.30.1 Grade*
easy
|
30 min
|
Share
Create a static method called getFinalGrade() that returns 'A' as a character. Call the method in the main method and print out the value to the console. Expected output:

plain
Copy code
A
 */

public class Week3_30_1_Grade {
    public static void main(String[] args) {
        char grade = getFinalGrade();
        System.out.println(grade);

    }

    public static char getFinalGrade() {
        return 'A';
    }
}
