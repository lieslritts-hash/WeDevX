package week3;

/*
3.36 Methods With Multiple Params and Double Return Type
Methods with multiple parameters and double return type in
Java enable the creation of functions that accept multiple
inputs and return fractional values.
 */
//write your static method here. No need to add Main class or main method.

public class Week3_36_MethodsWithMultipleParamsAndDoubleReturnType {
    public static void main(String[] args) {
       double var = subtract(100,50);
       System.out.println(var);

        Week3_36_MethodsWithMultipleParamsAndDoubleReturnType obj = new Week3_36_MethodsWithMultipleParamsAndDoubleReturnType();
        double taxAmount = obj.calculateTax(100000, 10);
        System.out.println(taxAmount);

        double taxAmount2 = obj.calculateTax(500000,15);
        System.out.println(taxAmount2);

    }

    //create a method that takes 2 double values and returns the difference beteen
    //the first value and second value

    public static double subtract(double num1, double num2) {

        return num1 - num2;
    }

    //create a method that takes users salary and tax percent and we return a tax amount
    //the user needs to pay

    public double calculateTax(double salary, int percent) {
        //100000 * (10/100)
        //10 / 100 => 0.1
        //10000

        return salary * (percent/100.0);
    }

}
