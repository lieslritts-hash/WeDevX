package week3;

/*
3.37.3 Number is Divisible by Another Number
easy
|
30 min
|
Share
Write a static method called isDivisibleBy() that accepts two integers as parameters and returns boolean: true if the first number is divisible by the second number and false otherwise.

Example of output:
plain
Copy code
Input: 10, 2
Output: true

Input: 10, 3
Output: false

Input: 10, 10
Output: true
 */
//write your static method here. No need to add Main class or main method.

public class Week3_37_2_NumberIsDivisibleByAnotherNumber {
    public static void main(String[] args) {

        boolean int1 = isDivisibleBy(10, 2);
        System.out.println(int1);

        boolean int2 = isDivisibleBy(10, 3);
        System.out.println(int2);

        boolean int3 = isDivisibleBy(10, 10);
        System.out.println(int3);
    }

    public static boolean isDivisibleBy(int num1, int num2) {

        if (num1 % num2 == 0) {
            return true;
        } else {
            return false;
        }
    }

}
