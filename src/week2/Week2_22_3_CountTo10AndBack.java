package week2;

/*
2.22.3 Count to 10 and Back*
easy
|
30 min
|
Share
Create a Java program that sequentially counts from 0 to 5
and then back to 0. Utilize only post-increment and post-decrement
operators.


Example of output:
plain
Copy code
0
1
2
3
4
5
4
3
2
1
0
 */

public class Week2_22_3_CountTo10AndBack {
    public static void main(String args[]) {

        int num = 0;
        System.out.println(num);

        num++;
        System.out.println(num);

        num++;
        System.out.println(num);

        num++;
        System.out.println(num);

        num++;
        System.out.println(num);

        num++;
        System.out.println(num);

        num--;
        System.out.println(num);

        num--;
        System.out.println(num);

        num--;
        System.out.println(num);

        num--;
        System.out.println(num);

        num--;
        System.out.println(num);
    }
}
