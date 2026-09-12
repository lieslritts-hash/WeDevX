package week5;

    /*
5.8.3 Total of groceries with condition*
easy
|
30 min
|
Share
Description: Write a method called calculateTotalCost()
that takes three arrays as input: an array of integers representing
the quantity of each item, an array of strings representing the name of
each item, and an array of doubles representing the cost of each item.
The method should calculate and return the total cost of all items whose
name has an even length. Params: Three arrays of equal size: an array of
integers representing the quantity of each item, an array of strings
representing the name of each item, and an array of doubles representing
the cost of each item. Return: A double value representing the total cost
of all items whose name has an even length.
Example: calculateTotalCost([2, 3, 4], ["apple", "banana", "orange"], [0.5, 0.25, 0.75]);
// Returns 3.75 (3 bananas at $0.25 each and 4 oranges at $0.75 each) calculateTotalCost([1, 0, 2],
["coffee", "tea", "juice"], [10.0, 8.0, 2.0]); // Returns 10.0 (1 coffee at $10.0 each)
calculateTotalCost([1, 2, 3], ["pizza", "burger", "fries"], [20.0, 10.0, 30.0]);
// Returns 20.0 (2 burgers at $10.0 each) Note: return -1.0 if arrays are not of equal size, or if
any quantity or cost is negative.
 */
//write your static method here. No need to add Main class or main method.

    public class Week5_8_3_TotalOfGroceriesWithCondidtion {
        public static void main(String[] args) {

            System.out.println(calculateTotalCost(
                new int[]{2, 3, 4},
                new String[]{"apple", "banana", "orange"},
                new double[]{0.5, 0.25, 0.75}
            ));

            System.out.println(calculateTotalCost(
                    new int[]{1, 0, 2},
                    new String[]{"coffee", "tea", "juice"},
                    new double[]{10.0, 8.0, 2.0}
            ));

            System.out.println(calculateTotalCost(
                    new int[]{1, 2, 3},
                    new String[]{"pizza", "burger", "fries"},
                new double[]{20.0, 10.0, 30.0}
            ));
        }

        public static double calculateTotalCost(int[] quantity, String[] name, double[] cost) {
            if (quantity.length != name.length || quantity.length != cost.length) {
                return -1.0;
            }

            double total = 0.0;

            for (int i = 0; i < quantity.length; i++) {

                if (quantity[i] < 0 || cost[i] < 0) {
                    return -1.0;
                }

                if (name[i].length() % 2 == 0) {
                    total += quantity[i] * cost[i];
                }
            }

            return total;
        }
    }