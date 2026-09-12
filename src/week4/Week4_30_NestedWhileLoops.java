package week4;

/*
4.30 Nested While Loops
Discover how to use nested while loops in Java to iterate over a
sequence of values and perform iterative operations on multidimensional
data structures in this lesson.
 */

public class Week4_30_NestedWhileLoops {
    public static void main(String[] args) {

        //write a program that prints out value of counter2
        //1, 2, 3, 4, ---> counter1 = 1
        //1, 2, 3, 4, ---> counter1 = 2
        //1, 2, 3, 4, ---> counter1 = 3
        //1, 2, 3, 4, ---> counter1 = 4
        //1, 2, 3, 4, ---> counter1 = 5

        int counter1 = 1;
        while (counter1 <= 5) {

            int counter2 = 1;
            while (counter2 <= 4) {
                System.out.print(counter2 + ", ");
                counter2++;
            }
            System.out.println(" ---> counter1 = " + counter1);
            counter1++;
        }
    }
}
