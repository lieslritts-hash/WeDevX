package week3;

import java.util.Scanner;

/*
3.13.1 Product Price Calculator*
easy
|
30 min
|
Share
In this exercise, you will write a Java program that determines
the price of a product based on the quantity and location of the
customer. The program will prompt the user to enter the quantity and
location of the customer, and then use a nested if statement to determine
the price of the product based on the quantity and location.

Program Requirements
The program should perform the following steps:

Prompt the user to enter the quantity of the product.

Prompt the user to enter the location of the customer. The location can be "USA", "Canada", or "Other".

Use a nested if statement to determine the price of the product based on the quantity and location.
The prices are as follows:

Quantity | USA | Canada | Other < 100 $2.50 $3.00 $3.50 >= 100 $2.00 $2.50 $3.00

Calculate the total cost of the product by multiplying the price by the quantity.

Output the total cost of the product to the user.

If the user enters an invalid location, print "Invalid location"

if the user enters 0 or less in quantity, print "Quantity cannot be 0 or less"

user should be asked to enter location only if the quantity is more than 0

Test Case 1: 0.0

plain
Copy code
Enter the quantity of the product:
Quantity cannot be 0 or less
Test Case 2: -10.0

plain
Copy code
Enter the quantity of the product:
Quantity cannot be 0 or less
Test Case 3: 50.0 USA

plain
Copy code
Enter the quantity of the product:
Enter the location of the customer (USA/Canada/Other):
The total cost of the product is: $125.0
Test Case 4: 150.0 Canada

plain
Copy code
Enter the quantity of the product:
Enter the location of the customer (USA/Canada/Other):
The total cost of the product is: $375.0
Test Case 5: 75.0 Other

plain
Copy code
Enter the quantity of the product: 75
Enter the location of the customer (USA/Canada/Other):
The total cost of the product is: $262.5
Test Case 6: 200.0 Mexico

plain
Copy code
Enter the quantity of the product:
Enter the location of the customer (USA/Canada/Other):
Invalid location
 */

public class Week3_13_1_ProductPriceCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the quantity of the product:");
        double quantity = sc.nextDouble();

        if (quantity <= 0) {
            System.out.println("Quantity cannot be 0 or less");
            return;
        }

        sc.nextLine(); // flush leftover newline before reading location

        System.out.println("Enter the location of the customer (USA/Canada/Other):");
        String location = sc.nextLine();

        double cost;

        if (quantity < 100 && location.equalsIgnoreCase("USA")) {
            cost = quantity * 2.50;
        } else if (quantity < 100 && location.equalsIgnoreCase("Canada")) {
            cost = quantity * 3.00;
        } else if (quantity < 100 && location.equalsIgnoreCase("Other")) {
            cost = quantity * 3.50;
        } else if (quantity >= 100 && location.equalsIgnoreCase("USA")) {
            cost = quantity * 2.00;
        } else if (quantity >= 100 && location.equalsIgnoreCase("Canada")) {
            cost = quantity * 2.50;
        } else if (quantity >= 100 && location.equalsIgnoreCase("Other")) {
            cost = quantity * 3.00;
        } else {
            System.out.println("Invalid location");
            return;
        }

        System.out.println("The total cost of the product is: $" + cost);

        sc.close();
    }
}

