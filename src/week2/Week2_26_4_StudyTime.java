package week2;

import java.util.Scanner;

/*
2.26.4 Study Time
easy
|
30 min
|
Share
Write a program that asks the user to enter What time is it?

If the user answers: study time

, then print out "WEDEVX WEDEVX WEDEVX!"

otherwise do nothing

Required Variables:

plain
Copy code
____ answer = _____;
Expected Result:

plain
Copy code
What time is it?
WEDEVX WEDEVX WEDEVX!
OR

plain
Copy code
What time is it?
 */
public class Week2_26_4_StudyTime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("What time is it?");
        String answer = sc.nextLine();

        if(answer.equals("study time")) {
            System.out.println("WEDEVX WEDEVX WEDEVX!");
        }
    }
}
