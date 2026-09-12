package week4;

/*
4.31.1 Number and word pattern*
easy
|
30 min
|
Share
Description: Create a method called stringNumberPattern() that takes two parameters - a positive integer "n" and a string "pattern". The method should print a pattern of numbers and the given string, where each line contains a number from 1 to n followed by the string repeated that number of times. Params:

A positive integer "n" represents the limit of the pattern.

A string "pattern" to be repeated.

Return: None. The method should print the pattern to the console. For example, if n is 4 and the pattern is "hello":

Input: 4 hello Output:

plain
Copy code
1 hello
2 hello hello
3 hello hello hello
4 hello hello hello hello
Input: 5 world Output:

plain
Copy code
1 world
2 world world
3 world world world
4 world world world world
5 world world world world world
 */

public class Week4_31_1_NumberAndWordPattern {
    public static void main(String[] args) {

        stringNumberPattern(4, "hello");
        stringNumberPattern(5, "world");

    }

    public static void stringNumberPattern(int n, String pattern) {

        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");

            for (int x = 1; x <= i; x++) {
                System.out.print(pattern + " ");
            }

            System.out.println();
        }
    }
}
