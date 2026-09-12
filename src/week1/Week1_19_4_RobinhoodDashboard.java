package week1;

/*
1.19.4 Robinhood Dashboard*
easy
|
30 min
|
Share
Write a program that mimics the Robinhood stock
trading app. create a stockName variable and store
"Microsoft" and create a stockTicker variable and
store "MSFT". Print out the following output. Expected Output:

plain
Copy code
Stock Name Stock Ticker
Microsoft MSFT

Shares MarketValue
323 $84102
use \t escape character to give spaces - 4 times
for the 1st and 2nd lines, 5 times for the 4th line,
and 5 times for the last line. Also, do not forget to
add an empty space on 3rd line.
 */

public class Week1_19_4_RobinhoodDashboard {
    public static void main(String[] args) {
        String stockName = "Microsoft";
        String stockTicker = "MSFT";

        System.out.println("Stock Name\t\t\t\tStock Ticker");
        System.out.println(stockName + "\t\t\t\t" + stockTicker + "\n");

        System.out.println("Shares\t\t\t\t\tMarketValue");
        System.out.println("323\t\t\t\t\t$84102");
    }
}
