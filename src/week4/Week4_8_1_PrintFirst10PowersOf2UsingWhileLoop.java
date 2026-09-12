package week4;

/*
4.8.1 Print First 10 Powers of 2 using While Loop*
easy
|
30 min
|
Share
Description: Write a program that prints out the first 10 powers of 2 using a while loop where the increment is 1 at each iteration. Inputs: None Output: The program should output the first 10 powers of 2 in separate lines. Task: The program should use a while loop to print out the first 10 powers of 2. It should start with 2^1 and go up to 2^10. The increment for each iteration of the while loop should be 1. Expected output:

plain
Copy code
2
4
8
16
32
64
128
256
512
1024
Hint - Power Of
In this program, we need to use a while loop with an increment of 1 at each iteration to calculate and print the first 10 powers of 2. We start with 2^1 and continue multiplying by 2 for each subsequent value. The loop continues until n reaches 10, and each result is printed on a separate line.

2^1 = 2 * 1

2^2 = 2 * 2

2^3 = 2 * 2 * 2

...
 */

public class Week4_8_1_PrintFirst10PowersOf2UsingWhileLoop {
    public static void main(String[] args) {

        int counter = 1;
        int result = 1;

        while (counter <= 10) {
            result = result *2;
            System.out.println(result);
            counter ++;
        }
    }
}
