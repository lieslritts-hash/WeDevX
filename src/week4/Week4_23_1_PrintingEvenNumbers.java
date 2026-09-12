package week4;

/*
4.23.1 Printing Even Numbers*
easy
|
30 min
|
Share
Write a program that prints out all even numbers from 1 to N number, using a while loop. The program should take an input from user as int and use a continue statement to skip printing out odd numbers.

Example of input:
plain
Copy code
100
Example of output:
plain
Copy code
Enter the number:
2
4
6
8
10
12
...
100
Example of the code
java
Copy code
import java.util.Scanner;
public class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int number = sc.nextInt();
    int counter = 1;
    while (counter <= number) {
      if (counter % 2 != 0) {
        counter++;
        continue;
      }
      System.out.println(counter);
      counter++;
    }
  }
}
 */

import java.util.Scanner;

public class Week4_23_1_PrintingEvenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number:");
        int number = sc.nextInt();

        int counter = 1;

        while (counter <= number) {
            if (counter % 2 != 0) {
                counter++;
                continue;
            }
            System.out.println(counter);
            counter++;
        }
    }
}