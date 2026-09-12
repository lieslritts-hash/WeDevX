package week1;

/*
1.24.2 Elon Musk’s Tesla Stake
easy
|
30 min
|
Share
Elon Musk remains Tesla's biggest shareholder with a
13.4% stake, according to financial market data provider
Refinitiv. As of Feb 7th, 2023 Tesla Market Capitalization
was 610,270,000,000. Write a program that finds Elon Musk's
stake converted to $ amount.

First store the value of elonMuskTeslaStakePercentage and
teslaMarketCap in the most suitable data types. To calculate
percentages, divide the decimal number by 100. Then create a
variable with elonMuskStakeInDollars and calculate the value
based on the numbers above. To calculate it, you need to
multiply the two above variables. End the program with
printing the value of elonMuskStakeInDollars;

java
Copy code
______ elonMuskTeslaStakePercentage = _____;
______ teslaMarketCap = _______;

double elonMuskStakeInDollars = ______;

System.out.println(elonMuskStakeInDollars);
 */

public class Week1_24_2_ElonMusksTeslaStake {
    public static void main(String[] args) {
        double elonMuskTeslaStakePercentage = 13.4;
        long teslaMarketCap = 610_270_000_000L;

        double stakePercentageDecimal = 13.4/100;

        double elonMuskStakeInDollars = stakePercentageDecimal * teslaMarketCap;

        System.out.println(elonMuskStakeInDollars);
    }
}

