package week4;

/*
4.7.1 Print Odd Numbers*
easy
|
30 min
|
Share
Description: Write a static method called printOddNumbers() that prints the first 10 odd numbers starting from 3 using a while loop where the increment is 2 at each iteration. Params: There are no inputs required for this program. Return: Void. The program will output the first 10 odd numbers starting from 3 in separate lines. Task: To complete this program, you will need to use a while loop that runs 10 times. The loop will start at 3 and increment by 2 at each iteration until it reaches the 10th odd number. During each iteration, the loop will print out the current odd number. Expected Output:

plain
Copy code
3
5
7
9
11
13
15
17
19
21
 */

public class Week4_7_1_PrintOddNumbers {
    public static void main(String[] args) {

        printOddNumbers();


    }

    public static void printOddNumbers() {

        int counter = 3;

        while (counter <= 21) {
            System.out.println(counter);
            counter+=2;
        }
    }
}
