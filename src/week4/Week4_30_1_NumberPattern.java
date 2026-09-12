package week4;

/*
4.30.1 Number pattern*
easy
|
30 min
|
Share
Create a method called printNumberTriangle() that takes an int as parameter and
prints a number triangle with the pattern shown below. The method should use nested
while loops to achieve the pattern.

Return Type: void

Example #1:
Parameter:

plain
Copy code
int counter = 5
Output:

plain
Copy code
1
22
333
4444
55555
: In the example above, the method was called with an argument of 5
which is the limit of the number triangle pattern. The method prints the
number triangle to the console.
 */
//write your static method here. No need to add Main class or main method.

public class Week4_30_1_NumberPattern {
    public static void main(String[] args) {

        printNumberTriangle(5);

    }
    public static void printNumberTriangle(int number) {

        int counter1 = 1;

        while (counter1 <= number) {

            int counter2 = 1;

            while (counter2 <= counter1) {
                System.out.print(counter1);
                counter2++;
            }

            System.out.println();
            counter1++;
        }
    }
}
