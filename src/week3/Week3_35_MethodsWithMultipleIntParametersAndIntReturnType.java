package week3;

/*
3.35 Methods With Multiple Int Parameters and int return type
In this lecture, we will explore how to write and use Java methods
that take multiple parameters as input, and learn how to effectively
pass and process multiple arguments to achieve a desired outcome.
 */
//write your static method here. No need to add Main class or main method.
public class Week3_35_MethodsWithMultipleIntParametersAndIntReturnType {
    public static void main(String[] args) {
        int var = multiply(30,42);
        System.out.println(var);

        int average = calculateAverage(10, 40, 55, 66);
         System.out.println(average);
    }

//create a method that takes two int values
//and multiplies them and returns the value of multiplicatio
    public static int multiply(int num1, int num2) {
        return num1*num2;
    }

    //create a method that takes 4 int values  and return the average of those values
    public static int calculateAverage(int num1, int num2, int num3, int num4) {
        int average = (num1 + num2 + num3 + num4) / 4;

        return average;
    }

}
