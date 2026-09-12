package week2;

import java.util.Scanner;

/*
2.11.2 Police 👮‍♀️ Software*
easy
|
30 min
|
Share
A red Ferrari 488 with plate number 123LA has 10 unpaid
speeding tickets. Write a program that will help the police
to identify the driver based on the plate number. Ask the user
to enter the plate number, then compare the entered plate number
to 123LA and print out the following message: Expected Output:

plain
Copy code
Please enter your plate number:
We will have to tow your car: X
Where X is a boolean value.
 */

public class Week2_11_2_PoliceSoftware {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your plate number:");
        String plateNum = input.nextLine();

        boolean matchesPlateNum = plateNum.equals("123LA");

        System.out.println("We will have to tow your car: " + matchesPlateNum);
    }
}
