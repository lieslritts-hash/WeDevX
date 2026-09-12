package week2;

import java.util.Scanner;

/*
2.4 Scanner nextBoolean()
Discover how to use the nextBoolean() method of the
Scanner class in Java to read boolean input from the user,
including how to handle exceptions and errors, in this
comprehensive Scanner Class nextBoolean() tutorial.
 */

public class Week2_4_ScannernextBoolean {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Is Burj Khalifa the tallest building in the world?");
        boolean tallestBuilding = input.nextBoolean();
        System.out.println(tallestBuilding);
    }
}
