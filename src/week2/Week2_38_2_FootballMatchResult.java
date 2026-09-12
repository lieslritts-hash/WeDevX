package week2;

import java.util.Scanner;

/*
2.38.3 Football Match Result*
easy
|
30 min
|
Share
Write a Java program that prompts the user to enter the score of a football match and prints out the result based on the scores. If the score is tied, the program should print It's a draw. If one team has scored more goals than the other, the program should print the name of the winning team - team X won. If the scores are not valid (e.g., negative or non-numeric), the program should print Invalid score.

Expected Output: Test 1: 3 2

plain
Copy code
Enter the score of the match for team 1:
Enter the score of the match for team 2:
team 1 won
Test 2: 3 4

plain
Copy code
Enter the score of the match for team 1:
Enter the score of the match for team 2:
team 2 won
Test 3: 4 4

plain
Copy code
Enter the score of the match for team 1:
Enter the score of the match for team 2:
It's a draw
Test 4: -2 -1

plain
Copy code
Enter the score of the match for team 1:
Enter the score of the match for team 2:
Invalid score
 */

public class Week2_38_2_FootballMatchResult {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the score of the match for team 1:");
        int team1Score = sc.nextInt();

        System.out.println("Enter the score of the match for team 2:");
        int team2Score = sc.nextInt();

        if (team1Score < 0 || team2Score <0) {
            System.out.println("Invalid score");
        } else if (team1Score > team2Score) {
            System.out.println("team 1 won");
        } else if (team1Score < team2Score) {
            System.out.println("team 2 won");
        } else {
            System.out.println("It's a draw");
        }
    }
}
