package week4;

/*
4.33 Nested For Loops
Learn how to use nested for loops in Java to perform iterative operations on multidimensional data structures with this
practical tutorial.
 */
//write your static method here. No need to add Main class or main method.

//*
//* *
//* * *
//* * * *
//* * * * *

//i = 1; i <= 5; i++;
//x = 1; x <= 6; x++;

public class Week4_33_NestedForLoops {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {

            for (int x = 1; x <= i ; x++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
