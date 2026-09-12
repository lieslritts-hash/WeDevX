package week2;

import java.util.Scanner;

/*
2.4.1 Tallest Building in the World*
easy
|
30 min
|
Share
Write a program that asks the user is Burj Khalifa the tallest building in the world? The user should only be able to answer true or false Expected Output:

plain
Copy code
Is Burj Khalifa the tallest building in the world?
X
Where X user entered boolean value.
 */

public class Week2_4_1_TallestBuildingInTheWorld {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Is Burj Khalifa the tallest building in the world?");
        boolean tallestBuilding = input.nextBoolean();
        System.out.println(tallestBuilding);
    }
}
