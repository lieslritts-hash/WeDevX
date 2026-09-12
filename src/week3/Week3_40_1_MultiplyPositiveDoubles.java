package week3;

/*
3.40.1 Multiply Positive Doubles
easy
|
30 min
|
Share
Description: Your task is to write a static method called multiplyPositiveDoubles() that will take in two input doubles, multiply them together, and then return the resulting product if both numbers are positive. If either number is negative, the method should return -1. Params:

Two doubles: The numbers that you want to multiply.
Return type:

A double: The product of the two input numbers, or -1 if either number is negative.
Task: Your task is to write a static method called multiplyPositiveDoubles() that will take in two input doubles, multiply them together, and then return the resulting product if both numbers are positive. If either number is negative, the method should return -1. Expected Result:

plain
Copy code
multiplyPositiveDoubles(2.0, 3.0); // 6.0
multiplyPositiveDoubles(-2.0, 3.0); // -1.0
multiplyPositiveDoubles(2.0, -3.0); // -1.0
multiplyPositiveDoubles(-2.0, -3.0); // -1.0
 */

public class Week3_40_1_MultiplyPositiveDoubles {
    public static void main(String[] args) {
        double equation = multiplyPositiveDoubles(2.0, 3.0);
        System.out.println(equation);

        double equation2 = multiplyPositiveDoubles(-2.0, 3.0);
        System.out.println(equation2);

        double equation3 = multiplyPositiveDoubles(2.0, -3.0);
        System.out.println(equation3);

        double equation4 = multiplyPositiveDoubles(-2.0, -3.0);
        System.out.println(equation4);

    }
    public static double multiplyPositiveDoubles(double num1, double num2) {

        if (num1 > 0 && num2 >0) {
            return num1 * num2;
        } else {
            return -1;
        }
    }
}
