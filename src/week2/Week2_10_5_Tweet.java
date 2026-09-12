package week2;

import java.util.Scanner;

/*
2.10.5 Tweet*
easy
|
30 min
|
Share
The maximum number of words allowed in a tweet on Twitter is
280 characters. Write a program that asks the user to enter
the number of words they want to tweet, then it compares them
using <= and prints out the following message: Expected Output:

plain
Copy code
Please enter the number of words you want to tweet:
Tweeted: X
Where X is true or false value.


 */

public class Week2_10_5_Tweet {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the number of words you want to tweet:");
        int desiredNumWords = input.nextInt();

        boolean ableToTweet = desiredNumWords <= 280;
        System.out.println("Tweeted: " + ableToTweet);
    }
}
