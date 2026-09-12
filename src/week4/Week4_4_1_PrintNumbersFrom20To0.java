package week4;

/*
4.4.1 Print numbers from 20 to 0*
easy
|
30 min
|
Share
Write a Java program that prints numbers from 20 to 0 using a while loop. The program should output the numbers from 20 to 0, each on a new line.

Expected output:

plain
Copy code
20
19
18
17
16
15
14
13
12
11
10
9
8
7
6
5
4
3
2
1
0
 */

public class Week4_4_1_PrintNumbersFrom20To0 {
    public static void main(String[] args) {

        int counter = 20;
        while (counter >= 0) {
            System.out.println(counter);
            counter--;
        }



    }
}
