package week4;

/*
4.3.4 Odd or Even Number Printer
easy
|
30 min
|
Share
Create a Java program that prints all the even or odd numbers up to
that input, depending on the parameter. Implement a static method named
printOddOrEvenNumbers() that takes 2 parameters: an int and a char ('O' for
odd or 'E' for even) to determine which type of numbers to print. The program
should utilize a while loop to iterate through the numbers and print the selected type.

Example:
Parameters:

plain
Copy code
printOddOrEvenNumbers(10, 'E')
Return: void Output:

plain
Copy code
2
4
6
8
10
 */

public class Week4_3_3_OddOrEvenNumberPrinter {
    public static void main(String[] args) {

        printOddOrEvenNumbers(10, 'E');

    }

    public static void printOddOrEvenNumbers(int number, char evenOrOdd) {
        int counter = 1;

        while (counter <= number) {

        if (evenOrOdd == 'E' && counter % 2 == 0) {
            System.out.println(counter);
        } else if (evenOrOdd == 'O' && counter %2 !=0) {
            System.out.println(counter);
        }

        counter++;
        }
    }
}
