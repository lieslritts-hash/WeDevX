package week4;

/*
4.22.1 Remainder is 3*
easy
|
30 min
|
Share
Create a method called findRemainder() that takes a positive integer as parameter and iterates from 1 to the given number, finding the first number where the remainder after dividing the given number by the current loop counter is 3. If no such number is found, the method should return 1. Params: A positive integer. Return: An integer representing the first number from 1 to the input integer where the division remainder is 3. If no such number is found, the method should return 1.

Return Type: int

Example #1:
Parameters:

plain
Copy code
int number = 10
Return:

plain
Copy code
7
Output (no need to print anything on your side):

plain
Copy code
The first number from 1 to 10 with remainder 3 after division is: 7
Example #2:
Parameters:

plain
Copy code
int number = 15
Return:

plain
Copy code
4
Output (no need to print anything on your side):

plain
Copy code
The first number from 1 to 15 with remainder 3 after division is: 4
Example #3:
Parameters:

plain
Copy code
int number = 17
Return:

plain
Copy code
7
Output (no need to print anything on your side):

plain
Copy code
The first number from 1 to 17 with remainder 3 after division is: 7
Example #3:
Parameters:

plain
Copy code
int number = 5
Return:

plain
Copy code
1
Output (no need to print anything on your side):

plain
Copy code
The first number from 1 to 5 with remainder 3 after division is: 1
: The method should handle the case where the input integer is negative by returning 1.
 */

public class Week4_22_1_RemainderIs3 {
    public static void main(String[] args) {

    }

    public static int findRemainder(int number) {

        if (number < 0) {
            return 1;
        }
        int counter = 1;
        int result = 1;

        while (counter <= number) {

            if (number % counter == 3) {
                result = counter;
                break;
            }

            counter++;

        }

        System.out.println("The first number from 1 to " + number + " with remainder 3 after division is: " + result);

        return result;
    }
}

