package week3;

/*
3.40 Methods With Multiple Parameters and Double Return Type
Methods with Multiple Parameters and Double Return Type is a concept in
Java programming that involves writing methods which take multiple input
parameters and return a value of double data type.
 */
//write your static method here. No need to add Main class or main method.

public class Week3_40_MethodsWithMultipleParametersAndDoubleReturnType {
    public static void main(String[] args) {
        double amount = calculateTax(100000, true);
        System.out.println(amount);

    }
    //write a method that takes users salary and whether the user is married or not?
    //if th user makes less than $100k and married => 5k
    //if the user is not married and makes less than $100k => 8%
    //if the user is married and makes over $100k than the tax is 10%
    //if the user is not married and makes over $100k then the tax is 15%
    //method should return the tax amount to be paid

    public static double calculateTax(double salary, boolean isMarried) {
        if (salary < 100000 && isMarried) {
            return salary * 0.05;
        } else if (salary < 100000 && !isMarried) {
            return salary * 0.08;
        } else if (salary >= 100000 && isMarried) {
            return salary * 0.10;
        } else if (salary >= 100000 && !isMarried) {
            return salary * 0.15;
        } else {
            return 0;
        }
    }

}
