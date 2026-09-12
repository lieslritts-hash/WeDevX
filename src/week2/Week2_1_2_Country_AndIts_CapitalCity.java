package week2;

import java.util.Scanner;

/*
2.1.2 Country and its capital city*
easy
|
30 min
|
Share
Write a program that asks the user for the country and its
capital city, then prints out the following message:

plain
Copy code
Please enter a country name:
Please enter its capital city:
The capital city of X is Y
Where X is the country entered, and Y is its capital city
entered. Note both country and the capital city could be
more than 1 word.
 */

public class Week2_1_2_Country_AndIts_CapitalCity {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a country name:");
        String country = input.nextLine();

        System.out.println("Please enter its capital city:");
        String capitalCity = input.nextLine();

        System.out.println("The capital city of " + country + " is " + capitalCity);
    }
}
