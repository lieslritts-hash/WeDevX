package week1;

/*
1.23.4 Tesla Produced Cars*
easy
|
30 min
|
Share
Write a program that calculates the number of
Tesla Model S cars remaining to be produced in a year;
given 30,000 cars are produced and the target is to
produce 156,000 cars in a year.

java
Copy code
____ carsProduced = _____;
____ target = _____;
____ remaining = _____;

System.out.println(remaining);
 */
public class Week1_23_4_TeslaProducedCars {
    public static void main(String[] args) {
        int carsProduced = 30_000;
        int target = 156_000;

        int remaining = target - carsProduced;

        System.out.println(remaining);
    }
}

