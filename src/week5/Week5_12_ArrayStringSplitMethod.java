package week5;

/*
5.12.1 Remove duplicates Array
easy
|
30 min
|
Share
Write a method called removeDuplicatesFromString() that takes a String as parameter.
The method should split the input string into an array of Strings using spaces as delimiters.
It should then remove all occurrences of the word if it's repeated more than one time,
regardless of case, spaces at the beginning or at the end. Use String's trim() and
equalsIgnoreCase() methods, Array's length property, also use loops and implement as
much arrays as you need (look at example). Return Type: String[]

Example:
Parameters:

plain
Copy code
String inputString = "The quick brown fox jumps over the lazy
dog The lazy dog is quick"
Subresult:
plain
Copy code
...
String[] array = ["The", "quick", "brown", "fox", "jumps",
"over", "the", "lazy", "dog", "The", "lazy", "dog", "is",
"quick"];
String[] subResult = new String[array.length];
// initializing new array named subResult which have the same
length as array
int counter = 0; // initializing the counter which should
count each time when the word puts to the array
subResult = ["brown", "fox", "jumps", "over", "is", null,
null, null, null, null, null, null, null, null];
counter = 5;
String[] finalResult = new String[counter];
// initializing the string array with length of unique words
array without null values
...
Return:
plain
Copy code
["brown", "fox", "jumps", "over", "is"]
: If the input string is empty, return an empty array

Solution
java
Copy code
public static String[] removeDuplicatesFromString(String inputString) {
    String[] array = inputString.trim().split(" ");
    String[] result = new String[array.length];
    int index = 0;
    for (int i = 0; i < array.length; i++) {
        String word = array[i].trim();
        if (!word.isEmpty()) {
            int counter = 0;
            for (int j = 0; j < array.length; j++) {
                if (array[j].trim().equalsIgnoreCase(word)) {
                    counter++;
                    if (counter == 2) break;
                }
            }
            if (counter == 1) result[index++] = word;
        }
    }
    String[] finalResult = new String[index];
    for (int i = 0; i  < finalResult.length; i++) {
        finalResult[i] = result[i];
    }
    return finalResult;
}
 */
//write your static method here. No need to add Main class or main method.

import java.util.Arrays;

public class Week5_12_ArrayStringSplitMethod {
    public static void main(String[] args) {

        String fullname = "Elon Musk";
        //.split(String str); the param is the delimeter
        //where do I want to break the strings?

        String[] names = fullname.split(" "); //breaks the String into 2 strings
        System.out.println(Arrays.toString(names));

        //Name, Age, Gender
        //John, 25, Male
        //Mary, 30, Female
        String csv = "Name, Age, Gender\n" +
                     "John, 25, Male\n" +
                     "Mary, 30, Female\n";
        System.out.println(csv);

        //your task will be to find the age of John
        //what is regex and how to use?
        String[] arr = csv.split("[,\n]");
        System.out.println(Arrays.toString(arr));
        System.out.println(arr[4]);

        //print out the age of Mary
        for (int i = 3; i < arr.length; i+=3) {

            if (arr[i].equals("Mary")) {
                System.out.println(arr[i+1]);
            }
        }
    }
}
