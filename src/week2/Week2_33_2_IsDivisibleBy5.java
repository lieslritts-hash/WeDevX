package week2;

import java.util.Scanner;

/*
2.33.2 Is divisible by 5?*
easy
|
30 min
|
Share
Write a Java program that prompts the user to enter a number
and checks if it is divisible by 5 or not. If the number is
 divisible by 5, print "The number entered is divisible by 5".
 If the number is not divisible by 5, print "The number entered
 is not divisible by 5". Expected Result 1:

plain
Copy code
Enter a number:
The number entered is divisible by 5
Expected Result 2:

plain
Copy code
Enter a number:
The number entered is not divisible by 5
 */

public class Week2_33_2_IsDivisibleBy5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int number = sc.nextInt();

        if(number %5 == 0) {
            System.out.println("The number entered is divisible by 5");
        } else {
            System.out.println("The number entered is not divisible by 5");
        }
    }
}
