package week1;

/*
1.23.5 Range Difference
easy
|
30 min
|
Share
The Tesla Model S Plaid and the Tesla Model S Long Range are two different variants of the Tesla Model S electric car. The main differences between the two variants are in terms of horsepower, torque, and range.

The Tesla Model S Plaid has an estimated horsepower of 1,020 and torque of 1,014 Nm. It also has a range of approximately 390 miles on a single charge.

The Tesla Model S Long Range, on the other hand, has an estimated horsepower of 516 and torque of 713 Nm. It also has a range of approximately 402 miles on a single charge.

Write a java program that prints out the difference in horsepower, torque, and range between Tesla Model S Plaid and Tesla Model S Long Range.

java
Copy code
____ horsepowerPlaid = _____;
____ torquePlaid = _____;
_____ rangePlaid = _____;

_____ horsepowerLongRange = _______;
_____ torqueLongRange = _______;
_____ rangeLongRange = _______;

______ horsepowerDiff = ______;
______ torqueDiff = _______;
______ rangeDiff = _______;

System.out.println("Difference in horsepower: " + horsepowerDiff);
System.out.println("Difference in torque: " + torqueDiff);
System.out.println("Difference in range: " + rangeDiff);
Expected Output:

plain
Copy code
Difference in horsepower: [Horsepower Difference]
Difference in torque: [Torque Difference]
Difference in range: [Range Difference]
 */

public class Week1_23_5_RangeDifference {
    public static void main(String[] args) {
        int horsepowerPlaid = 1_020;
        int torquePlaid = 1_014;
        int rangePlaid = 390;

        int horsepowerLongRange = 516;
        int torqueLongRange = 713;
        int rangeLongRange = 402;

        int horsepowerDiff = horsepowerPlaid - horsepowerLongRange;
        int torqueDiff = torquePlaid - torqueLongRange;
        int rangeDiff = rangeLongRange - rangePlaid;

        System.out.println("Difference in horsepower: " + horsepowerDiff);
        System.out.println("Difference in torque: " + torqueDiff);
        System.out.println("Difference in range: " + rangeDiff);
    }
}

