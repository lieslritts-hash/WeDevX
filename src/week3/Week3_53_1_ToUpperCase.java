package week3;

/*
3.53.1 To Upper Case*
easy
|
30 min
|
Share
Task: Write a static method called convertToUpperCase() that reads a sentence from the user and converts all letters to uppercase. Param: The input to the method is a string representing a sentence. Return: The method's output is a string representing the uppercase version of the input sentence. Output:

plain
Copy code
convertToUpperCase("Hello, World!") // Output: "HELLO, WORLD!"
convertToUpperCase("Java is fun") // Output: "JAVA IS FUN"
convertToUpperCase("1 2 3 GO!") // Output: "1 2 3 GO!"
 */
//write your static method here. No need to add Main class or main method.

public class Week3_53_1_ToUpperCase {
    public static void main(String[] args) {

        System.out.println(convertToUpperCase("Hello, World!"));
        System.out.println(convertToUpperCase("Java is fun"));
        System.out.println(convertToUpperCase("1 2 3 GO!"));

    }

    public static String convertToUpperCase(String str) {
        return str.toUpperCase();
    }

}
