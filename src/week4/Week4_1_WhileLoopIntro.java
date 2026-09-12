package week4;

/*
4.1 While Loop Intro
Get started with while loops in Java by learning how to
use them to perform iterative operations and control program
flow in this lesson.
 */
//The While Loop consists of a block of code and a condition/expression.
// The condition/expression is evaluated, and if the condition/expressiom
// is true, the code within the block is executed.
//This repeats until the condition/expression becomes false.
//The block/body is not guaranteed to be executed aat all.
//while(booleanExpression) { --> while keyword and parenthesis required (condition inside with boolean expression)
//    //Body               |
//} --------------------->\/
//Curly braces required for block of multiple statements, optional for single statement

public class Week4_1_WhileLoopIntro {
    public static void main(String[] args) {

        System.out.println("Hey");
        System.out.println("Hey");
        System.out.println("Hey");
        System.out.println("Hey");
        System.out.println("Hey");
        System.out.println("Hey");
        System.out.println("Hey");
        System.out.println("Hey");
        System.out.println("Hey");

        //if the condition is always true
        //then your program will enter the infinate loop cycle
       //while(tru) {
            //System.out.println("Wedevx");
            //execute the body
        //}

        //when the condition of while
        //is a constant false
        //then the body of a while loop becomes unreachable
        //while (false) {
            //System.out.println("Wedevx")

        //we never use the constants in the condition of a while loop or any loop

        //execute 10 times
        //means set amount of time
        //use int numbers

        int num =1;
        while (num <= 10) { //1<=10
            System.out.println("wedevx");
            num++; //condition updating statement, must have in while loop
            //if you don't have condition updating statement then your loop will run infinite number of times
        }
    }
}
