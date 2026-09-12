package week4;

/*
4.4.3 New Year*
easy
|
30 min
|
Share
The program counts down the last 10 seconds before a new year using a while loop. The program will output a Counting... message with a countdown from 10 to 1, and a Happy New Year! message displayed after the countdown ends.

Expected output:

plain
Copy code
Counting... 10
Counting... 9
Counting... 8
Counting... 7
Counting... 6
Counting... 5
Counting... 4
Counting... 3
Counting... 2
Counting... 1
Happy New Year!
 */

public class Week4_4_3_NewYear {
    public static void main(String[] args) {

        int counter = 10;
        while (counter >= 1) {
            System.out.println("Counting... " + counter);
            counter--;
        }

        System.out.println("Happy New Year!");
    }
}
