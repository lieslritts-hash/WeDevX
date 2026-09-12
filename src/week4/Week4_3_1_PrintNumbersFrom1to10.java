package week4;

/*
4.3.1 Print numbers from 1 to 10*
easy
|
30 min
|
Share
Write a Java program that uses a while loop to count from 1 to 10 and prints the numbers to the console. Input: There is no input required for this program. Output: The program should print the numbers 1 through 10 to the console, each on a new line. Task: The task is to use a while loop to iterate through the numbers from 1 to 10 and print each number to the console. Example:

plain
Copy code
1
2
3
4
5
6
7
8
9
10
 */

public class Week4_3_1_PrintNumbersFrom1to10 {
    public static void main(String[] args) {

        int counter = 1;
        while (counter <= 10) {
            System.out.println(counter);
            counter++;
        }
    }
}
