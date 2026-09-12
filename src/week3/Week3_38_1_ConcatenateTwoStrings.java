package week3;

/*
3.38.1 Concatenate two Strings*
easy
|
30 min
|
Share
Description: Concatenation is the process of joining two or more strings together to form a single string. Your task is to write a method that will take in two input strings, concatenate them together, and then return the resulting concatenated string. Params:

Two strings: The strings that you want to concatenate.
Return type:

A string: The concatenated string.
Task: Your task is to write a static method called concatenateStrings() that will take in two input strings, concatenate them together, and then return the resulting concatenated string. Expected Output:

plain
Copy code
concatenateStrings("Hello", "World"); // "HelloWorld"
concatenateStrings("Java", "Programming"); // "JavaProgramming"
concatenateStrings("Goodbye", "Cruel World"); // "GoodbyeCruel World"
 */
//write your static method here. No need to add Main class or main method.

public class Week3_38_1_ConcatenateTwoStrings {
    public static void main(String[] args) {
       String concatenated1 = concatenateStrings("Hello", "World");
       System.out.println(concatenated1);

        String concatenated2 = concatenateStrings("Java", "Programming");
        System.out.println(concatenated2);

        String concatenated3 = concatenateStrings("Goodbye", "Cruel World");
        System.out.println(concatenated3);

    }
    public static String concatenateStrings(String string1, String string2) {
           return string1 + string2;
        }

}

