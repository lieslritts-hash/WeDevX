package week3;

import java.util.Scanner;

/*
3.3.1 Meal Selection*
easy
|
30 min
|
Share
You are tasked with creating a program that helps users select
their ideal steak meal at a restaurant. The program should
interact with the user through the console and provide
recommendations based on their preferences for meat (e.g.
Vegetarian), doneness level (e.g. Well Done), and cut of steak
(e.g. Portobello). Instructions:

Start the program.

Prompt the user to select their meat preference:

Enter VG for Vegetarian;

Enter NV for Non-Vegetarian.

Based on the user's meat preference, narrow down the options for doneness level:

If the user selected VG , recommend Steak Portobello Well Done as the only option;

If the user selected NV, offer a choice between Rare, Medium Rare, Medium, and Medium Well.

Next, based on the doneness level chosen, provide options for the cut of steak:

If doneness level Rare was selected, offer steak cut Filet Mignon;

If doneness level Medium Rare was selected, offer steak cut Ribeye;

If doneness level Medium was selected, offer steak cut Sirloin;

If doneness level Medium Well was selected, offer steak cut New York.

Display the recommended steak meal to the user in the format: Steak [Cut] [Doneness]

look at the examples to see what messages should be shown.

Example #1:
Input:

plain
Copy code
NV
Medium Rare
Output:
plain
Copy code
Welcome to the Steakhouse!
Select your meat preference (V/VG/NV):
Select doneness level:
Recommended: Steak Ribeye Medium Rare
Example #2
Input:

plain
Copy code
VG
Output:
plain
Copy code
Welcome to the Steakhouse!
Select your meat preference (V/VG/NV):
Recommended: Steak Portobello Well Done
 */

public class Week3_3_1_MealSelection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to the Steakhouse!");
        System.out.println("Select your meat preference (V/VG/NV):");
        String meatPreference = sc.nextLine();

        // meat preference
        if (meatPreference.equalsIgnoreCase("VG")) {
            // Vegetarian has only one fixed option, no further prompts needed
            System.out.println("Recommended: Steak Portobello Well Done");
        } else if (meatPreference.equalsIgnoreCase("NV")) {
            System.out.println("Select doneness level:");
            String doneness = sc.nextLine();

            String cut;
            if (doneness.equalsIgnoreCase("Rare")) {
                cut = "Filet Mignon";
            } else if (doneness.equalsIgnoreCase("Medium Rare")) {
                cut = "Ribeye";
            } else if (doneness.equalsIgnoreCase("Medium")) {
                cut = "Sirloin";
            } else if (doneness.equalsIgnoreCase("Medium Well")) {
                cut = "New York";
            } else {
                cut = "Unknown";
            }

            System.out.println("Recommended: Steak " + cut + " " + doneness);
        }

        sc.close();

    }
}