package week4;

/*
4.17.2 Sum of numbers*
easy
|
30 min
|
Share
Description: The program should prompt the user to input a number,
then print the sum of all preceding positive numbers inclusively.
Input: The user should input one number. Output: The program should
output the result of the sum operation. If the number is negative, an
error message should be displayed. Sample Output: Enter a number: 5 The sum of
all positive numbers preceding 5 inclusively is 15 Enter a number: 15 The sum of all
positive numbers preceding 15 inclusively is 120 Enter a number: -1 Error! Invalid number


 */

import java.util.Scanner;

public class Week4_17_2_SumOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int number = sc.nextInt();

        int result = 0;

        if (number < 0) {
            System.out.println("Error! Invalid number");
        } else {

            for (int counter = 1; counter <= number; counter++) {
                result = result + counter;
            }
            System.out.println("The sum of all positive numbers preceding "
                    + number + " inclusively is " + result);
        }
    }
}
