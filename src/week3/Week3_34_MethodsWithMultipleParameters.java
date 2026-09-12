package week3;

/*
3.34 Methods With Multiple Parameters
This lecture will cover the use of methods with multiple
parameters in Java programming, including how to pass multiple
parameters, how to handle different parameter types.
 */

public class Week3_34_MethodsWithMultipleParameters {

    //add your public static method here
    //No need to add Main class and a main Method
    public static void main(String[] args) {
        printUserInfo("Askar", 27);
        printUserInfo("Minnie", 16);
        printUserInfo("Elon", 55);
    }

    //write a method that prints out the following user info
    //name and age
    //params are also called arguments
    public static void printUserInfo(String name, int age) {

        System.out.println("Welcome " + name);
        System.out.println("Your age is " + age);

    }
}
