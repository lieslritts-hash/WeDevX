package week5;

/*
5.11.2 Count Words in Array
easy
|
30 min
|
Share
Create a static method named countWordsInArray() that takes a
String[] as a parameter. The method should count and return the
total number of words in the entire array, including cases where
array elements consist of multiple words or single words. Return 0
if an array is empty. The definition of a word should be based on
space-separated substrings. Words can be surrounded by spaces or
directly connected to punctuation marks.

Example #1:
Parameters:

plain
Copy code
String[] arr = ["Hello, world!", "This is an example."]
Return: int Output:

plain
Copy code
6
Example #2:
Parameters:

plain
Copy code
String[] arr = ["Hello", "World!", "Let's Do It"]
Return: int Output:

plain
Copy code
5
Example #3:
Parameters:

plain
Copy code
String[] arr = []
Return: int Output:

plain
Copy code
0
Example of Solution
java
Copy code
public static int countWordsInArray(String[] array) {
    int wordCount = 0;
    for (String sentence : array) {
        int counter;
        if (sentence.equals("")) {
            counter = 0;
        } else {
            counter = 1;
            for (int i = 0; i < sentence.length(); i++) {
                if (sentence.charAt(i) == ' ') {
                    counter++;
                }
            }
            wordCount += counter;
        }

    }
    return wordCount;
}
 */
//write your static method here. No need to add Main class or main method or import anything


public class Week5_11_2_CountWordsInArray {
    public static void main(String[] args) {

        String[] arr = {"Hello, world!", "This is an example."};
        System.out.println(countWordsInArray(arr));

    }

    public static int countWordsInArray(String[] arr) {
        int wordCount = 0;

        for (int i = 0; i < arr.length; i++) {
            String str = arr[i];

            if (!str.equals("")) {
                wordCount++;

                for (int x = 0; x < str.length(); x++) {
                    if (str.charAt(x) == ' ') {
                        wordCount++;
                    }
                }
            }
        }

        return wordCount;
    }
}