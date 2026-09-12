package week3;

/*
3.26.4 Factorial*
easy
|
30 min
|
Share
Write the Main class with an instance method getFactorial()
that calculates and returns the factorial of 5 (5! = 5 x 4 x 3 x 2 x 1).
Call the getFactorial() method in main method and print out the value of
getFactorial(); Expected Output:

plain
Copy code
120
 */

public class Week3_26_3_Factorial {
    public static void main(String[] args) {
        Week3_26_3_Factorial obj = new Week3_26_3_Factorial();
        int factorial = obj.getFactorial();
        System.out.println(factorial);

    }

    public int getFactorial() {
        return 5 * 4 * 3 * 2 * 1;
        }
}
