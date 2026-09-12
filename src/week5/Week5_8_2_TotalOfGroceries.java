package week5;

/*
5.8.2 Total of groceries*
easy
|
30 min
|
Share
Description: Write a method called calculateTotalCost() that takes three arrays as
input: an array of integers representing the quantity of each item, an array of strings
representing the name of each item, and an array of doubles representing the cost of each item.
The method should calculate and return the total cost of all items. Params: Three arrays of equal
size: an array of integers representing the quantity of each item, an array of strings representing
the name of each item, and an array of doubles representing the cost of each item. Return: A double
value representing the total cost of all items. If the arrays are not of equal size, the method should
return -1.0. If one of the costs or quantities is negative return 0.0. Example: calculateTotalCost([2, 3, 4],
["apple", "banana", "orange"], [0.5, 0.25, 0.75]); // Returns 4.75 (2 apples at $0.5 each + 3 bananas at $0.25 each
+ 4 oranges at $0.75 each) calculateTotalCost([1, 0, 2], ["pizza", "spaghetti", "soda"], [10.0, 8.0, 2.0]);
// Returns 14.0 (1 pizza at $10.0 each + 2 sodas at $2.0 each) calculateTotalCost([1, 2, 3], ["shirt", "pants", "shoes"],
[20.0, -10.0, 30.0]); // Returns 0.0 (negative cost for pants) calculateTotalCost([1, 2, 3], ["shirt", "pants"], [20.0, 30.0, 40.0]);
// Returns -1.0 (arrays of different sizes)
 */
//write your static method here. No need to add Main class or main method.


public class Week5_8_2_TotalOfGroceries {
    public static void main(String[] args) {

        System.out.println(calculateTotalCost(
                new int[]{2,3,4},
                new String[]{"apple", "bannana", "orange"},
                new double[]{0.5, 0.25, 0.75}
        ));

        System.out.println(calculateTotalCost(
                new int[]{1, 0, 2},
                new String[]{"pizza", "spaghetti", "soda"},
                new double[]{10.0, 8.0, 2.0}
        ));

        System.out.println(calculateTotalCost(
                new int[]{1, 2, 3},
                new String[]{"shirt", "pants", "shoes"},
                new double[]{20.0, -10.0, 30.0}
        ));

        System.out.println(calculateTotalCost(
                new int[]{1, 2, 3},
                new String[]{"shirt", "pants"},
                new double[]{20.0, 30.0, 40.0}
        ));

    }

    public static double calculateTotalCost(int[] quantity, String[] name, double[] cost) {

        if (quantity.length != name.length || quantity.length != cost.length) {
            return -1.0;
        }

        double total = 0.0;

        for (int i = 0; i < quantity.length; i++) {

            if (quantity[i] < 0 || cost[i] < 0) {
                return 0.0;
            }

            total += quantity[i] * cost[i];
        }

        return total;
    }
}
