package week4;

/*
4.40.1 Reverse word order (with solution)
easy
|
30 min
|
Share
Write a method called reverseWords() that takes a string as input and reverses the order of the words in the string, then reverses the order of the whole string (look at examples). Here are the conditions for the method:

The input string may contain any number of words separated by one space.

The output string should have the same number of spaces as the input string, but with the words reversed.

You should use the reverse() method of StringBuilder to reverse the string in the end of program. Params: String Return: A String where words and word order is reversed.

Examples:
plain
Copy code
hello world -> world hello -> olleh dlrow // return last
plain
Copy code
This is a test -> test a is This -> sihT si a tset
Solution:
https://youtu.be/mzotypxk-cY
 */
//write your static method here. No need to add Main class or main method.


public class Week4_40_1_ReverseWordOrderWithSolution {
    public static void main(String[] args) {

       System.out.println(reverseWords("hello world"));
       System.out.println(reverseWords("This is a test"));

    }

    public static String reverseWords(String str) {

        StringBuilder sb = new StringBuilder(str);
        StringBuilder result = new StringBuilder();

        int end = sb.length();

        for (int i = sb.length() - 1; i >= 0; i--) {

            if (sb.charAt(i) == ' ') {

                for (int j = i + 1; j < end; j++) {
                    result.append(sb.charAt(j));
                }

                result.append(" ");

                end = i;
            }
        }

        for (int j = 0; j < end; j++) {
            result.append(sb.charAt(j));
        }

        result.reverse();

        return result.toString();
    }
}