package week4;

/*
4.2.2 I have a dream at Apple*
easy
|
30 min
|
Share
Create a program that uses a while loop to print out the strings I have a dream... and to become a tech lead at Apple in separate lines five times each, and each loop output should be separated with an empty line. Each time the strings are printed, they should be on separate lines. Here's an example of what the output should look like:

plain
Copy code
I have a dream...
to become a tech lead at Apple

I have a dream...
to become a tech lead at Apple

I have a dream...
to become a tech lead at Apple

I have a dream...
to become a tech lead at Apple

I have a dream...
to become a tech lead at Apple
 */

public class Week4_2_2_IHaveADreamAtApple {
    public static void main(String[] args) {

        int counter = 1;
        while (counter <= 5) {
            System.out.println("I have a dream... \n" +
                    "to become a tech lead at Apple\n");
            counter++;
        }
    }
}
