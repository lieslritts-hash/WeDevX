package week4;

/*
4.17 For Loop Intro
Learn how to use the for loop in Java to iterate over a
sequence of values and perform specific actions
 */

//for keyword     ------------------- Parentheses (required)
//  |    /-------/     semicolons (required)              \
// \/   /               /                 \               |
// for (initialixation; booleanExpression; updateStatement) {
//      //Body                                              /
// }  <--------------------Curly brace for block of multiple statements,
//                         optional for single statement
//
// 1. Initialization  statement executes
// 2. If booleanExpression is true continue, else exit loop
// 3. Body executes
// 4. Execute updateStatements
// 5. Return to Step 2
//
// For Loop
// A basic for loop has the same conditional boolean expression and statement,
// or block of statements, as the other loops you have seen, as well as two
// sections: an initialization block and an update statement.

public class Week4_17_ForLoopIntro {
    public static void main(String[] args) {
        //write a program that prints Hello 5 times
        //int counter = 1 -> is a starting point
        //counter <= 5 -> is the ending point condition
        //counter++ -> is updater (increases by 1 each time)
        for (int counter = 1; counter <= 5; counter++) {
            System.out.println("hello");
        }

        System.out.println("=============================");

        //write a program that prints out For Loop Superstar 7 times
        //the variable created inside for loop () is local to this for loop only
        //which means next for loop can use the same variable
        //(don't have to do like in while and do while like counter1, counter2, etc.

        for (int counter = 0; counter <= 7; counter++){
            System.out.println("For Loop Superstar");
        }
    }
}
