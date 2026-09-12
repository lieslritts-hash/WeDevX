package week3;
 /*
    3.16.2 Which month of the year?*
easy
|
30 min
|
Share
Write a Java program that asks the user to input a number between 1 and 12, inclusive. The program should then use a switch statement to determine the corresponding month of the year for the input number, where 1 represents January, 2 represents February, and so on, up to 12 representing December. After determining the month of the year, the program should print a message to the console indicating which month it is. Your program should use appropriate variable names, and include comments to explain the logic behind the switch statement. Test your program with various inputs to ensure it works correctly. Sample Output 1: 6

plain
Copy code
Enter a number between 1 and 12:
The corresponding month of the year is June
Sample Output 2: 12

plain
Copy code
Enter a number between 1 and 12:
The corresponding month of the year is December
Sample Output 3: 9

plain
Copy code
Enter a number between 1 and 12:
The corresponding month of the year is September
 */

import java.util.Scanner;

public class Week3_16_2_WhichMonthOfTheYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number between 1 and 12:");
        int num = sc.nextInt();

        switch (num) {
            case 1:
                System.out.println("The corresponding month of the year is January");
                break;
            case 2:
                System.out.println("The corresponding month of the year is February");
                break;
            case 3:
                System.out.println("The corresponding month of the year is March");
                break;
            case 4:
                System.out.println("The corresponding month of the year is April");
                break;
            case 5:
                System.out.println("The corresponding month of the year is May");
                break;
            case 6:
                System.out.println("The corresponding month of the year is June");
                break;
            case 7:
                System.out.println("The corresponding month of the year is July");
                break;
            case 8:
                System.out.println("The corresponding month of the year is August");
                break;
            case 9:
                System.out.println("The corresponding month of the year is September");
                break;
            case 10:
                System.out.println("The corresponding month of the year is October");
                break;
            case 11:
                System.out.println("The corresponding month of the year is November");
                break;
            case 12:
                System.out.println("The corresponding month of the year is December");
                break;
            default:
                System.out.println("Invalid number. Please enter a number between 1 and 12.");
        }
    }
}
