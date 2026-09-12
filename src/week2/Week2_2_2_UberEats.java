package week2;

import java.util.Scanner;

/*
2.2.2 Uber Eats
easy
|
30 min
|
Share
Write a program that asks the user to enter the number of food items added to the cart and how many more they want to add. Then it prints out the sum of existing items and newly added items.

Expected Output:

plain
Copy code
Please enter num of existing items in the cart:
Please enter num of newly added items in the cart:
Total items: X
Where X represents the sum of the existing items and the
newly added items achieved by adding them together and
storing the result in another variable. Note that you can
name your Scanner object whatever you want, for example sc,
scanner, scan, input, etc. In this example we named our object
input.

plain
Copy code
Scanner input = new Scanner(System.in);
int existingItems = input.nextInt();
int newItems = input.nextInt();
int totalItems = existingItems + newItems;
 */

public class Week2_2_2_UberEats {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter num of existing items in the cart:");
        int existingItems = input.nextInt();

        System.out.println("Please enter num of newly added items in the cart:");
        int newItems = input.nextInt();

        int totalItems = existingItems + newItems;

        System.out.printf("Total items: %d", totalItems);
    }
}
