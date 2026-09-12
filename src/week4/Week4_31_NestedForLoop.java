package week4;

/*
4.31 Nested For Loop
Explore the powerful capabilities of nested for loops in Java to
perform iterative operations on multidimensional data structures with
 this comprehensive tutorial.
 */
//write your static method here. No need to add Main class or main method.


public class Week4_31_NestedForLoop {
    public static void main(String[] args) {

        for (int i = 1; i <= 3; i++) {
            System.out.println("Hello");
            for (int x = 1; x <= 2; x++) {
                System.out.println("Superstar");
            }
        }

        //Hello
        //Superstar
        //Superstar
        //Hello
        //Superstar
        //Superstar
        //Hello
        //Superstar
        //Superstar

        System.out.println("============================");

        for (int i = 0; i <= 2; i++) {
            System.out.println("I love");
            for (int x =1; x <= 3; x++) {
                System.out.println("Java");
            }
        }

        //I love
        //Java
        //Java
        //Java
        //I love
        //Java
        //Java
        //Java
    }
}
