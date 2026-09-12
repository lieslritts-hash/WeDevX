package week3;

/*
3.37.1 IsPositiveNumber?*
easy
|
30 min
|
Share
A positive integer is any whole number greater than zero. Your task is to write a method that will take in one input, an integer, and then check if it is positive or not. Param:

An integer: The number that you want to check.
Return type:

A boolean value: true if the number is positive, false if the number is not positive.
Task: Your task is to write a static method called isPositive() that will take in one param, an integer, and then check if it is positive or not. Expected Output:

plain
Copy code
isPositive(5); // true
isPositive(-5); // false
isPositive(0); // false
 */
//write your static method here. No need to add Main class or main method.

public class Week3_37_1_IsPositiveNumber {
   public static void main(String[] args) {

       boolean integer1 = isPositive(5);
       System.out.println(integer1);

       boolean integer2 = isPositive(-5);
       System.out.println(integer2);

       boolean integer3 = isPositive(0);
       System.out.println(integer3);

   }
    public static boolean isPositive(double integer) {

       if (integer > 0) {
       return true;
        } else {
           return false;
        }
    }

}
