package week5;

/*
5.6.7 Find the Most Expensive Inventory Item (with solution)
easy
|
30 min
|
Share
Description: Create a static method named findTheMostExpensiveItem() that takes the
following arrays with the same length as parameters:

An array of product names (String values).

An array of product prices (double values).

An array of product colors (String values).

An array of product memory capacities (int values).

The method should return the specification of the most expensive inventory's item in format below.

Example:
Parameters:

plain
Copy code
String[] names = {"Laptop", "Smartphone", "Tablet"}
double[] prices = {799.99, 399.99, 299.99}
String[] colors = {"Silver", "Black", "White"}
int[] storage = {1024, 512, 64}
Return: void Output:

plain
Copy code
Product: Laptop
Price: $799.99
Color: Silver
Storage: 1024GB
Video solution:
https://youtu.be/o82436QLWJg
 */
//write your static method here. No need to add Main class or main method.

// 1. variable to keep the index of the most expensive item
// 2. variable to keep the maxPrice from the prices list

public class Week5_6_5_FindTheMostExpensiveInventoryItem {
    public static void main(String[] args) {
        String[] names = {"Laptop", "Smartphone", "Tablet"};
        double[] prices = {799.99, 399.99, 299.99};
        String[] colors = {"Silver", "Black", "White"};
        int[] storage = {1024, 512, 64};

        findTheMostExpensiveItem(names, prices, colors, storage);
    }

    public static void findTheMostExpensiveItem(String[] names, double[] prices, String[] colors, int[] storage) {
        int mostExpensiveItemIndex = 0;
        double maxPrice = prices[0];

        for (int i = 1; i < prices.length; i++) {
            if (maxPrice < prices[i]) {
                mostExpensiveItemIndex = i;
                maxPrice = prices[i];
            }

        }

        System.out.printf("Product: %s%n", names[mostExpensiveItemIndex]);
        System.out.printf("Price: $%s%n", prices[mostExpensiveItemIndex]);
        System.out.printf("Color: %s%n", colors[mostExpensiveItemIndex]);
        System.out.printf("Storage: %sGB%n", storage[mostExpensiveItemIndex]);
    }

}
