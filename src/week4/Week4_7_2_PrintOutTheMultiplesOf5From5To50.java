package week4;

/*
4.7.2 Print out the multiples of 5 from 5 to 50*
easy
|
30 min
|
Share
Write a program that prints out the multiples of 5 from 5 to 50 using a while loop where the increment is 5 at each iteration. Inputs: No input is needed for this program. Output: The program should output the multiples of 5 from 5 to 50, with each multiple on a separate line. Expected Output:

plain
Copy code
5
10
15
20
25
30
35
40
45
50
 */

public class Week4_7_2_PrintOutTheMultiplesOf5From5To50 {
    public static void main(String[] args) {

        int counter = 5;

        while (counter <= 50) {
            System.out.println(counter);
            counter+=5;
        }
    }
}
