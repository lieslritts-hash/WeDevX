package week4;

/*
4.21 Break Statements 1
Explore the use of break statements in Java to prematurely exit a
loop and improve program efficiency in this practical tutorial.
 */

//for(int i = 1; i <= 3; i++) {
//    if (i == 2) {
//         break.;
//    }
//    System.out.println("i: " + i);
// }
//
//In this example, the loop will only iterate twice.
//because when i == 2; java executes the break statement,
//leading the program to break out of the loop.
//So the output of the program is i: 1

public class Week4_21_BreakStatements1 {
    public static void main(String[] args) {
        //write a program that executes Hello World 4 times
        int counter = 1;
        while (counter <= 4) {
            System.out.println("Hello World");
                    counter++;
        }

        System.out.println("============================");

        int counter2 = 1;
        while (true) {

            System.out.println("Hello World");
            counter2++;

            if (counter2 == 4 + 1) {
                break;
            }
        }
    }
}
