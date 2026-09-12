package week5;

/*
5.5 Different Data Types Of Arrays
1. Overview
Hello superstars! Welcome back to another session! In this session, we gonna learn about different data type arrays and their default values.

2. Different data type arrays in Java
Arrays size is fixed and no values. But, empty array has default value. Default values:

int [ ] - 0;

double [ ] - 0.0;

char [ ] - empty character;

String [ ] - null;

boolean [ ] - false;

Let's see an example Example 1

java
Copy code
public static void main(String[] args) {

    double[] salaries = new double[4];
    // default value of double array is 0.0
    System.out.println(salaries[0]);

    char[] grades = {'A','B', 'C', 'D'};
    char ch = grades[1];
    System.out.println(ch);

    char[] points = new char[4];
    // char [] default value is empty character
    char ch1 = points[2];
    System.out.println(ch1);

    String[] employeeNames = {"Mike", "Jone", "Kite"};
    System.out.println(employeeNames[0]);

    String[] names = new String[5];
    // default value is null
    System.out.println(names[1]);

    boolean[] bl = {true, false, false, true};
    System.out.println(bl[3]);

    boolean[] bl1 = new boolean[5];
    //default value is false
    System.out.println(bl1[0]);

}
plain
Copy code
Output is:
0.0
B

Mike
null
true
false
##### **3\. Conclusion**
I hope today's class was helpful. See you guys in the next class! Keep working hard!
 */
//write your static method here. No need to add Main class or main method.


public class Week5_5_DifferentDataTypesOfArrays {
    public static void main(String[] args) {
        double[] ratings = {4.5, 4.6, 5.0, 3.5};
        System.out.println(ratings[1]);

        double[] salaries = new double[4];
        //int -> 0
        //double -> 0.0
        System.out.println(salaries[0]);

        char[] grades = {'A', 'B', 'A', 'C', 'F', 'D'};
        System.out.println(grades[3]);

        char[] grades2 = new char[3];
        //char -> \u0000 -> empty char
        System.out.println(grades2[0]);

        String[] employeeNames = {"Steve", "Elon", "Erica", "Aisha"};
        System.out.println(employeeNames[3]);

        String[] cities = new String[6];
        //String -> null
        //null is a default value of any object
        //null means nothing
        System.out.println(cities[0]);

        boolean[] answers = {true, true, false, true, false};
        System.out.println(answers[3]);

        boolean[] answers1 = new boolean[10];
        System.out.println(answers1[2]);
        //boolean -> false


    }
}
