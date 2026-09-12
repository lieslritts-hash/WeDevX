package week3;

/*
3.40.2 Multiply Smallest Positive Doubles*
easy
|
30 min
|
Share
Description: Your task is to write an static method called
calculateFundraisingPercentage() that will take in two input doubles,
the amount raised and the goal amount, and then calculate the percentage
of the fundraising goal that has been reached based on the amount raised.
The percentage is calculated by dividing the amount raised by the goal amount
and then multiplying it by 100. Params:

Two doubles: The amount raised and the fundraising goal.
Return Type:

A double: The percentage of the fundraising goal that has been reached.
Task: Your task is to write an instance method called calculateFundraisingPercentage()
that will take in two input doubles, the amount raised and the fundraising goal, and
then calculate the percentage of the fundraising goal that has been reached based on
the amount raised. Expected Output:

plain
Copy code
calculateFundraisingPercentage(2500.0, 10000.0); // 25.0
calculateFundraisingPercentage(5000.0, 5000.0); // 100.0
calculateFundraisingPercentage(10000.0, 5000.0); // 200.0
 */
//write your static method here. No need to add Main class or main method.

public class Week3_40_2_MultiplySmallestPositiveDoubles {
    public static void main(String[] args) {
        double percentage = calculateFundraisingPercentage(2500.0, 10000.0);
        System.out.println(percentage);

        double percentage2 = calculateFundraisingPercentage(5000.0, 5000.0);
        System.out.println(percentage2);

        double percentage3 = calculateFundraisingPercentage(10000.0, 5000.0);
        System.out.println(percentage3);

    }
    public static double calculateFundraisingPercentage(double amountRaised, double goalAmount) {
        return (amountRaised / goalAmount) * 100;
    }

}
