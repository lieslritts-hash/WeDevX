package week4;

/*
4.2 While Loop
Master the use of the while loop in Java to perform
iterative operations and control program flow with
this comprehensive tutorial.
 */

public class Week4_2_WhileLoop {
    public static void main(String[] args) {

        //a while consists of a condition
        //a body
        //and a condition updater

        //Write a program that executes Superstar 5 time

        int counter = 1; //starting point
        while (counter <= 5) {
            System.out.println("Superstar");
            counter++; //have an updater
        }

        //write a program thatexecutes I love java 20 times

        int counter2  = 1;
        while (counter2 <= 20) {
            System.out.println("I Love Java");
            counter2++;
        }
    }
}
