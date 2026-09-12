package week4;

/*
4.8.2 Calculate the sum of the first 10 even numbers*
easy
|
30 min
|
Share
Description: The program will use a while loop to calculate the sum of the first 10 even numbers, where each even number is obtained by adding 2 to the previous even number. Inputs: There are no inputs required for this program. Output: The program will output the sum of the first 10 even numbers. Sample Output:

plain
Copy code
Sum so far: 2
Sum so far: 6
Sum so far: 12
Sum so far: 20
Sum so far: 30
Sum so far: 42
Sum so far: 56
Sum so far: 72
Sum so far: 90
Sum so far: 110
Sum of first 10 even numbers: 110
 */

public class Week4_8_2_CalculateTheSumOfTheFirst10EvenNumbers {
    public static void main(String[] args) {

        int counter = 1;
        int evenNumber = 0;
        int sum = 0;

        while (counter <= 10) {
            evenNumber += 2;
            sum += evenNumber;
            System.out.println("Sum so far: " + sum);
            counter ++;
        }

        System.out.println("Sum of first 10 even numbers: " + sum);

    }
}
