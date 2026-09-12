package week2;

/*
2.21.2 Print numbers from 5 to 1*
easy
|
30 min
|
Share
Write a program that prints the numbers from 1 to 5 using the decrement operator (--) and the System.out.println() method.

plain
Copy code
___ num = ___;
Expected Output:

plain
Copy code
5
4
3
2
1
 */

public class Week2_21_2_PrintNumbersFrom5To1 {
    public static void main(String args[]) {

        int num = 5;
        System.out.println(num);

        --num;
        System.out.println(num);

        --num;
        System.out.println(num);

        --num;
        System.out.println(num);

        --num;
        System.out.println(num);
    }
}

