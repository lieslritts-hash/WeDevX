package week3;

import java.util.Scanner;

/*
3.20.3 Recipe Ingredients Selector*
easy
|
30 min
|
Share
Develop a program for a virtual chef that helps users select
ingredients for a recipe. The program should take an input
from user: Italian, Mexican, or Indian. Afterward, the program
should take another input whether they prefer a Vegetarian or
Non-vegetarian dish. Based on these selections, use nested
switch statements to suggest ingredients for the chosen cuisine
and preference:

Italian:

Vegetarian:

Tomatoes, Basil, Mozzarella, Olive Oil, Pasta
Non-vegetarian:

Beef, Tomatoes, Garlic, Parmesan, Pasta
Mexican:

Vegetarian:

Beans, Tomatoes, Avocado, Corn, Tortillas
Non-vegetarian:

Chicken, Beef, Beans, Salsa, Tortillas
Indian:

Vegetarian:

Lentils, Rice, Spinach, Spices, Naan
Non-vegetarians:

Chicken, Lamb, Rice, Curry, Naan
Example:
Input:

plain
Copy code
Italian
Vegetarian
Output:
plain
Copy code
Tomatoes, Basil, Mozzarella, Olive Oil, Pasta
 */

public class Week3_20_3_Recipe_Ingredients_Selector {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Develop a program for a virtual chef that
        //helps users select ingredients for a recipe.
        //The program should take an input from user: Italian, Mexican, or Indian.
        //Afterward, the program should take another input
        //whether they prefer a Vegetarian or Non-vegetarian dish
        String cuisine = sc.nextLine();
        String diet = sc.nextLine();

        switch (cuisine) {
            case "Italian":
                switch (diet) {
                    case "Vegetarian":
                        System.out.println("Tomatoes, Basil, Mozzarella, Olive Oil, Pasta");
                        break;
                    case "Non-vegetarian":
                        System.out.println("Beef, Tomatoes, Garlic, Parmesan, Pasta");
                }
                break;
            case "Mexican":
                switch (diet) {
                    case "Vegetarian":
                        System.out.println("Beans, Tomatoes, Avocado, Corn, Tortillas");
                        break;
                    case "Non-vegetarian":
                        System.out.println("Chicken, Beef, Beans, Salsa, Tortillas");
                }
                break;
            case "Indian":
                switch (diet) {
                    case "Vegetarian":
                        System.out.println("Lentils, Rice, Spinach, Spices, Naan");
                        break;
                    case "Non-vegetarian":
                        System.out.println("Chicken, Lamb, Rice, Curry, Naan");
                }
                break;
        }
    }
}
