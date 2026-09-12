package week5;

/*
5.5.2 Check middle boolean*
easy
|
30 min
|
Share
Description: Write a method called checkMiddle() that takes a Boolean
array as a parameter. If the number of elements in the array is odd,
check the middle element. If the number of elements in the array is even,
check AND operator of two middle elements. If True return 1, if False return -1.
Params: A Boolean array. Return: 1 if True, -1 if False.
Example: checkMiddle([true, false, false, false, true, false]); // Returns -1 (false AND false)
checkMiddle([false, false, false, true, false, false, false]); // Returns 1 checkMiddle([false, true]);
// Returns -1 checkMiddle([]); // Returns -1 Note: No input is needed for this exercise.
Arrays are already created at the back.
 */
//write your static method here. No need to add Main class or main method.



public class Week5_5_2_CheckMiddleBoolean {
    public static void main(String[] args) {

        System.out.println(checkMiddle(
                new boolean[]{true, false, false, false, true, false}));

        System.out.println(checkMiddle(
                new boolean[]{false, false, false, true, false, false, false}));

        System.out.println(checkMiddle(
                new boolean[]{false, true}));

        System.out.println(checkMiddle(
                new boolean[]{}));
    }

    public static int checkMiddle(boolean[] input) {

        if (input.length == 0) {
            return -1;
        }

        if (input.length % 2 == 1) {

            int middle = input.length / 2;

            if (input[middle]) {
                return 1;
            } else {
                return -1;
            }

        } else {

            int middle1 = input.length / 2 - 1;
            int middle2 = input.length / 2;

            if (input[middle1] && input[middle2]) {
                return 1;
            } else {
                return -1;
            }
        }
    }
}