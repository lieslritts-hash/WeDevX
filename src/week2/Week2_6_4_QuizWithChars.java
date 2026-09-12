package week2;

import java.util.Scanner;

/*
2.6.4 Quiz with Chars
easy
|
30 min
|
Share
Write a program that uses a Scanner object to read char answers from the user. The program should print the user's answer.

Example of result:
python
Copy code
Question 1: What is the capital of France?
A. Paris
B. London
C. Rome
Enter your answer:
A

Question 2: What is the square root of 16?
A. 2
B. 4
C. 8
Enter your answer:
B

Question 3: What is the correct syntax to output "Hello World"
in Java?
A. print("Hello World");
B. Console.WriteLine("Hello World");
C. System.out.println("Hello World");
Enter your answer:
C
Hint
Use escape characters to print out double quotes
 */

public class Week2_6_4_QuizWithChars {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.println("Question 1: What is the capital of France?\nA. Paris\nB. London\nC. Rome\nEnter your answer:");
        char answer1 = input.nextLine().charAt(0);
        System.out.println(answer1);

        System.out.println("\nQuestion 2: What is the square root of 16?\nA. 2\nB. 4\nC. 8\nEnter your answer:");
        char answer2 = input.nextLine().charAt(0);
        System.out.println(answer2);

        System.out.println("\nQuestion 3: What is the correct syntax to output \"Hello World\" in Java?\nA. print(\"Hello World\");\nB. Console.WriteLine(\"Hello World\");\nC. System.out.println(\"Hello World\");\nEnter your answer:");
        char answer3 = input.nextLine().charAt(0);
        System.out.println(answer3);
    }
}
