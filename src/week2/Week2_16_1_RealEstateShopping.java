package week2;

import java.util.Scanner;

/*
2.16.1 Real Estate Shopping*
easy
|
30 min
|
Share
Write a program that determines whether a real estate property
is suitable for a buyer based on two criteria: the property's
price and location. Our program has just 1 property in inventory
in "Beverly Hills" with a price tag of $15000000.00 If the
buyer's budget is more than or equal to the property's price
AND the property is located in the buyer's desired area The
program should output "Suitable property found: true" Otherwise
The program should output "Suitable property found: false"

plain
Copy code
____ propertyForSale = _____;
____ propertyLocation = _____;
____ desiredLocation = _____;
____ budget = ____;
Expected Output:

plain
Copy code
Enter your desired location
Enter your budget:
Suitable property found: X
Where X is a boolean.
 */

public class Week2_16_1_RealEstateShopping {
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
