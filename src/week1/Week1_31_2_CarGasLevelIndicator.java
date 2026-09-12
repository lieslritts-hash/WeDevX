package week1;

/*
1.31.2 Car Gas Level Indicator*
easy
|
30 min
|
Share
Let's build a program that describes the Car Gas Level Indicator. Expected Output

plain
Copy code
E - means an empty tank
H - means a half tank
F - means a full tank
Write a program that prints out the above by using the
 %c format specifier to print out E, H, F, and %s to print
 out descriptions.

plain
Copy code
___ e = ____;
___ h = ____;
___ f = ____;

//prinf() statement for e
//prinf() statement for h
//prinf() statement for f
 */

public class Week1_31_2_CarGasLevelIndicator {
    public static void main(String[] args) {
        char e = 'E';
        char h = 'H';
        char f = 'F';

        System.out.printf("%c - means an empty tank\n", e);
        System.out.printf("%c - means a half tank\n", h);
        System.out.printf("%c - means a full tank", f);
    }
}

