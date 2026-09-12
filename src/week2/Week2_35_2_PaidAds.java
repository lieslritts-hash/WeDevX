package week2;

import java.util.Scanner;

/*
2.35.3 Paid Ads*
easy
|
30 min
|
Share
Write a program that prompts the user to enter the target
audience location of a paid ad and calculates the price per
click based on the location. If the target audience is in the
United States, the price per click should be $1.5. Otherwise,
the price per click should be $0.5. The program should then
display the calculated price per click to the user. Expected
Output: Test case 1: United States

plain
Copy code
Enter target audience location:
Price per click: $1.5
Test case 2: united states

plain
Copy code
Enter target audience location:
Price per click: $1.5
both United States and united states should be considered.
Test case 3: Canada

plain
Copy code
Enter target audience location:
Price per click: $0.5
 */

public class Week2_35_2_PaidAds {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter target audience location:");
        String location = sc.nextLine();

        double pricePerClick;
        if (location.equals("United States") || location.equals("united states") || location.equals("US") || location.equals("us")) {
            pricePerClick = 1.5;
        } else {
            pricePerClick = 0.5;
        }

        System.out.println("Price per click: $" + pricePerClick);
    }
}
