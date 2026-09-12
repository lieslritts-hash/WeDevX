package week4;

/*
4.13 Do While Loop Intro
 */
//Do While Loop - Java also allows for the creation of a do-while loop
//which, like a loop, is a repetition control structure with a termination condition and statment
//or block of statements
//Unlike a while loop, though, a do-while loop guarantees that the statement
//or block will be executed at least once.
//do keyword
// |
// \/
//  do { <-------------------------------------\ Curly braces required for block
//          //Body                               of multiple statements, optional
//    /----------------------------------------/ for single statement.
//   \/
// { while (booleanExpression); <----------------- semicolon (required)
//     /\  \-----------------/------------ parentheses (required)
//      \------------ while keyword

public class Week4_13_DoWhileLoopIntro {
    public static void main(String[] args) {

        // print out Hello 5 times
        // we are still required to have
        // 1. body
        // 2. have the counter
        // 3.condition with the ending point
        // 4. make sure you have the counter updater
        // the biggest difference between while and do while lopp
        // is that do while loop is executed at least once
        // only after the body is executed once, the condition is checked
        // for the first time.
        // after that it works exactly the same as a while loop.

        int counter = 1;

        do {  // in the first iteration we don't check for any condition
            System.out.println("Hello");
            counter++;
        } while (counter <= 5);
    }
}
