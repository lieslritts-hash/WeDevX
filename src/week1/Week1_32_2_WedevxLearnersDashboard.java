package week1;

/*
1.32.2 wedevx learner's dashboard*
easy
|
30 min
|
Share
Write a program that will print out the following
using printf() and %d format specifier.

plain
Copy code
Week 2 Lecture 6 Completed Exercises 34
Week 3 Lecture 9 Completed Exercises 28
Week 4 Lecture 13 Completed Exercises 15
 */

public class Week1_32_2_WedevxLearnersDashboard {
    public static void main(String[] args) {
        byte week2 = 2;
        byte week3 = 3;
        byte week4 = 4;

        byte lecture6 = 6;
        byte lecture9 = 9;
        byte lecture13 = 13;

        byte exercises34 = 34;
        byte exercises28 = 28;
        byte exercises15 = 15;

        System.out.printf(
                "Week %d Lecture %d Completed Exercises %d\n" +
                        "Week %d Lecture %d Completed Exercises %d\n" +
                        "Week %d Lecture %d Completed Exercises %d",
                week2, lecture6, exercises34,
                week3, lecture9, exercises28,
                week4, lecture13, exercises15
        );
    }
}

