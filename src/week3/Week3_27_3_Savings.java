package week3;

/*
3.27.3 Savings*
easy
|
30 min
|
Share
Write a Java program that calculates how much money you
would save by saving 10% of a $130,000.00 salary. To do this,
create an instance method called calculateSavings() that takes
no parameters and returns the amount of money saved. In this
method, calculate 10% of the $130,000.00 salary and return the
result as a double. In the main() method of your program, create
an instance of the class containing the calculateSavings() method
and call the method to retrieve the savings amount. Then, print the
result to the console using a user-friendly message. Expected Output:

plain
Copy code
13000.00
Note: use printf() method inside the main method to print out the double number with 2 decimals


 */

public class Week3_27_3_Savings {
    public static void main(String[] args) {
        double savings = calculateSavings();
        System.out.printf("%.2f%n", savings);
    }

    public static double calculateSavings() {
        return .10 * 130000.00;
    }
    
}
