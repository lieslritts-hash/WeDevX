package week5;

/*
5.8 Array Data Analysis Practice
1. Overview
Hello superstars! Welcome back to another session! In this session,
we gonna get our hands dirty practicing arrays.

2.Array Data Analysis practice
For this example, let's say we are working in Amazon. we need to find:

average revenue

how much do all users spend every day in average

AverageIncome = sum all revenue per day / number of revenues in an array Let's see an example

java
Copy code
public static void main(String[] args) {

    double[] dailyRevenue = {23.4, 25.0, 19.2, 21.3};
    //average is sum divided by elements number

    double sum = 0;                                       // declared int sum variable

    for(int i=0; i<dailyRevenue.length; i++){
        sum+= dailyRevenue[i];
    }
    System.out.println(sum);
    double average = sum/dailyRevenue.length;
    System.out.println("Average income is "+average);
}
plain
Copy code
Output is:
88.89999999999999
Average income is 22.224999999999998
##### **3\. Conclusion**
I hope today's class was helpful. See you guys in the next class! Keep working hard!
 */

//write your static method here. No need to add Main class or main method.


public class Week5_8_ArrayDataAnalysisPractice {
    public static void main(String[] args) {
        //imagine we work for Amazon
        //our task is to find the average daily revenue
        //how much do all users spend every day in average

        double[] dailyRevenueArr = {25.0, 10.2, 44.5, 14.7};
        //average = sum of all numbers divided by the count number

        //when you are using = sign alone
        //it means you are overriding the old value

        double sum = 0;
        for(int i = 0; i < dailyRevenueArr.length; i++) {
           sum += dailyRevenueArr[i];
            //i:0 => 0 + 25.0 = 25.0
            //i:1 => 25.0 + 10.2 = 35.2
            //i:2 => 35.2 + 44.5 = 79.7
            //i:3 => 79.7 + 14.7 = 94.4


        }

        System.out.println(sum);
        double average = sum/dailyRevenueArr.length;
        System.out.println("The daily average revenue is: " + average);

    }
}
