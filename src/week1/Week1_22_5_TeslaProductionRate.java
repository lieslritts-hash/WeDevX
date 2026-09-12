package week1;

/*
1.22.5 Tesla Production Rate*
easy
|
30 min
|
Share
Tesla's production rate per quarter is 125,000
vehicles. Write a program that finds the production
rate per 4 quarters.

java
Copy code
____ q1 = ____;
____ q2 = ____;
____ q3 = ____;
____ q4 = ____;

___ yearly = ____;

System.out.println(yearly);
 */

public class Week1_22_5_TeslaProductionRate {
    public static void main(String[] args) {
        int q1 = 125_000;
        int q2 = 125_000;
        int q3 = 125_000;
        int q4 = 125_000;

        int yearly = q1 + q2 + q3 + q4;

        System.out.println(yearly);
    }
}

