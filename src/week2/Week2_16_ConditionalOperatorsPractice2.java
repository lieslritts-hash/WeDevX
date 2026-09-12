package week2;

import java.util.Scanner;

/*
2.16 Conditional Operators Practice 2
Practice and reinforce your understanding of the conditional &
and | operators in Java through a series of hands-on exercises
and challenges in this Conditional & and | Operators Practice
tutorial.
 */

public class Week2_16_ConditionalOperatorsPractice2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        double propertyForSale = 15000000.00;
        String propertyLocation = "Beverly Hills";

        System.out.println("Enter your desired location");
        String desiredLocation = sc.nextLine();

        System.out.println("Enter your budget:");
        double budget = sc.nextDouble();

        boolean suitablePropertyFound = (budget >= propertyForSale) && desiredLocation.equals(propertyLocation);

        System.out.println("Suitable property found: " + suitablePropertyFound);
    }
}
