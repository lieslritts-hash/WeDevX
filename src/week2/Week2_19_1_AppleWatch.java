package week2;

import java.util.Scanner;

/*
2.19.1 Apple Watch*
easy
|
30 min
|
Share
David ordered two Apple Watches online. He paid $149.45 each
and an additional $12.50 shipping fee for both watches. How much
was his total at check out? Write a program to solve this
question using compound assignment operators and print the
result to the console.

java
Copy code
____ price = ___;
  ____ shipping = ____;
  ____ price *= ____;
  ____ price += ____;
  System.out.println(price);
Expected Output:

plain
Copy code
311.4
 */

public class Week2_19_1_AppleWatch {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        double price = 149.45;
        double shipping = 12.50;
        price *= 2;
        price += shipping;
        System.out.println(price);
    }
}
