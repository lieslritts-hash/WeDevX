package week1;

/*
1.31.3 Printing out the Grade*
easy
|
30 min
|
Share
Write a program that prints the above using the format specifier %c to output the grades A, B, C, D, F and %s to output the description of the grades.

Expected Output
plain
Copy code
A - 91-100%
B - 81-90%
C - 71-80%
D - 61-70%
F - 51-60%
Example of the code:
plain
Copy code
char   a = ____;
String aDesc = ____;
char   b = ____;
String bDesc = ____;
char   c = ____;
String cDesc = ____;
char   d = ____;
String dDesc = ____;
char   f = ____;
String fDesc = ____;

// prinf() statement for a
// prinf() statement for b
// prinf() statement for c
// prinf() statement for d
// prinf() statement for f
 */

public class Week1_31_3_PrintingOutTheGrade {
    public static void main(String[] args) {
        char a = 'A';
        String aDesc = "91-100%";
        char b = 'B';
        String bDesc = "81-90%";
        char c = 'C';
        String cDesc = "71-80%";
        char d = 'D';
        String dDesc = "61-70%";
        char f = 'F';
        String fDesc = "51-60%";

        System.out.printf("%c - %s", a, aDesc);
        System.out.printf("\n%c - %s", b, bDesc);
        System.out.printf("\n%c - %s", c, cDesc);
        System.out.printf("\n%c - %s", d, dDesc);
        System.out.printf("\n%c - %s", f, fDesc);
    }
}
