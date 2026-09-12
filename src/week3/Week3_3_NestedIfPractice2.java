package week3;

import java.util.Scanner;

/*
Continue learning Nested If statements in Java.
 */

public class Week3_3_NestedIfPractice2 {
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
