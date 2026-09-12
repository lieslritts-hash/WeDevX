package week4;

/*
4.7 While Loop Increment By 2
 */

public class Week4_7_WhileLoopIncrementBy2 {
    public static void main(String[] args) {

        //write a program that prints 1-3-5-7-9
        System.out.println(1); //+2
        System.out.println(3); //+2
        System.out.println(5); //+2
        System.out.println(7); //+2
        System.out.println(9); //+2

        System.out.println("=========================");

        int counter = 1;
        while (counter <= 9) {
            System.out.println(counter);
            counter+=2;
        }

        System.out.println("=========================");

        //print out even numbers from 0 to 10
        //0-2-4-6-8-10

        int counter2 = 0;
        while (counter2 <= 10) {
            System.out.println(counter2);
            counter2+=2;
        }

    }
}
