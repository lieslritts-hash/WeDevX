package week1;

/*
1.17.1 How many Seconds in a *? *
easy
|
30 min
|
Share
Write a program that declares the below variables
with the most suitable data types and assigns the
values in question. Then prints out the values of each variable.

For example:
java
Copy code
byte secondsInMinute = 60;
...
double secondsInMillisecond = 0.001;
System.out.println(secondsInMinute);
...
System.out.println(secondsInMillisecond);
Output:
plain
Copy code
60
...
0.001
Fill in the blanks for all of the following variables.

plain
Copy code
// how many seconds in one minute?
___ secondsInMinute = 60;

// how many seconds in one hour?
____ secondsInHour = 3600;

// how many seconds in one day?
____ secondsInDay = 86400;

// how many seconds in one week?
____ secondsInWeek = 604800;

// how many seconds in one month?
 ____ secondsInMonth = 2592000;

// how many seconds in one year?
 ____ secondsInYear = 31536000;

// how many seconds in one millisecond?
_____ secondsInMillisecond = 0.001;
 */

public class Week1_17_1_HowManySecondsInA {
    public static void main(String[] args) {
        byte secondsInMinute = 60;
        short secondsInHour = 3_600;
        int secondsInDay = 86_400;
        int secondsInWeek = 604_800;
        int secondsInMonth = 2_592_000;
        int secondsInYear = 31_536_000;
        double secondsInMillisecond = 0.001;

        System.out.println(secondsInMinute);
        System.out.println(secondsInHour);
        System.out.println(secondsInDay);
        System.out.println(secondsInWeek);
        System.out.println(secondsInMonth);
        System.out.println(secondsInYear);
        System.out.println(secondsInMillisecond);
    }
}
