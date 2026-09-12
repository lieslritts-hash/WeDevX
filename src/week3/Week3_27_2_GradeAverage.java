package week3;

/*
3.27.2 Grade Average*
easy
|
30 min
|
Share
Create a Java class called Main that contains an
instance method named findAverage() that finds the
average of the numbers 90.5, 77.6, and 88.0. This
method should take no parameters and return the
average as a double. To implement this method, you
can use the formula (num1 + num2 + num3) / 3 to
calculate the average of the three numbers. In the
main() method of your program, create an instance of
the Main class and call the findAverage() method to
retrieve the average. Then, print the result to the
console. Expected Output:

plain
Copy code
85.36666666666667
 */

public class Week3_27_2_GradeAverage {
    public static void main(String[] args) {
        double average = findAverage();
        System.out.println(average);
    }

    public static double findAverage() {
        double num1 = 90.5;
        double num2 = 77.6;
        double num3 = 88.0;
        return (num1 + num2 + num3) / 3;
    }
}
