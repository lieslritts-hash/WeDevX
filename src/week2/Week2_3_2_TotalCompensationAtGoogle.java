package week2;

import java.util.Scanner;

/*
2.3.2 Total Compensation at Google
easy
|
30 min
|
Share
Write a program that asks the user to enter their base salary,
Stock Options $ amount, and yearly bonuses percentage.
The program sums up all packages and prints out the total
amount. Expected Output:

plain
Copy code
Please enter your annual base salary:
Please enter the amount paid in stocks per year:
Please enter the bonus percentage from the base salary:
Your annual total compensation is: X
Where X is the result of base salary + stocks amount +
(bonus percentage of base salary) To get the amount
from the bonus percentage, use the following formula.
(Bonus Percentage / 100) * Base Salary Sample: To calculate
(160000.00base + 60000.00stocks) + (10%bonus of 160000.00),
you can first find the value of 10% of 160000.00, and then
add it to the sum of 160000.00 and 60000.00 First, find 10%
of 160000: Percentage of 160000 = (10 / 100) * 160000 =
16000 Next, add 160000 and 60000: 160000 + 60000 = 220000
Finally, add the result of 10% of 160000 to the sum of 160000
and 60000: 220000 + 16000 = 236000 So, (160000 + 60000) +
(10% of 160000) equals 236000.
 */

public class Week2_3_2_TotalCompensationAtGoogle {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your annual base salary:");
        double baseSalary = scanner.nextDouble();

        System.out.println("Please enter the amount paid in stocks per year:");
        double stocksAmount = scanner.nextDouble();

        System.out.println("Please enter the bonus percentage from the base salary:");
        double bonusPercentage = scanner.nextDouble();

        double bonusAmount = (bonusPercentage / 100) * baseSalary;
        double totalCompensation = baseSalary + stocksAmount + bonusAmount;

        System.out.printf("Your annual total compensation is: %.0f", totalCompensation);
    }
}
