package week5;

/*
5.6.3 Number of chars in string*
easy
|
30 min
|
Share
Write a method called countChar() that takes a String array
and a char as parameters. The method should iterate through
each String element in the array and count the number of times
the given char appears in each string. It should return an integer
array with the length of the string array from the parameters
(int[stringArray.length]) with the count of the given char in each String element.

If the String array is empty return an array with values -1.
Example:
Return type: int[] Params:

plain
Copy code
String arr = {"hello", "world", "how", "are", "you"}
char ch = 'o'
Return:

plain
Copy code
{1, 1, 1, 0, 1}
: No input is needed for this exercise. Arrays are already created at the back.
 */
//write your static method here. No need to add Main class or main method.

import java.util.Arrays;
public class Week5_6_2_NumberOfCharsInString {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(
                countChar(new String[]{"hello", "world", "how", "are", "you"},'o')
        ));

    }

    public static int[] countChar(String[] array, char ch) {
        int[] result = new int[array.length];

      if (array.length == 0) {
          return new int[]{-1};
      }

          for (int i = 0; i < array.length; i++) {
              int count = 0;

              for (int j = 0; j < array[i].length(); j++) {
                  if (array[i].charAt(j) == ch) {
                      count++;
                  }
              }
              result[i] = count;
          }

      return result;
    }
}
