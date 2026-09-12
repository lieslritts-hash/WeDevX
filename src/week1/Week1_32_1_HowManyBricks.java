package week1;

/*
1.32.1 How many bricks?*
easy
|
30 min
|
Share
Write a program that calculates the number of bricks needed to
build a wall, given the length and height of the wall. Assume t
hat each brick has a size of 20cm x 10cm. The program should
print the number of bricks needed using the %d format specifier.
Given the length of the wall in centimeters: 300 and the height
of the wall in centimeters: 200 How many bricks should I buy?
Expected Output:

plain
Copy code
The number of bricks needed to build the wall is: X
Where X is the number of bricks needed to build the wall.
Formula for X is: X = (length of wall * height of wall) /
(length of brick * height of brick) Calculate it as you
learned math operations in previous classes
 */

public class Week1_32_1_HowManyBricks {
    public static void main(String[] args) {
        int lengthOfBrick = 20;
        int heigthOfBrick = 10;
        int lengthOfWall = 300;
        int heightOfWall = 200;

        int numBricksToBuildWall = (lengthOfWall * heightOfWall) / (lengthOfBrick * heigthOfBrick);

        System.out.printf("The number of bricks needed to build the wall is: %,d", numBricksToBuildWall);
    }
}

