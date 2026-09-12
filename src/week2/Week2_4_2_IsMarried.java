package week2;

import java.util.Scanner;

/*
x2.4.2 Is Married?*
easy
|
30 min
|
Share
Write a program that asks the user to enter a boolean value for are you married question. Then print out the following message:

plain
Copy code
Are you married?
X
Where X is a user-entered boolean value.
 */

public class Week2_4_2_IsMarried {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Are you married?");
        boolean married = input.nextBoolean();
        System.out.println(married);
    }
}
