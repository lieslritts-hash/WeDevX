package week3;

/*
3.36.3 Average of Three Numbers
easy
|
30 min
|
Share
Write a static method called calculateAverage() that accepts three double numbers as parameters and returns their average as a double.

Example of result:
plain
Copy code
Input: 10.0, 20.0, 30.0
Output: 20.0

Input: -10, 0, 10
Output: 0.0

Input: 5.5, 11.1, 16.7
Output: 11.1
Hint: How to find average of three numbers
To calculate the average of three numbers, follow these steps:

Add the three numbers together to find their sum.

Divide the sum by 3 (since you have three numbers) to find the average.

The formula for calculating the average of three numbers (x, y, and z) can be written as:

Average = (x + y + z) / 3

That's it! Just add the numbers together and divide by 3 to find the average.

Solution
java
Copy code
public static double calculateAverage(double num1, double num2, double num3) {
  return (num1 + num2 + num3) / 3;
}
 */
//write your static method here. No need to add Main class or main method.

public class Week3_36_3_AverageOfThreeNumbers {
    static void main(String[] args) {
       double average1 = calculateAverage(10.0, 20.0, 30.0);
       System.out.println(average1);

       double average2 = calculateAverage(-10.0, 0, 10.0);
       System.out.println(average2);

       double average3 = calculateAverage(5.5, 11.1, 16.7);
       System.out.println(average3);

    }
    public static double calculateAverage(double num1, double num2, double num3) {
        return (num1 + num2 + num3) /3;
    }
}
