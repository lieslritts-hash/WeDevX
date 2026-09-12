package week1;

/*
1.32 %d Format Specifier
Understand the use of the %d format specifier in Java for
formatting decimal values, including how to use it with the
printf method, placeholders, and more, in this comprehensive
%d Format Specifier tutorial.

Important note: Almost all of our exercises expect you to use
"System.out.println()", so use "print" or "printf" only when
the requirements ask for it, otherwise exercise will be
considered as wrong.
 */

public class Week1_32_dFormatSpecifier {
    public static void main(String[] args) {
        int lengthOfBrick = 20;
        int heigthOfBrick = 10;
        int lengthOfWall = 300;
        int heightOfWall = 200;

        int numBricksToBuildWall = (lengthOfWall * heightOfWall) / (lengthOfBrick * heigthOfBrick);

        System.out.printf("The number of bricks needed to build the wall is: %,d", numBricksToBuildWall);
    }
}

