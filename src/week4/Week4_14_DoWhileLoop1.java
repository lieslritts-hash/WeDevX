package week4;

/*
4.14 Do While Loop 1
Discover how to use the do-while loop in Java to perform iterative operations and control program flow with this lesson.
 */

public class Week4_14_DoWhileLoop1 {
    public static void main(String[] args) {

        //write a program that prints out numbers from 1-5
        //use do while

        int counter = 1;

        do {
            System.out.println(counter++); //first returns the old value.
            //then it increments.
        } while (counter <= 5);

        //write a program to print out values starting from 11 until -2

        System.out.println("=============================");

        int counter2 = 11;

        do {
            System.out.println(counter2--);
        } while (counter2 >= -2);

        System.out.println("=============================");

        //write a program that prints out all characters in any given String using do while
        //from the beginning till the end

        String str = "I'm a do while superstar";
        int index = 0;

        do {
            System.out.println(str.charAt(index++));
        } while (index <= str.length()-1);

        System.out.println("\n=============================");

        do {
            System.out.println("Java");
        } while (false);
    }
}
