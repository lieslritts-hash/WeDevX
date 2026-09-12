package week3;

/*
3.39.1 Compare 3 Integers*
easy
|
30 min
|
Share
Description: Your task is to write a static method called compareIntegers() that will take in three integers as params, compare them, and return a character based on their values. If the sum of first two integers are greater than the value of third integer, the method should return 'P'. If the third integer is greater than the sum of the first two, the method should return 'N'. If neither of these conditions are true, the method should return 'E'. Params:

Three integers: The integers that you want to compare.
Return type:

A character: 'P', 'N', or 'E', based on the comparison of the input integers.
Task: Your task is to write a static method called compareIntegers() that will take in three input integers, compare them, and return a character based on their values. Expected Result:

plain
Copy code
compareIntegers(1, 2, 3); // 'E'
compareIntegers(10, 20, 15); // 'P'
compareIntegers(5, 7, 12); // 'E'
compareIntegers(3, 3, 6); // 'E
compareIntegers(2, 2, 40); // 'N'
 */
//write your static method here. No need to add Main class or main method.

public class Week3_39_1_Compare3Integers {
    public static void main(String[] args) {
        char comparison = compareIntegers(1,2,3);
        System.out.println(comparison);

        char comparison2 = compareIntegers(10, 20, 15);
        System.out.println(comparison2);

        char comparison3 = compareIntegers(5, 7, 12);
        System.out.println(comparison3);

        char comparison4 = compareIntegers(3, 3, 6);
        System.out.println(comparison4);

        char comparison5 = compareIntegers(2, 2, 40);
        System.out.println(comparison5);

    }
    public static char compareIntegers(int num1, int num2, int num3) {

        if (num1 + num2 > num3) {
            return 'P';
        } else if (num1 + num2 < num3) {
            return 'N';
        } else {
            return 'E';
        }

    }

}
