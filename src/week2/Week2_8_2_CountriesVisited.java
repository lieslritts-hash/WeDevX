package week2;

import java.util.Scanner;

/*
2.8.2 Countries Visited
easy
|
30 min
|
Share
Write a program that asks the user for the number of countries
they have visited and the number of countries they plan to visit.
 The program should then use the != operator to compare the two
 numbers and determine if the user has visited a different number
 of countries than they planned to. The program should print the
following message:

plain
Copy code
Please enter the number of countries they have visited:
Please enter the number of countries they plan to visit:
You either have more or fewer countries than planned: X
Where X is a boolean value based on != comparison
 */

public class Week2_8_2_CountriesVisited {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the number of countries they have visited:");
        int numCountriesVisited = input.nextInt();

        System.out.println("Please enter the number of countries they plan to visit:");
        int numCountriesPlanToVisit = input.nextInt();

        boolean differentNumCountries = numCountriesVisited != numCountriesPlanToVisit;

        System.out.println("You either have more or fewer countries than planned: " + differentNumCountries);
    }
}
