package week1;

/*
1.25.3 Tesla Model 3 Charging Rate*
easy
|
30 min
|
Share
Write a program that calculates the remaining charging time required for a Tesla Model 3 car; given the car is currently at 35 kWh, it requires 50 kWh to charge fully, and the charging rate is 5 kWh per hour.

java
Copy code
____ currentKwh = ____;
____ fullKwh = ____;
____ ratePerHour = ____;

___ remainingChargingTime = ____;

System.out.println(remainingChargingTime);
 */

public class Week1_25_3_TeslaModel3ChargingRate {
    public static void main(String[] args) {
        int currentKwh = 35;
        int fullKwh = 50;
        int ratePerHour = 5;

        int remainingChargingTime = (fullKwh - currentKwh)/ratePerHour;

        System.out.println(remainingChargingTime);
    }
}

