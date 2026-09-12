package week2;

import java.util.Scanner;

/*
2.26.2 I have a dream*
easy
|
30 min
|
Share
Write a program that asks the user to input a double number, and it prints out I have a dream only if the number is less than 120.5. If the number is 120.5 or more - nothing should be printed out.

Must have variable

plain
Copy code
___ num = ___;
Example #1:
Input:

java
Copy code
double num = 150.5;
Output:

plain
Copy code
Please enter a double num:
I have a dream
Example #2:
Input:

java
Copy code
double num = 120.0;
Output:

plain
Copy code
Please enter a double num:

 */

public class Week2_26_2_IHaveADream {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter a double num:");
        double num = sc.nextDouble();

        if(num < 120.5){
            System.out.println("I have a dream");
        }
    }
}
