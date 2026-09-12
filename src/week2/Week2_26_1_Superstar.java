package week2;

import java.util.Scanner;

/*
2.26.1 Superstar*
easy
|
30 min
|
Share
Write a program that asks the user to input an integer number, and it prints out Superstar only if the number is greater than 42. if the number is 42 or less nothing should be printed out. Must have variable

plain
Copy code
___ num = ___;
Expected output:

plain
Copy code
Please enter an int num:
Superstar
OR

plain
Copy code
Please enter an int num:

 */

public class Week2_26_1_Superstar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        System.out.println("Please enter an int num:");

        if(num > 42) {
            System.out.println("Superstar");
        }
    }
}
