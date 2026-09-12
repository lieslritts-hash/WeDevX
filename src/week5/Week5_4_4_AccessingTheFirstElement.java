package week5;

/*
5.4.4 Accessing the First Element
easy
|
30 min
|
Share
Write a printFirstElement() method that returns the first element if it's positive or returns 0 if it's negative. Parameters: int[] array: The array to access. Example of parameters:

plain
Copy code
array = {1, 2, 3, 4, 5}
Example of return:

plain
Copy code
1
Example of parameters:

plain
Copy code
array = {-5, 10, 6, 9, 3}
Example of return:

plain
Copy code
0
 */
//write your static method here. No need to add Main class or main method.


public class Week5_4_4_AccessingTheFirstElement {
    public static void main(String[] args) {

        System.out.println(printFirstElement(new int[]{1, 2, 3, 4, 5}));
        System.out.println(printFirstElement(new int[]{-5, 10, 6, 9, 3}));

    }

    public static int printFirstElement(int[] array) {

        if (array[0] > 0) {
            return array[0];
        } else {
            return 0;
        }
    }
}
