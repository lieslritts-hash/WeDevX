package week4;

/*
4.42.1 Max length of two sentences*
easy
|
30 min
|
Share
Exercise Description: Write a method called compareSentences() that takes
two String params. The method should retrieve the lengths of both inputs
and return the max among two. Params: String input1, String input2. Return:
Int Example:

plain
Copy code
String inp1 = "This is the first sentence with several words.";
String inp2 = "Short sentence";
compareSentences(inp1, inp2); // Returns 46, the length of first sentence
 */
//write your static method here. No need to add Main class or main method.

public class Week4_42_1_MaxLengthOfTwoSentences {
    public static void main(String[] args) {

        System.out.println(compareSentences(
                "This is the first sentence with several words.",
                "Short sentence"
        ));
    }

    public static int compareSentences(String inp1, String inp2) {


        return Math.max(inp1.length(), inp2.length());
    }
}
