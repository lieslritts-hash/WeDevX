package week4;

import java.util.Scanner;

/*
4.23.2 Printing Prime Numbers*
easy
|
30 min
|
Share
Write a program that prints out all prime numbers from 1 to N (including), using a while loop. The program should take an input from user as int and use a continue statement to skip printing out composite numbers. A prime number is a natural number that has exactly two distinct natural divisors - one and itself.

Example of input:
plain
Copy code
30
Example of output:
plain
Copy code
2
3
5
7
11
13
17
19
23
29
Example of the code
java
Copy code
import java.util.Scanner;
public class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int number = sc.nextInt();
    int i = 2;
    while (i <= number) {
      boolean isPrime = true;
      for (int j = 2; j < i; j++) {
        if (i % j == 0) {
          isPrime = false;
          break;
        }
      }
      if (isPrime) {
        System.out.println(i);
      } else {
        i++;
        continue;
      }
      i++;
    }
  }
}

 */

public class Week4_23_2_PrintingPrimeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number:");
        int number = sc.nextInt();

        int i = 2;

        while (i <= number) {
            boolean isPrime = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(i);
            } else {
                i++;
                continue;
            }
            i++;
        }
    }
}
