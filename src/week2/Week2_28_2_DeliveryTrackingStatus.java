package week2;

import java.util.Scanner;

/*
2.28.2 Delivery Tracking Status*
easy
|
30 min
|
Share
Write a program that checks if a package has been delivered to its destination and prints a message if it has. Ask the user the following question Has the package been delivered? (true/false)

Required Variables:
plain
Copy code
____ isDelivered = ___;
if the user answers true then print out:

plain
Copy code
The package has been delivered to its destination.
if the user answers false then print out:

plain
Copy code
The package has not yet been delivered. Please check back later for updates
Example #1:
Input:

plain
Copy code
true
Output:

plain
Copy code
Has the package been delivered? (true/false)
The package has been delivered to its destination.
Example #2:
Input:

plain
Copy code
false
Output:

plain
Copy code
Has the package been delivered? (true/false)
The package has not yet been delivered. Please check back later for updates

 */

public class Week2_28_2_DeliveryTrackingStatus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Has the package been delivered? (true/false)");
        boolean delivered = sc.nextBoolean();

        if(delivered) {
            System.out.println("The package has been delivered to its destination.");
        }

        if(!delivered) {
            System.out.println("The package has not yet been delivered. Please check back later for updates");
        }
    }
}
