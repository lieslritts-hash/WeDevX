package week1;

/*
In this video lecture, we will put our knowledge of primitive
data types to the test. We will work through various programming
exercises and examples to reinforce your understanding of the 8
primitive data types in Java programming language: boolean,
char, byte, short, int, long, float, and double. You will have
the opportunity to practice declaring and manipulating variables
of different data types.
 */

public class Week1_17_PrimitiveDataTypesPractice {
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

