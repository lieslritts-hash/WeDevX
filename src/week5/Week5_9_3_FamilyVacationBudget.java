package week5;

/*
5.9.3 Family Vacation Budget*
easy
|
30 min
|
Share
Create a static method findMostExpensiveDay() that takes an array
double[] parameter with daily expenses during a family vacation.
The program should find the day with the highest expenses and display
the amount spent on that day.

Example:
Parameter: double[] = {50.0, 75.5, 120.75, 90.25, 150.0, 85.5, 200.0}
Return: void Output: The highest expenses were $200.0 on day 7
 */
//write your static method here. No need to add Main class or main method.

public class Week5_9_3_FamilyVacationBudget {
    public static void main(String[] args) {

        double[] dailyExpenses = {50.0, 75.5, 120.75, 90.25, 150.0, 85.5, 200.0};
        findMostExpensiveDay(dailyExpenses);

    }

    public static void findMostExpensiveDay(double[] dailyExpenses) {

        double maxExpense = dailyExpenses[0];
        int maxDay = 1;

        for (int i = 0; i < dailyExpenses.length; i++) {

            if (dailyExpenses[i] > maxExpense) {
                maxExpense = dailyExpenses[i];
                maxDay = i + 1;
            }
        }

        System.out.println("The highest expenses were $" + maxExpense + " on day " + maxDay);
    }
}
