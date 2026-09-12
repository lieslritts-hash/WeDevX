package week4;

/*
4.42.3 Conditional rounding*
easy
|
30 min
|
Share
Exercise Description: Write a method called conditionalRounding() that
accepts two Double params. The method should do the following activities:

If the square root of the first param is bigger than the second param,
return the result of the square root rounded to the bigger number.

If the square root of the first param is smaller than the second param,
return the result of the square root rounded to the smaller number.

If the square root of the first param is equal to the second param,
return the result of the square root.

Params: Double input1, Double input2 Return: Double Example:

plain
Copy code
double val1 = 90.0;
double val2 = 11.0;
conditionalRounding(val1, val2) // Return 9.0 (square root of 90
rounded to smaller number)
Example:

plain
Copy code
double val1 = 145.0;
double val2 = 5.0;
conditionalRounding(val1, val2) // Return 9.0 (square root of 90
rounded to smaller number)
 */
//write your static method here. No need to add Main class or main method.


public class Week4_42_3_ConditionalRounding {
    public static void main(String[] args) {

        System.out.println(conditionalRounding(145, 5));

    }

    public static double conditionalRounding(double val1, double val2 ) {

        if (Math.sqrt(val1) > val2) {
            return Math.ceil(Math.sqrt(val1));
        } else if (Math.sqrt(val1) < val2) {
            return Math.floor(Math.sqrt(val1));
        } else {
            return Math.sqrt(val1);
        }
    }
}
