package week2;
import java.util.Scanner;

/*
2.1.5 Your Fav Quote and author*
easy
|
30 min
|
Share
Write a program that asks the user to enter their favorite
quote and the author of the quote, then prints out the
following message:

plain
Copy code
What is your favorite quote?
Who is the author?
"X" - Y
Where X is the quote and Y is the author. Note: use escape
characters to include double quotes
 */

public class Week2_1_5_YourFavQuoteAndAuthor {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.println("What is your favorite quote?");
        String quote = input.nextLine();

        System.out.println("Who is the author?");
        String author = input.nextLine();

        System.out.println("\"" + quote + "\" - " + author);
    }
}
