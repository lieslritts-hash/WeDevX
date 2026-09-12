package week4;

/*
4.29.1 Simple Nested While Loop*
easy
|
30 min
|
Share
Create a static method named repeatString() that takes two parameters: a String and an int. This method repeats the given string multiple times, where each line contains the string repeated based on the line number. Use a nested while loop to print each repetition on a new line.

Return Type: void

Example:
Parameter:

plain
Copy code
String str = "Hello"
int repeatTimes = 3
Output:

plain
Copy code
1. Hello
2. HelloHello
3. HelloHelloHello
 */

public class Week4_29_1_SimpleNestedWhileLoop {
    public static void main(String[] args) {

        repeatString("Hello", 3);

    }

    public static void repeatString(String str, int number) {

        int counter1 = 1;

        while (counter1 <= number) {

            System.out.print(counter1 + ". ");

            int counter2 = 1;

            while (counter2 <= counter1) {
                System.out.print(str);
                counter2++;
            }

            System.out.println();
            counter1++;
        }
    }
}
