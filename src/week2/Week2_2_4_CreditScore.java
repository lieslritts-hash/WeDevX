package week2;

import java.util.Scanner;

/*
2.2.4 Credit Score
easy
|
30 min
|
Share
In the US the maximum credit score is 850 Write a program
that asks the user to enter their credit score, and the
program should calculate how many more points they need to
gain to reach perfect 850 score. Expected output:

plain
Copy code
Please enter your credit score:
You need X more points to reach 850
Where X is the result of 850 - Y Where Y is the entered credit score.


 */

public class Week2_2_4_CreditScore {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your credit score:");
        int creditScore = input.nextInt();

        int morePoints = 850 - creditScore;

        System.out.printf("You need %d more points to reach 850", morePoints);
    }
}

