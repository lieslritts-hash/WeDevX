package week1;

/*
1.25.5 Calculate the Percentage of a Number
easy
|
30 min
|
Share
Write a program that calculates the percentage of a given part relative to a
whole number. Here's how you can do it:

Declare the variable part with double data type and 25 value;

Declare the variable whole with double data type and 50 value;

Calculate the percentage using this formula - (part / whole * 100);

Print the result as "The percentage is X%"
 */

public class Week1_25_4_CalculateThePercentageOfANumber {
    public static void main(String args[]) {
        double part = 25;
        double whole = 50;

        double percentage = (part/whole*100);

        System.out.println("The percentage is " + percentage + "%");
    }
}

