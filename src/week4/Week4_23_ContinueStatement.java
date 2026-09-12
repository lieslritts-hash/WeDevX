package week4;

/*
4.23 Continue Statement
Learn how to use the continue statement in Java to skip over parts of a
loop and control program flow with this informative lesson.
 */

public class Week4_23_ContinueStatement {
    public static void main(String[] args) {

        int counter = 1;
        while (counter <= 5) {
            System.out.println("superstars");
            counter++;

            if (counter ==2) {
                continue; //skip lines 20 and 21 and go to the next iteration
            }

            System.out.println("I love java");//prints 1, skips 2, prints 3-5
        }
    }
}
