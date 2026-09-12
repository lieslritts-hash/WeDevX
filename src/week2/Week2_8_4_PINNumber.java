package week2;

import java.util.Scanner;

/*
2.8.4 PIN Number*
easy
|
30 min
|
Share
Write a program that asks the user to create a pin number
for their card and enter the number again. Compare two
numbers using !=. The program should print out the following:
Expected Output:

plain
Copy code
Please create a pin number:
Please repeat the pin number:
Pin Numbers do not match: X
Where X is a boolean value from the comparison.
 */

public class Week2_8_4_PINNumber {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please create a pin number:");
        int pinNum = input.nextInt();

        System.out.println("Please repeat the pin number:");
        int repeatPinNum = input.nextInt();

        boolean PinNumDontMatch = pinNum != repeatPinNum;

        System.out.printf("Pin Numbers do not match: %b", PinNumDontMatch);
    }
}
