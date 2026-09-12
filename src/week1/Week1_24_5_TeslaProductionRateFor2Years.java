package week1;

/*
1.24.5 Tesla Production Rate For 2 Years
easy
|
30 min
|
Share
Write a program that calculates the total number of Tesla
Model S cars produced in two years, given the production
rate of 3,000 cars per week in the first year and 4,000 cars
per week in the second year.

java
Copy code
____ year1WeeklyProductionRate = ____;
____ year2WeeklyProductionRate = ____;
____ numberOfWeeksInYear = 52;

____ year1ProductionRate = ____;
____ year2ProductionRate = ____;

____ totalCars = _____;

System.out.println("Total number of Tesla Model S cars produced
in two years: " + totalCars);
 */

public class Week1_24_5_TeslaProductionRateFor2Years {
    public static void main(String[] args) {
        int year1WeeklyProductionRate = 3_000;
        int year2WeeklyProductionRate = 4_000;
        int numberOfWeeksInYear = 52;

        int year1ProductionRate = year1WeeklyProductionRate * numberOfWeeksInYear;
        int year2ProductionRate = year2WeeklyProductionRate * numberOfWeeksInYear;

        int totalCars = year1ProductionRate + year2ProductionRate;

        System.out.println("Total number of Tesla Model S cars produced in two years: " + totalCars);
    }
}

