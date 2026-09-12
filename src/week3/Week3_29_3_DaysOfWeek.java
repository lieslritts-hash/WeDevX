package week3;

/*
3.29.3 Days of Week
easy
|
30 min
|
Share
Write a Java class called Main that contains an instance
method named getDate() that takes no parameters and
returns the March 7th as a string. In the main() method
of your program, create an instance of the Main class,
and call the getDayOfWeek() method to retrieve the current
day of the week. Then, print the result to the console
using a user-friendly message Expected Result:

plain
Copy code
March 7th
Hint #1
You need to return the string March 7th

Hint #2
Don't forget to create an instance of the Main class
inside the main method and call the required method
through it
 */

public class Week3_29_3_DaysOfWeek {
    public static void main(String[] args) {
        Week3_29_3_DaysOfWeek main = new Week3_29_3_DaysOfWeek();
        System.out.println(main.getDayOfWeek());
    }

    public String getDate() {
        return "March 7th";
    }

    public String getDayOfWeek() {
        return getDate();
    }

}
