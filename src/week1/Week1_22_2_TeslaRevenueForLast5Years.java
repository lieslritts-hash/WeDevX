package week1;

/*
1.22.2 Tesla Revenue for last 5 years
easy
|
30 min
|
Share
Tesla's Revenue for the last 5 years was 2022 -
$81,462,000,000 2021 - $53,823,000,000 2020 -
$31,536,000,000 2019 - $24,578,000,000 2018 -
$21,461,000,000 Write a program that stores each
year's revenue in the most suitable data type. Then
create a totalRevenenueForLast5Years variable where
the value should be the sum of the last 5 years revenue.

java
Copy code
____ year2018Revenue = ____;
____ year2019Revenue = ____;
____ year2020Revenue = ____;
____ year2021Revenue = ____;
____ year2022Revenue = ____;

____ totalRevenenueForLast5Years = _____;

System.out.println(totalRevenenueForLast5Years);
 */

public class Week1_22_2_TeslaRevenueForLast5Years {
    public static void main(String[] args) {
        long year2018Revenue = 21_461_000_000L;
        long year2019Revenue = 24_578_000_000L;
        long year2020Revenue = 31_536_000_000L;
        long year2021Revenue = 53_823_000_000L;
        long year2022Revenue = 81_462_000_000L;

        long totalRevenueForLast5Years = year2018Revenue + year2019Revenue + year2020Revenue + year2021Revenue + year2022Revenue;

        System.out.println(totalRevenueForLast5Years);
    }
}

