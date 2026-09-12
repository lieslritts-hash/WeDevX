package week4;
/*
4.3 While Loop Print Numbers
Learn how to use the while loop in Java to print
numbers and perform iterative operations on data with
this practical tutorial.
 */


public class Week4_3_WhileLoopPrintNumbers {
    public static void main(String[] args) {

        //Write a program that prints from numbers 1-5
        System.out.println(1); //+1
        System.out.println(2); //+1
        System.out.println(3); //+1
        System.out.println(4); //+1
        System.out.println(5); //+1

        System.out.println("==========================");

        int counter = 1; //starting from 1
        while (counter <= 5) { //ending point
            System.out.println(counter);
            counter++;
        }

        System.out.println("==========================");

        //write a program that prints numbers from 0 to 9

        int counter2 = 7;
        while (counter2 <= 19) {
            System.out.println(counter2);
            counter2++;
        }
    }
}
