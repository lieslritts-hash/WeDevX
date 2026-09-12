package week4;

/*
4.4.2 Print numbers from 13 to 5*
easy
|
30 min
|
Share
Description: Write a Java program that prints numbers from 13 to 5 using a while loop. The program should output the numbers from 13 to 5, each on a new line.

Expected output:

plain
Copy code
13
12
11
10
9
8
7
6
5
 */

public class Week4_4_2_PrintNumbersFrom13To5 {
    public static void main(String[] args) {

        int counter = 13;
        while (counter >= 5) {
            System.out.println(counter);
            counter--;
        }
    }
}
