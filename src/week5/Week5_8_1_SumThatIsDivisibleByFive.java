package week5;

/*
5.8.1 Sum that is divisible by five*
easy
|
30 min
|
Share
Description: Write a method called isSumOfEvenDivisibleByFive()
that takes an array of integers as input and returns true if
the sum of all even numbers in the array is divisible by 5,
otherwise return false. Params: An array of integers.
Return: A boolean value representing whether the sum of all
even numbers in the array is divisible by 5.
Example: isSumOfEvenDivisibleByFive([1, 2, 3, 4, 5, 6]);
// Returns false, since the sum of even numbers (2 + 4 + 6)
is 12, which is NOT divisible by 5. isSumOfEvenDivisibleByFive([10, 20, 30, 40, 50]);
// Returns true (10 + 20 + 30 + 40 + 50) is 150, which is divisible by 5.
isSumOfEvenDivisibleByFive([0, 0, 0, 0, 0, 0]);
// Returns true isSumOfEvenDivisibleByFive([]);
// Returns false Note: If the array is empty, the method should return false.
 */
//write your static method here. No need to add Main class or main method.


public class Week5_8_1_SumThatIsDivisibleByFive {
    public static void main(String[] args) {

        System.out.println(isSumOfEvenDivisibleByFive(new int[]{1, 2, 3, 4, 5, 6}));
        System.out.println(isSumOfEvenDivisibleByFive(new int[]{10, 20, 30, 40, 50}));
        System.out.println(isSumOfEvenDivisibleByFive(new int[]{0, 0, 0, 0, 0, 0}));
        System.out.println(isSumOfEvenDivisibleByFive(new int[]{}));

    }

    public static boolean isSumOfEvenDivisibleByFive(int[] arr) {

        if (arr.length == 0) {
            return false;
        }

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                sum += arr[i];
            }
        }

        return sum % 5 == 0;
    }
}
