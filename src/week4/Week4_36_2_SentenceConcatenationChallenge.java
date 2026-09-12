package week4;

/*
4.36.2 Sentence Concatenation Challenge*
easy
|
30 min
|
Share
Create a program using the Scanner class in Java to take two separate sentences as input from the user. Concatenate these sentences into a single sentence using StringBuilder. Print the resulting combined sentence.

Example:
Input:

plain
Copy code
The quick brown
 fox jumps over the lazy dog
Output:
plain
Copy code
The quick brown fox jumps over the lazy dog
 */

import java.util.Scanner;

public class Week4_36_2_SentenceConcatenationChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstString = scanner.nextLine();
        String secondString = scanner.nextLine();

        StringBuilder singleSentence = new StringBuilder(firstString);
        singleSentence.append(secondString);

        System.out.println(singleSentence);

        scanner.close();
    }
}
