package week5;

/*
5.9.4 Stock Market Evaluation
easy
|
30 min
|
Share
Create a static method findMaxStockPrice() that takes an array
double[] parameter with daily stock prices for a week.
The program should find the day with the highest stock price and display
the price along with the corresponding day.

Example:
Parameter: double[] = {110.5, 112.0, 109.75, 115.25, 118.0, 117.5, 119.75}
Return: void Output: The highest stock price was $119.75 on day 7
 */
//write your static method here. No need to add Main class or main method.

public class Week5_9_4_StockMarketEvaluation {
    public static void main(String[] args) {

        double[] dailyStockPrices = {110.5, 112.0, 109.75, 115.25, 118.0, 117.5, 119.75};
        findMaxStockPrice(dailyStockPrices);


    }

    public static void findMaxStockPrice(double[] dailyStockPrices) {


        double maxStockPrice = dailyStockPrices[0];
        int maxStockDay = 1;

        for (int i = 0; i < dailyStockPrices.length; i++) {

            if (dailyStockPrices[i] > maxStockPrice) {
                maxStockPrice = dailyStockPrices[i];
                maxStockDay = i + 1;
            }
        }

        System.out.println("The highest stock price was $" + maxStockPrice + " on day " + maxStockDay);
    }
}
