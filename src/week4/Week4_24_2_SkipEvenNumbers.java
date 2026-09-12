package week4;

/*
4.24.2 Skip Even Numbers*
easy
|
30 min
|
Share
Create a program with a static method skipEvenNumbers(int start, int end) that prints numbers between start and end, excluding even numbers. The method should use a for loop and the continue statement to skip printing even numbers. It should then print the remaining odd numbers.

Example:
Parameters:

plain
Copy code
int start = 1
int end = 11
Return: void Output:

plain
Copy code
1
3
5
7
9
11
 */

public class Week4_24_2_SkipEvenNumbers {
    public static void main(String[] args) {

        skipEvenNumbers(1, 11);
    }

    public static void skipEvenNumbers(int start, int end) {

        for (int i = start; i <= end; i++) {

            if (i % 2 == 0) {
                continue;
            }

            System.out.println(i);
        }
    }
}
