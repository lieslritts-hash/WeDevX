package week2;

import java.util.Scanner;

/*
2.11.5 MacOs
easy
|
30 min
|
Share
macOS is a proprietary operating system developed by Apple Inc.
for use on its Mac computer systems only. macOS is not compatible
with Samsung, Dell, or any other computer hardware. Write a program
that asks the user to enter their computer hardware, compare the
entered input to Macbook then print the following message: Expected Output:

plain
Copy code
Please enter the brand of your computer hardware:
macOs is compatible with Y: X
Where Y is the user entered value and X is a boolean. if the
user entered Macbook then X should be true otherwise false.


 */

public class Week2_11_5_MacOs {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the brand of your computer hardware: ");
        String computerHardwareBrand = input.nextLine();

        boolean compatable = computerHardwareBrand.equals("Macbook");

        System.out.println("macOs is compatible with " + computerHardwareBrand + ": " + compatable);
    }
}
