package week5;

/*
5.17 2D Arrays. How To Access Values
1. Overview
Hello superstars! Welcome back to another session! In this session, we gonna practice multi- dimensional arrays.

2.Multi-dimensional array example
In below example, we will create 3D arrays and will print out them. Also, we will access an element in the arrays and reinitilize they values. To print out multi-dimensional arrays we will use Arrays.deepToString() method. This is image illustration of how to access an element in the multi-dimensional arrays multiDimensionalArray.png Example 1

java
Copy code
public static void main(String[] args) {

    int[][] arr2D = new int[3][2];
    System.out.println(Arrays.deepToString(arr2D));

    // Output is:
    // [[0, 0], [0, 0], [0, 0]]

    // We can access the element in the array and change the value

    arr2D[0][0] = 77;
    System.out.println(Arrays.deepToString(arr2D));

    arr2D[1][0] = 55;
    System.out.println(Arrays.deepToString(arr2D));

    arr2D[2][0] = 18;
    System.out.println(Arrays.deepToString(arr2D));

    arr2D[1][1] = 15;
    System.out.println(Arrays.deepToString(arr2D));
}
plain
Copy code
Output is:
[[0, 0], [0, 0], [0, 0]]
[[77, 0], [0, 0], [0, 0]]
[[77, 0], [55, 0], [0, 0]]
[[77, 0], [55, 0], [18, 0]]
[[77, 0], [55, 15], [18, 0]]
- ##### **3\. Conclusion**
plain
Copy code
I hope today's class was helpful. See you guys in the next class! Keep working hard!
 */
//write your static method here. No need to add Main class or main method.

import java.util.Arrays;

public class Week5_17_TwoDArraysHowToAccessValues {
    public static void main(String[] args) {
        int[][] arr2d = new int[3][2];

        System.out.println(Arrays.deepToString(arr2d));

        arr2d[0][0] = 42;
        System.out.println(Arrays.deepToString(arr2d));

        arr2d[1][0] = 77;
        System.out.println(Arrays.deepToString(arr2d));

        arr2d[1][1] = 44;
        System.out.println(Arrays.deepToString(arr2d));

        arr2d[2][1] = 55;
        System.out.println(Arrays.deepToString(arr2d));

    }
}
