package week5;

/*
5.8.5 Monthly Income and Expense Analysis
easy
|
30 min
|
Share
Create a static method analyzeMonthlyBudget() that takes two
arrays of the same length as parameters: an array of monthly income
(double) and an array of monthly expenses (double). The program should
calculate and display the following information:

For each month, whether there is a budget surplus or deficit and by how much;

The total surplus or deficit for the entire year.

Example:
Parameters:

plain
Copy code
double[] income = {2500.0, 2400.0, 2200.0, 2100.0, 2300.0, 2400.0, 2500.0, 2600.0,
2700.0, 2800.0, 2500.0, 2400.0}
double[] expenses = {2600.0, 2700.0, 2800.0, 2900.0, 2800.0, 2600.0, 2400.0, 2300.0,
2400.0, 2500.0, 2700.0, 2600.0}
Return: void Output:

plain
Copy code
Month 1: Deficit of $100.0
Month 2: Deficit of $300.0
Month 3: Deficit of $600.0
Month 4: Deficit of $800.0
Month 5: Deficit of $500.0
Month 6: Deficit of $200.0
Month 7: Surplus of $100.0
Month 8: Surplus of $300.0
Month 9: Surplus of $300.0
Month 10: Surplus of $300.0
Month 11: Deficit of $200.0
Month 12: Deficit of $200.0
Total Surplus/Deficit for the Year: $-1900.0
  */
//write your static method here. No need to add Main class or main method.


public class Week5_8_5_MonthlyIncomeAndExpenseAnalysis {
    public static void main(String[] args) {

        double[] income = {
                2500.0, 2400.0, 2200.0, 2100.0, 2300.0, 2400.0,
                2500.0, 2600.0, 2700.0, 2800.0, 2500.0, 2400.0
        };

        double[] expenses = {
                2600.0, 2700.0, 2800.0, 2900.0, 2800.0, 2600.0,
                2400.0, 2300.0, 2400.0, 2500.0, 2700.0, 2600.0
        };

        analyzeMonthlyBudget(income, expenses);
    }

    public static void analyzeMonthlyBudget(double[] monthlyIncome, double[] monthlyExpenses) {

        double total = 0.0;

        for (int i = 0; i < monthlyIncome.length; i++) {
            double difference = monthlyIncome[i] - monthlyExpenses[i];
            total += difference;

            if (difference > 0) {
                System.out.println("Month " + (i + 1) + ": Surplus of $" + difference);
            } else if (difference < 0) {
                System.out.println("Month " + (i + 1) + ": Deficit of $" + Math.abs(difference));
            } else {
                System.out.println("Month " + (i + 1) + ": Balanced budget");
            }
        }
        System.out.println("Total Surplus/Deficit for the Year: $" + total);

    }
}
