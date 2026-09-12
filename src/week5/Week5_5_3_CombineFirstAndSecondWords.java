package week5;

/*
5.5.3 Combine first and second words*
easy
|
30 min
|
Share
Description: Write a method called combineWords() that takes a
String array and a positive int n as parameters. If the length
of the first word from the array is bigger than the length of the second,
repeat the first word n times and concatenate the second word at the end.
If the length of a second is bigger, repeat the second word n times and
concatenate the first word at the end. Return the final string.

If the length of words is equal, return "Both are equal".

If the n is negative return "N is not positive".

If array is empty return "Array is empty".

Params: A String array, positive int n. Return: The result string.
Example: combineWords(["First", "Second", "Third", "Fourth"], 4);
// Returns SecondSecondSecondSecondFirst combineWords(["NonEmpty", "Maybe", "For sure"], 0);
// Returns N is not positive combineWords(["Good", "Luck", "Beloved", "Champs"]);
// Returns Both are equal Note: No input is needed for this exercise. Arrays are already created at the back.
 */
//write your static method here. No need to add Main class or main method.

public class Week5_5_3_CombineFirstAndSecondWords {
    public static void main(String[] args) {

        System.out.println(combineWords(
                new String[]{"First", "Second", "Third", "Fourth"}, 4));

        System.out.println(combineWords(
                new String[]{"NonEmpty", "Maybe", "For sure"}, 0));

        System.out.println(combineWords(
                new String[]{"Good", "Luck", "Beloved", "Champs"}, 2));

        System.out.println(combineWords(
                new String[]{}, 3));
    }

    public static String combineWords(String[] words, int n) {

        if (words.length == 0) {
            return "Array is empty";
        }

        if (n <= 0) {
            return "N is not positive";
        }

        String first = words[0];
        String second = words[1];

        if (first.length() > second.length()) {

            String result = "";

            for (int i = 0; i < n; i++) {
                result += first;
            }

            return result + second;

        } else if (second.length() > first.length()) {

            String result = "";

            for (int i = 0; i < n; i++) {
                result += second;
            }

            return result + first;

        } else {

            return "Both are equal";
        }
    }
}