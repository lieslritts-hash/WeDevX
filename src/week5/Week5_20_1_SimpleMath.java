package week5;

/*
5.20.1 Simple math*
easy
|
30 min
|
Share
Write a method called calculate() that takes three wrapper
classes (Integer, Double, and Boolean) as params. If Boolean
is true, return sum of Integer and Double, otherwise return
difference between Integer and Double.

Return Type: Double

Example #1:
Parameters:

java
Copy code
Integer intValue = 5
Double doubleValue = 10.0
Boolean isSum = true
Return:

plain
Copy code
15.0
Example #2:
Parameters:

java
Copy code
Integer intValue = 5
Double doubleValue = 10.0
Boolean isSum = false
Return:

plain
Copy code
-5.0
: Use arithmetic operations to calculate the sum or difference,
and do not convert the wrapper classes to primitive types.
 */
//write your static method here. No need to add Main class or main method.

public class Week5_20_1_SimpleMath {
    public static void main(String[] args) {

        Integer intValue = 5;
        Double doubleValue = 10.0;
        Boolean isSum = true;

        System.out.println(calculate(intValue, doubleValue, isSum));

        isSum = false;

        System.out.println(calculate(intValue, doubleValue, isSum));
    }

    public static Double calculate(Integer intValue, Double doubleValue, Boolean isSum) {

        if (isSum == true) {
            return intValue + doubleValue;
        } else {
            return intValue - doubleValue;
        }
    }
}
