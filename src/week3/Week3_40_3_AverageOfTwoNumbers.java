package week3;

/*
3.40.3 Average of Two Numbers
easy
|
30 min
|
Share
Write a static method called calculateAverage() that accepts two double numbers as parameters and returns their average as double.

Example of result:
plain
Copy code
Input: 10, 20
Output: 15.0

Input: -10, -20
Output: -15.0

Input: 5.5, 11.1
Output: 8.3
 */
//write your static method here. No need to add Main class or main method.

public class Week3_40_3_AverageOfTwoNumbers {
    public static void main(String[] args) {

        double average = calculateAverage(10, 20);
        System.out.println(average);

        double average2 = calculateAverage(-10, -20);
        System.out.println(average2);

        double average3 = calculateAverage(5.5, 11.1);
        System.out.println(average3);

    }

    public static double calculateAverage(double num1, double num2) {
        return (num1 + num2) / 2;
    }

}
