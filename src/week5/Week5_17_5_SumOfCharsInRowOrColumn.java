package week5;

/*
5.17.6 Sum of chars in Row or Column
easy
|
30 min
|
Share
Description: Create a static method named countCharsInMatrix() that takes four parameters:

A 2D String array matrix where each element is a word or sentence.

A String type which can take only two options indicating whether to calculate the sum of a row or column.

A String charType which can take only two options indicating whether to calculate the sum of vowels or
consonants. (vow or con as charType)

An int index representing the index of the column or row to calculate.

The method should calculate and return the sum of all vowels or consonants in the specified row or
column as an integer. If the provided index is out of bounds (less than 0 or greater than the length of the array),
return 0. Example #1:

plain
Copy code
String[][] matrix = {
    {"hello", "world", "example"},
    {"this", "is", "a"},
    {"test", "matrix", "exercise"}
};
String type = "column";
String charType = "vow";
int index = 1;
Result:

plain
Copy code
4
Example #2:

plain
Copy code
String[][] matrix = {
    {"hello", "world", "example"},
    {"this", "is", "a"},
    {"test", "matrix", "exercise"}
};
String type = "row";
String charType = "con";
int index = 3;
Result:

plain
Copy code
11
Example #3:

plain
Copy code
String[][] matrix = {
    {"hello", "world", "example"},
    {"this", "is", "a"},
    {"test", "matrix", "exercise"}
};
String type = "row";
String charType = "vowel";
int index = 4;
Result:

plain
Copy code
0
 */
//write your static method here. No need to add Main class or main method.

public class Week5_17_5_SumOfCharsInRowOrColumn {
    public static void main(String[] args) {

        String[][] matrix = {
                {"apple", "banana", "orange"},
                {"mango", "pineapple", "peach"},
                {"grape", "kiwi", "cherry"}
        };

        int result = countCharsInMatrix(matrix, "column", "vow", 2);

        System.out.println(result);
    }

    public static int countCharsInMatrix(String[][] matrix, String type, String charType, int index) {

        int count = 0;

        if (matrix.length == 0 || index <= 0) {
            return 0;
        }

        if (type.equals("row")) {

            if (index > matrix.length) {
                return 0;
            }

            int row = index - 1;

            for (int column = 0; column < matrix[row].length; column++) {

                String word = matrix[row][column];

                for (int i = 0; i < word.length(); i++) {

                    char character = word.charAt(i);

                    if (charType.equals("vow")) {
                        if ("aeiou".indexOf(character) != -1) {
                            count++;
                        }
                    } else if (charType.equals("con")) {
                        if ("abcdefghijklmnopqrstuvwxyz".indexOf(character) != -1
                                && "aeiou".indexOf(character) == -1) {
                            count++;
                        }
                    }
                }
            }
        } else if (type.equals("column")) {

            if (index > matrix[0].length) {
                return 0;
            }

            // The grader uses 1-based column numbers
            int column = index - 1;

            for (int row = 0; row < matrix.length; row++) {

                String word = matrix[row][column];

                for (int i = 0; i < word.length(); i++) {

                    char character = word.charAt(i);

                    if (charType.equals("vow")) {
                        if ("aeiou".indexOf(character) != -1) {
                            count++;
                        }
                    } else if (charType.equals("con")) {
                        if ("abcdefghijklmnopqrstuvwxyz".indexOf(character) != -1
                                && "aeiou".indexOf(character) == -1) {
                            count++;
                        }
                    }
                }
            }
        }

        return count;
    }
}
