package week5;

/*
5.21 Auto Boxing Unboxing
1. Overview
Hello superstars! Welcome back to another session! In this session, we gonna learn about auto boxing and unboxing in Wrapper class.

2. What is autoboxing and unboxing in the Wrapper class?
Autoboxing is a concept that converts literal values of primitive data types into Wrapper class. Unboxing is a process of converts Wrapper class into corresponding primitive data types. Example 1

java
Copy code
public static void main(String[] args) {

    Integer num = 25; // autoboxing

    int num2 = new Integer(5); //unboxing

    int sum = num + num2;
    System.out.println(sum);

    Double d = 25.0;
    Double d1 = 2.5;
    double result = d/d1;
    System.out.println(result);

}
plain
Copy code
Output is:
30
10.0
##### **3\. Conclusion**
I hope today's class was helpful. See you guys in the next class!
Keep working hard!
 */
//write your static method here. No need to add Main class or main method.

public class Week5_21_AutoBoxingUnboxing {
    public static void main(String[] args) {
        Integer num = 27; //autoboxing
        //autoboxing is a concept
        //that converts literal values of primitive data
        //types into Wrapper classes

        int num2 = new Integer(24); //unboxing
        //the process of converting Wrapper classes
        //into corresponding primitive data types

        int sum = num + num2;
        System.out.println(sum);

        Double d = 25.0;
        Double d2 = 2.5;
        double result = d/d2;
        System.out.println(result);

    }
}
