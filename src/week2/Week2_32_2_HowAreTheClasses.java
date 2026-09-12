package week2;

import java.util.Scanner;

/*
2.32.2 How are the classes?*
easy
|
30 min
|
Share
Write a java program that asks the user, "Are classes ready? true/false" if the user answers true then print out "Don't get relaxed, get ready for the next challenges" otherwise**: "Don't give up! You will succeed as long as you don't quit"** Required Variable:

plain
Copy code
___ isEasy = ____;
Expected Result 1:

plain
Copy code
Are classes ready? true/false
Don't get relaxed, get ready for the next challenges
Expected Result 2:

plain
Copy code
Are classes ready? true/false
Don't give up! You will succeed as long as you don't quit
 */

public class Week2_32_2_HowAreTheClasses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Are classes ready? true/false");
        boolean isEasy = sc.nextBoolean();

        if (isEasy) {
            System.out.println("Don't get relaxed, get ready for the next challenges");
        }   else {
            System.out.println("Don't give up! You will succeed as long as you don't quit");
        }
    }
}