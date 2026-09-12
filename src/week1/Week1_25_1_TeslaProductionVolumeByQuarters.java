package week1;

/*
1.25.1 Tesla Production Volume by Quarters*
easy
|
30 min
|
Share
Breakig News: Tesla reports 1310000 deliveries in 2022,
growth of 40% over last year. Write a program that will
store the value of total2022Deliveries in the most suitable
data type. Then create an averageDeliveryPerQuarter where the
value is calculated based on the given facts. Note: there are 4
Quarters in a year. Q1, Q2, Q3, Q4.

java
Copy code
____ total2022Deliveries = _____;
_____ numOfQuarters = _____;
_____ averageDeliveryPerQuarter = ____;

System.out.println(averageDeliveryPerQuarter);

 */

public class Week1_25_1_TeslaProductionVolumeByQuarters {
    public static void main(String[] args) {
        int total2022Deliveries = 1_310_000;
        int numOfQuarters = 4;

        int averageDeliveryPerQuarter = total2022Deliveries/numOfQuarters;

        System.out.println(averageDeliveryPerQuarter);
    }
}

