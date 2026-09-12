package week4;

/*
4.24.1 Even numbers with skip*
easy
|
30 min
|
Share
Write a method called printEvenNumbers() that takes an int n as parameter and prints all even numbers from 1 to n included. However, if the current number being processed is divisible by 3, the loop should continue without printing that number. Return: This method does not return anything. Note: if number is 0 or negative, print "Error! Number should be bigger than 0"

Return type: void Example #1: Parameter:

plain
Copy code
// represents the upper bound of the range to print
int n = 10;
Output:

plain
Copy code
2
4
8
10
Example #2: Parameter:

plain
Copy code
int n = 15;
Output:

plain
Copy code
2
4
8
10
14
Example #3: Parameter:

plain
Copy code
int n = 5;
Output:

plain
Copy code
2
4
Example #4: Parameter:

plain
Copy code
int n = 0;
Output:

plain
Copy code
Error! Number should be bigger than 0
 */

public class Week4_24_1_EvenNumbersWithSkip {
    public static void main(String[] args) {

        printEvenNumbers(10);
        printEvenNumbers(15);
        printEvenNumbers(5);
        printEvenNumbers(0);

    }

    public static void printEvenNumbers(int n) {

        if (n <= 0) {
            System.out.println("Error! Number should be bigger than 0");
            return;
        }
        for (int i = 1; i <= n; i++) {

            if (i % 2 != 0 || i % 3 == 0) {
                continue;
            }
            System.out.println(i);
        }
    }
}
