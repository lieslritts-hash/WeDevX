package week4;

/*
4.28.1 Simple nested for loop*
easy
|
30 min
|
Share
Description: Write a simple nested for loop which would print such
pattern: Output:

plain
Copy code
a12345b12345c12345
: use first for loop to go through string "abc", and second loop
to count from 1 to 5
 */
import java.util.Scanner;
public class Week4_28_1_SimpleNestedForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String letters = "abc";

        for (int i = 0; i < letters.length(); i++) {

            System.out.print(letters.charAt(i));

            for (int j = 1; j <= 5; j++) {
                System.out.print(j);
            }
        }
    }
}
