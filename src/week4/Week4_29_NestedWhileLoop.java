package week4;

/*
4.29 Nested While Loop
Master the use of nested while loops in Java to perform iterative operations on
multidimensional data structures and control program flow with this comprehensive tutorial.
 */
//write your static method here. No need to add Main class or main method.


public class Week4_29_NestedWhileLoop {
    public static void main(String[] args) {

        int counter1 = 1;
        int counter2 = 1;

        while (counter1 <= 3) { //1,2,3,4

            while (counter2 <= 2 ) { //1,2,3
                System.out.println("Superstar");
                counter2++;

            }

            counter2 = 1;
            counter1++;
        }

    }
}
