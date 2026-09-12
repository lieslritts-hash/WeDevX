package week5;

/*
5.13.2 Find the Lowest Bids at Auction*
easy
|
30 min
|
Share
Create a static method named findLowestBids() that takes two
parameters: a double array (double[]) - bids containing various numeric
values in random order, and an integer (int) specifying the count of the
lowest bid values to find and return. Use Arrays.sort() and Arrays.copyOf()
methods to achieve this task. The method should return an array (double[])
containing the specified number of lowest bid values.

Return Type: double[]

Example:
Parameters:

plain
Copy code
double[] bids = [120.5, 90.2, 110.0, 85.3, 95.7]
int count = 2
Return:

plain
Copy code
[85.3, 90.2]
 */
//write your static method here. No need to add Main class or main method or import anything

import java.util.Arrays;
public class Week5_13_2_FindTheLowestBidsAtAuction {
    public static void main(String[] args) {

        double[] bids = {120.5, 90.2, 110.0, 85.3, 95.7};
        int count = 2;
        double[] lowestBids = findLowestBids(bids, count);
        System.out.println(Arrays.toString(lowestBids));
    }

    public static double[] findLowestBids(double[] bids, int count) {
        Arrays.sort(bids);
        return Arrays.copyOf(bids, count);
    }
}
