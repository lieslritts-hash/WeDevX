package week4;
/*
4.4 While Loop Decrement
Explore the use of the while loop in Java to perform
iterative operations that decrement values and control
program flow with this informative lesson.
 */

public class Week4_4_WhileLoopDecrement {
    public static void main(String[] args) {

        //Write a program that prints out numbers from 5-1
        System.out.println(5); //-1
        System.out.println(4); //-1
        System.out.println(3); //-1
        System.out.println(2); //-1
        System.out.println(1); //-1

        System.out.println("===============================");

        int counter = 5; //starting point

        //there is a possibility while loop would not run at all
        // if condition is false for the first run
        //whenever you are decrementing the counter
        //you should use > comparison operator
        while (counter >= 1) { //ending point
            System.out.println(counter);
            counter--;
        }

        System.out.println("===============================");

        //write a program that prints out numbers from 17 -> 9

        int counter2 = 17;

        while (counter2 >= 9) {
            System.out.println(counter2);
            counter2--;

        }


    }
}
