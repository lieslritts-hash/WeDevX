package week2;

import java.util.Scanner;

/*
2.1.1 Where are you from?
easy
|
30 min
|
Share
Write a program that asks the user to enter the country they are from using the Scanner class and prints out the following message:

plain
Copy code
Where are you from?
Im lucky to have a friend like you from X
Where X is the country the user inputs. Note: Countries can be more than 1 word, so use nextLine();
 */

public class Week2_1_1_WhereAreYouFrom {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Where are you from?");
        String country = input.nextLine();

        System.out.println("Im lucky to have a friend like you from " + country);

    }
}
