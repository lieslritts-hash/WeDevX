package week4;

/*
4.1.1 Enjoy the learning process*
easy
|
30 min
|
Share
Write a Java program that uses a while loop to print the message "Enjoy the learning process" 10 times. The program should use the while loop to iterate the desired number of times. Example:

plain
Copy code
Enjoy the learning process
Enjoy the learning process
Enjoy the learning process
Enjoy the learning process
Enjoy the learning process
Enjoy the learning process
Enjoy the learning process
Enjoy the learning process
Enjoy the learning process
Enjoy the learning process
 */

public class Week4_1_1_EnjoyTheLearningProcess {
    public static void main(String[] args) {

        int num = 1;
        while (num <= 10) {
            System.out.println("Enjoy the learning process");
            num++;
        }
    }
}
