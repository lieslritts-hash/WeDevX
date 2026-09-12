package week3;

/*
3.27.1 Pi*
easy
|
30 min
|
Share
Create a Java static method named getPi() that retrieves
the mathematical constant pi and returns it as a double.
The value of pi is 3.14159 Call getPi() method in the
main method and print the value. Expected Output:

plain
Copy code
3.14159
Fun Facts: This method can be used to easily retrieve
the value of pi and use it in other parts of your program,
such as for geometry calculations or statistical analysis.
To implement this method, you can use the, which is built
into Java and returns the value of pi to a high degree of
precision. One fun fact about pi is that it is an irrational
number, which means it cannot be expressed as a finite decimal
or fraction. The decimal representation of pi goes on forever
and has no repeating pattern, making it a truly unique and
fascinating number.
 */

public class Week3_27_1_Pi {
    public static void main(String[] args) {
        double pi = getPi();
        System.out.println(pi);

    }

    public static double getPi() {
        return 3.14159;
    }
}
