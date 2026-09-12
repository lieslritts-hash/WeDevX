package week4;

/*
4.10.3 Reverse Characters Order
easy
|
30 min
|
Share
Create a static method named reverseCharactersOrder() that takes a String as a parameter and prints the characters of the string in reverse order using a while loop, charAt() and System.out.print() methods. The program should iterate through the characters of the string in reverse order and print the string in reverse order.

Return type: void

Example:
Input:

plain
Copy code
Hello, World!
Output:

plain
Copy code
!dlroW ,olleH
 */

public class Week4_10_3_ReverseCharactersOrder {
    public static void main(String[] args) {

        reverseCharactersOrder("Hello, World!");
    }

    public static void reverseCharactersOrder(String str) {

        int index = str.length() - 1;

        while (index >= 0) {
            System.out.print(str.charAt(index));
            index--;
        }
    }
}
