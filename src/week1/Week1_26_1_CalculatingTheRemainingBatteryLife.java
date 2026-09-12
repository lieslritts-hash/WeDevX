package week1;

/*\
1.26.1 Calculating the Remaining Battery Life*
easy
|
30 min
|
Share
A Tesla car has an original battery capacity of 100 units and a
current battery level of 85 units. Write a program to calculate
the remaining battery life of the car as a percentage of the
original battery capacity. Exercise Description: Declare a
variable originalBatteryCapacity and initialize it with 100.
Declare a variable batterySpent and initialize it with 85.
Declare a variable remainingBatteryLife and initialize it with
the value calculated based on the given facts above. Print the
 message "The remaining battery life is: X%", where X is the
 value of remainingBatteryLife.


 */

public class Week1_26_1_CalculatingTheRemainingBatteryLife {
    public static void main(String[] args) {
        int originalBatteryCapacity = 100;
        int batterySpent = 85;

        int remainingBatteryLife = originalBatteryCapacity % batterySpent;

        System.out.println("The remaining battery life is: " + remainingBatteryLife + "%");
    }
}

