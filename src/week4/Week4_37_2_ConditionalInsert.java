package week4;

/*
4.37.2 Conditional insert*
easy
|
30 min
|
Share
Description: Create a method called insertWords() that takes two parameters: a
string and a word. The method should return a new string where the word is inserted
after the first occurrence of the word "is" in the original string. If the word "is"
does not appear in the original string, the method should return the original string.
Params: A string and a word. Return: A new string where the word is inserted after the
first occurrence of the word "is" in the original string.

Call a method: insertWords("This is a test", "not "); Return: "This is not a test"

Call a method: insertWords("Hello world!", "not "); Return: "Hello world!"

Call a method: insertWords("is it true?", "really "); Return: "is really it true?"
Note: You don't need to print out New sentence is:
 */
//write your static method here. No need to add Main class or main method.

public class Week4_37_2_ConditionalInsert {
    public static void main(String[] args) {

        System.out.println(insertWords("This is a test", "not "));
        System.out.println(insertWords("Hello world!", "not "));
        System.out.println(insertWords("is it true?", "really "));

    }

    public static String insertWords(String str, String word) {

        int index = str.indexOf("is");

        if (index == -1) {
            return str;
        }

        StringBuilder sb = new StringBuilder(str);

        sb.insert(index + 2, " " + word);

        return sb.toString();
    }
}