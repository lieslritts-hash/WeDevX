package week3;

/*
3.37.4 Check if a Number is Even
easy
|
30 min
|
Share
Write a static method called isEven() that accepts an integer as a parameter and returns a boolean: true if the number is even and false otherwise.

Example of result:
plain
Copy code
Input: 10
Output: true

Input: 9
Output: false

Input: 0
Output: true
 */
//write your static method here. No need to add Main class or main method.

public class Week3_37_3_CheckIfANumberIsEven {
    public static void main(String[] args) {

        boolean int1 = isEven(10);
        System.out.println(int1);

        boolean int2 = isEven(9);
        System.out.println(int2);

        boolean int3 = isEven(0);
        System.out.println(int3);
    }
    public static boolean isEven(int num1) {
        if (num1 % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

}
