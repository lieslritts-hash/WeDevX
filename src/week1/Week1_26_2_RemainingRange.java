package week1;

/*
1.26.2 Remaining Range*
easy
|
30 min
|
Share
Hey Superstar, Awesome job on crashing this course so far.
To finish Class 2.8, you have 342 seconds. Oops, our program
is broken and instead of showing me minutes and seconds, it's
showing non-sense seconds. Write a program that converts 342
seconds into minutes and seconds.

plain
Copy code
___ totalSeconds = 342;
___ minutes = ____;
___ seconds = ____;
Expected Output:

plain
Copy code
Time remaining: X minutes Y seconds
where X is minutes and Y is seconds.
 */

public class Week1_26_2_RemainingRange {
    public static void main(String[] args) {
        int totalSeconds = 342;
        int minutes = totalSeconds/60;
        int seconds = totalSeconds%60;

        System.out.println("Time remaining: " + minutes + " minutes " + seconds + " seconds");
    }
}

