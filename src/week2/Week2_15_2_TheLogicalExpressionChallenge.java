package week2;

import java.util.Scanner;

/*
2.15.2 The Logical Expression Challenge*
easy
|
30 min
|
Share
Write a program that take 4 inputs as intfor next variables
and evaluates a logical expression using A, B, C, and D. The
expression should be evaluated using the &&, ||, >, <, ==, =>
or <= operators. The program should print the result of the
evaluation, which should be a boolean value.

Logical expression:
(A not equals B or C not equals D) and (A equals C or B equals D)

|
Input

|

A

|

B

|

C

|

D

|

Result

|
| --- | --- | --- | --- | --- | --- |
|

1

|

10

|

10

|

15

|

10

|

true

|
|

2

|

10

|

5

|

15

|

10

|

false

|
|

3

|

10

|

10

|

10

|

10

|

false

|

Solution
 */

public class Week2_15_2_TheLogicalExpressionChallenge {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        int A = input.nextInt();
        int B = input.nextInt();
        int C = input.nextInt();
        int D = input.nextInt();

        System.out.println(((A != B) || (C != D)) && ((A == C) || (B == D)));

    }
}
