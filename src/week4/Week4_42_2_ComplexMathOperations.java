package week4;

/*
4.42.2 Complex math operations*
easy
|
30 min
|
Share
Exercise Description: Write a method called complexMathOperations() that takes following params:

Int filter

Double inp1

Double inp2

The method should perform specific operations based on the filter value:

If the filter is 0, the method should return inp2 raised to the power of inp1

If the filter is 1, the method should return inp1 raised to the power of inp2

If the filter is none of the above, the method should return the absolute
value of
inp2 being subtracted from inp1

Return: Double Example #1:

plain
Copy code
int filter = 0;
double inp1 = 15;
double inp2 = 3;
complexMathOperations(filter, inp1, inp2) // Return is 14348907 (3 raised
to the power of 15)
Example #2:

plain
Copy code
int filter = 1;
double inp1 = 9;
double inp2 = 2;
complexMathOperations(filter, inp1, inp2) // Return is 81 (9 raised to the
power of 2)
Example #3:

plain
Copy code
int filter = 2;
double inp1 = 100;
double inp2 = 150;
complexMathOperations(filter, inp1, inp2) // Return is 50 (Absolute value
of 100 - 150)
 */
//write your static method here. No need to add Main class or main method.

public class Week4_42_2_ComplexMathOperations {
    public static void main(String[] args) {

        System.out.println(complexMathOperations(0, 15, 3));
        System.out.println(complexMathOperations(1, 9, 2));
        System.out.println(complexMathOperations(2, 100, 150));

    }

    public static double complexMathOperations(int filter, double inp1, double inp2 ) {

        if (filter == 0) {
            return Math.pow(inp2, inp1);
        } else if (filter == 1) {
            return Math.pow(inp1, inp2);
        } else {
            return Math.abs(inp1 - inp2);
        }
    }
}
