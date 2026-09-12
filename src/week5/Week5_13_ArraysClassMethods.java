package week5;

/*
5.13 Arrays Class Methods
1. Overview
Hello superstars! Welcome back to another session! In this session, we gonna cover Arrays methods.

2. Arrays.copyOf() method
This method copies the specified array from a given array and return into a new array. Syntax:

plain
Copy code
copyOf(int[] original, int newLength)
original – original array

newLength – copy of an original array

Example 1

java
Copy code
public static void main(String[] args) {

    int[] nums = {12,56,11,45,47};
    int[] newArr = Arrays.copyOf(nums, 3);
    System.out.println(Arrays.toString(newArr));

    String[] fruits = {"banana", "pineapple", "lemon", "kiwi"};
    String[] newArr1 = Arrays.copyOf(fruits, 2);
    System.out.println(Arrays.toString(newArr1));
}
plain
Copy code
Output is:
[12, 56, 11]
[banana, pineapple]
##### 3\. Arrays.fill() method
This method assigns the specified data type value to each element of the specified range of the specified array.

plain
Copy code
Syntax:
// Makes all elements of a[] equal to "val"
public static void fill(int[] a, int val)
Example 2

java
Copy code
public static void main(String[] args) {

    int[] nums = new int[5];                          // default value is 0
    Arrays.fill(nums, 10);
    System.out.println(Arrays.toString(nums));        // fill all values to 10

}
plain
Copy code
Output is:
[10, 10, 10, 10, 10]
##### 4\. Arrays.equals() method
The Java Arrays equals(int[] a, int[] a2) method returns true if the two specified arrays of ints are equal to one another. Two arrays are equal if they contain the same elements in the same order. Two array references are considered equal if both are null.

Declaration
Following is the declaration for java.util.Arrays.equals() method

plain
Copy code
public static boolean equals(int[] a, int[] a2)
Parameters
a − This is the array to be tested for equality.

a2 − This is the other array to be tested for equality.

Return Value
This method returns true if the two arrays are equal, else false Example 3

java
Copy code
public static void main(String[] args) {

    int[] nums1 = {8,11,9,45,2};
    int[] nums2 = {8,11,9,45,2};
    boolean areEquals = Arrays.equals(nums1,nums2);
    System.out.println(areEquals);

    int[] nums3 = {8,11,19,45,2};
    int[] nums4 = {8,11,9,45,2};
    boolean areEquals1 = Arrays.equals(nums3,nums4);
    System.out.println(areEquals1);

}
plain
Copy code
Output is:
true
false
##### 5\. Arrays.sort() method
Arrays.sort() method sorts an array in ascending order Syntax:

public static void sort(int[] a)
Example 4

java
Copy code
public static void main(String[] args) {

    int[] nums = {8,11,9,45,2};
    Arrays.sort(nums);
    System.out.println(Arrays.toString(nums));

    String[] fruits = {"banana", "pineapple", "lemon", "kiwi"};
    Arrays.sort(fruits);
    System.out.println(Arrays.toString(fruits));

}
plain
Copy code
Output is:
[2, 8, 9, 11, 45]
[banana, kiwi, lemon, pineapple]
##### **Conclusion**
I hope today's class was helpful. See you guys in the next class! Keep working hard!
 */
//write your static method here. No need to add Main class or main method or import anything

import java.util.Arrays;

public class Week5_13_ArraysClassMethods {
    public static void main(String[] args) {
        int[] nums = {12, 56, 11, 1,245};
        int[] nums2 = Arrays.copyOf(nums, 3);
        System.out.println(Arrays.toString(nums2));

        String[] fruits = {"banana", "apple", "pineapple", "watermelon"};
        String[] copyFruits = Arrays.copyOf(fruits, 2);
        System.out.println(Arrays.toString(copyFruits));

        //sort
        int[] numbers = {5, 3, 8, 1, 2};
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers)); // {1, 2, 3, 5, 8}

        Arrays.sort(fruits);
        System.out.println(Arrays.toString(fruits));

        //fill
        int[] numbers2 = new int[5];
        Arrays.fill(numbers2, 10);
        System.out.println(Arrays.toString(numbers2)); // {10, 10, 10, 10, 10}

        int[] numbers4 = {1, 2, 3, 4, 5};
        int[] numbers5 = {1, 2, 3, 4, 5};
        boolean areEqual = Arrays.equals(numbers4, numbers5);
        System.out.println(areEqual); // true

        String[] strArr1 = {"hello", "superstar"};
        String[] strArr2 = {"hello", "superstar"};
        boolean isEqual = Arrays.equals(strArr1, strArr2);
        System.out.println(isEqual); // true

    }
}
