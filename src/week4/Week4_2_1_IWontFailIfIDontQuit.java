package week4;

/*
4.2.1 I won't fail if I don't quit*
easy
|
30 min
|
Share
Task: Write a Java program that uses a while loop to print out the string "I won't fail if I don't quit. With consistency, I will earn my dream life!" seven times. Input: None. Output: Prints the string I won't fail if I don't quit. With consistency, I will earn my dream life! seven times.

plain
Copy code
I won't fail if I don't quit. With consistency, I will earn my dream life!
I won't fail if I don't quit. With consistency, I will earn my dream life!
I won't fail if I don't quit. With consistency, I will earn my dream life!
I won't fail if I don't quit. With consistency, I will earn my dream life!
I won't fail if I don't quit. With consistency, I will earn my dream life!
I won't fail if I don't quit. With consistency, I will earn my dream life!
I won't fail if I don't quit. With consistency, I will earn my dream life!
 */

public class Week4_2_1_IWontFailIfIDontQuit {
    public static void main(String[] args) {

        int counter = 1;
        while (counter <= 7) {
            System.out.println("I won't fail if I don't quit. With consistency, I will earn my dream life!");
            counter++;
        }
    }
}
