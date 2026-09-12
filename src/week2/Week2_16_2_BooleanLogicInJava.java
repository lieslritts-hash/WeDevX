package week2;

import java.util.Scanner;


/*
2.16.2 Boolean Logic in Java*
easy
|
30 min
|
Share
Write a program that take 4 inputs as intfor next variables and evaluates a logical expression using A, B, C, and D. The expression should be evaluated using the &&, ||, >, <, ==, => or <= operators. The program should print the result of the evaluation, which should be a boolean value.

Logical expression:
(A less than B and C more than D) or (A more than B and C less than D)

|
Test case

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

5

|

15

|

10

|

false

|
|

2

|

10

|

15

|

15

|

10

|

true

|
|

3

|

10

|

10

|

15

|

10

|

false

|


 */

public class Week2_16_2_BooleanLogicInJava {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();

        System.out.println(((A < B) && (C > D)) || ((A > B) && (C < D)));

    }
}
