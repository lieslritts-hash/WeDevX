package week2;

import java.util.Scanner;

/*
2.5.3 First Letter of a Word
easy
|
30 min
|
Share
Write a program that uses a Scanner object to read a
word from the user. The program should then print the
whole word and the first letter of the word.

Example #1:
plain
Copy code
Enter a word:
Hello
The first letter of the word is H
Example #2:
plain
Copy code
Enter a word:
World
The first letter of the word is W
Example #3:
plain
Copy code
Enter a word:
five
The first letter of the word is f
 */

public class Week2_5_3_FirstLetterOfAWord {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a word:");
        String word = sc.nextLine();

        System.out.println(word);

        char firstLetterWord = word.charAt(0);
        System.out.println("The first letter of the word is " + firstLetterWord);
    }
}

