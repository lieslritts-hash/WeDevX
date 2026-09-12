package week1;

/*
1.19.5 Calendar
easy
|
30 min
|
Share
Write a program that will print out the following
by: 1. declaring a meetingName1 variable with Daily
Standup value 2. declaring a startTime1 variable with
9:15am value 3. declaring a endTime1 variable with
9:45am value. 4. declaring a meetingName2 variable
with Test Strategy Meeting value 5. declaring a
startTime2 variable with 2:15pm value 6. declaring a
endTime2 variable with 3:15pm value. Print out the
values of each variable in a new line.

plain
Copy code
Daily Standup Start time: 9:15am End time: 9:45am
Test Strategy Meeting Start time: 2:15pm End time: 3:15pm
use \t escape character to give spaces - 2 times after Daily
Standup, 1 time after Test Strategy Meeting, and 1 time after
Start time.
 */

public class Week1_19_5_Calendar {
    public static void main(String[] args) {
        String meetingName1 = "Daily Standup";
        String startTime1 = "9:15am";
        String endTime1 = "9:45am";

        String meetingName2 = "Test Strategy Meeting";
        String startTime2 = "2:15pm";
        String endTime2 = "3:15pm";

        System.out.println(meetingName1 + "\t\tStart time: " + startTime1 + "\tEnd time: " + endTime1);
        System.out.println(meetingName2 + "\tStart time: " + startTime2 + "\tEnd time: " + endTime2);
    }
}

