package week4;

/*
4.18 For Loop
Master the use of the For Loop in Java to perform repeated actions
and iterate over a sequence of values with this comprehensive tutorial.
 */

public class Week4_18_ForLoop {
    public static void main(String[] args) {

        //write a program that prints out numbers from 1-7

        for (int counter = 1; counter <= 7; counter++) {
            System.out.println(counter);
        }

        System.out.println("===========================");

        //write a program that prints out numbers from 11 - -5
        for  (int counter = 11; counter >= -1; counter--) {
            System.out.println(counter);
        }

        //write a program that prints out the String characters from the end until beginning

        String str = "Hello Superstar";

        for (int counter = str.length()-1; counter >= 0; counter--) {
             System.out.println(str.charAt(counter));
        }
    }
}
