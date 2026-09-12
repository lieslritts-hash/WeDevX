package week3;

/*
In this class, we will focus specifically on the default keyword
in switch statements and how it can be used in Java programming.

The default keyword is an optional part of a switch statement
that is executed when none of the other cases match the value
of the evaluated expression. It is commonly used as a catch-all
case to handle unexpected or undefined values.
 */

public class Week3_17_SwitchStatementDefaultKeyword {
    public static void main(String[] args) {

        char grade = 'A';

        switch (grade) {
            case 'A':
                System.out.println("Excellent Work!");
                break;
            case 'B':
                System.out.println("Good work!");
                break;
            case 'C' :
                System.out.println("Average work!");
                break;
            case 'D' :
                System.out.println("Bad work!");
                break;
            case 'F' :
                System.out.println("Failed work!");
                break;
            default:
                System.out.println("Invalid Input");
        }
    }
}
