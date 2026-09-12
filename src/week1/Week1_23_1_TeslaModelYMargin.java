package week1;

/*
1.23.1 Tesla Model Y Margin*
easy
|
30 min
|
Share
Recent data compiled by Reuters shows that
Tesla's margins are significantly higher than
those of its rivals, both in terms of gross and
net profit. Tesla Model Y's price tag starts at
$41,190 The average cost of production is $31,616.
What is the profit margin Tesla makes on each Model Y?
Write a program that stores the values of modelYPrice and
costOfProduction in the most suitable data type. Then
create a netProfit variable where the value is the difference
between price and the cost. End the program with printing out
the value of netProfit.

java
Copy code
____ modelYPrice = ____;
____ costOfProduction = _____;
____ netProfit = ______;

System.out.println(netProfit);
 */

public class Week1_23_1_TeslaModelYMargin {
    public static void main(String[] args) {
        int modelYPrice = 41_190;
        int costOfProduction = 31_616;

        int netProfit = modelYPrice - costOfProduction;

        System.out.println(netProfit);
    }
}

