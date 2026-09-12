package week2;

/*
2.22.2 wedevx.co IPO Countdown*
easy
|
30 min
|
Share
Write a Java program that counts down the last 10 seconds
of wedevx.co IPO and celebrates the launch once the countdown
is complete.

plain
Copy code
___ seconds = ___;
Expected result:

plain
Copy code
Countdown: 10
Countdown: 9
Countdown: 8
Countdown: 7
Countdown: 6
Countdown: 5
Countdown: 4
Countdown: 3
Countdown: 2
Countdown: 1
Hooray! The IPO of wedevx.co is now live!
 */

public class Week2_22_2_WedevxcoIPOCountdown {
    public static void main(String args[]) {

        int seconds = 10;
        System.out.println("Countdown: " + seconds);

        --seconds;
        System.out.println("Countdown: " + seconds);

        --seconds;
        System.out.println("Countdown: " + seconds);

        --seconds;
        System.out.println("Countdown: " + seconds);

        --seconds;
        System.out.println("Countdown: " + seconds);

        --seconds;
        System.out.println("Countdown: " + seconds);

        --seconds;
        System.out.println("Countdown: " + seconds);

        --seconds;
        System.out.println("Countdown: " + seconds);

        --seconds;
        System.out.println("Countdown: " + seconds);

        --seconds;
        System.out.println("Countdown: " + seconds);

        System.out.println("Hooray! The IPO of wedevx.co is now live!");
    }
}
