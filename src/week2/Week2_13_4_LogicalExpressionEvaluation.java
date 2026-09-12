package week2;

import java.util.Scanner;

/*
2.13.6 Logical Expression Evaluation
easy
|
30 min
|
Share
Create a program that takes 4 boolean inputs from user and
evaluates logical expression involving variables A, B, C, and
D using only conditional operators: parentheses, logical AND
(&&), logical OR (||) and logical NOT (!). Expression 1: (A and B)
or not (C or D) Expression 2: (A and B) or ((C or D) and not (A or B))

Example of input:
plain
Copy code
true
false
true
false
Example of output:
plain
Copy code
A - true
B - false
C - true
D - false
Expression 1 - X
Expression 2 - Y
Where X and Y, the result of the conditional expression,
should be printed.
 */
public class Week2_13_4_LogicalExpressionEvaluation {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        boolean A = input.nextBoolean();
        System.out.println("A - " + A);

        boolean B = input.nextBoolean();
        System.out.println("B - " + B);

        boolean C = input.nextBoolean();
        System.out.println("C - " + C);

        boolean D = input.nextBoolean();
        System.out.println("D - " + D);

        System.out.println("Expression 1 - " + ((A && B) || !(C || D)));

        System.out.println("Expression 2 - " + ((A && B) || (C || D ) && !(A || B)));
    }
}
