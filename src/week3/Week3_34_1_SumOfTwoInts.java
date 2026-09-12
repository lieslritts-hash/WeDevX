package week3;

/*
3.34.1 Sum of two ints*
easy
|
30 min
|
Share
Create a static method called addNumbers() that takes two int numbers as params, adds them together, and prints out the result. You can do it! Expected Result: param 1: 20 param 2: 30

plain
Copy code
50
Note: No need to add a Main class and a main method, it's created in the backend.

 */

public class Week3_34_1_SumOfTwoInts {
    static void main(String[] args) {
        addNumbers(20, 30);
    }

    public static void addNumbers(int num1, int num2) {
        System.out.println(num1 + num2);
    }
}
