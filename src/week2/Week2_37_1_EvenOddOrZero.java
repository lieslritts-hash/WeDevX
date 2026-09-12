package week2;

import java.util.Scanner;

/*
2.37.1 Even, Odd or Zero*
easy
|
30 min
|
Share
Write a program that prompts the user to enter a number and checks whether it is even, odd, or zero. Print relevant messages as shown in the examples below.

Example #1:
Input:

java
Copy code
int number = 0
Output:

plain
Copy code
Enter a number:
The number is zero.
Example #2:
Input:

java
Copy code
int number = 7
Output:

plain
Copy code
Enter a number:
The number is odd.
Example #3:
Input:

java
Copy code
int number = 10
Output:

plain
Copy code
Enter a number:
The number is even.
 */

public class Week2_37_1_EvenOddOrZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int number = sc.nextInt();

        if (number == 0) {
            System.out.println("The number is zero.");
        } else if (number % 2 != 0) {
            System.out.println("The number is odd.");
        } else {
            System.out.println("The number is even.");
        }
    }
}
