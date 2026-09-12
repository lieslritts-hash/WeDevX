package week3;

/*
3.51.4 Text Highlighter
easy
|
30 min
|
Share
Create a Java program that implements a "Text Highlighter" tool. The program should take two inputs: a text as a String and a substring as a String to highlight. Implement a static method named highlightText() that searches for all occurrences of the specified word in the text document and encloses them in  HTML tags (e.g. some text).

Example:
Parameters:

plain
Copy code
String sentence = "Java is a versatile programming language. Java is widely used for web development."
String highlighting = "Java"
Return: String

plain
Copy code
<span>Java</span> is a versatile programming language. <span>Java</span> is widely used for web development.
 */
//write your static method here. No need to add Main class or main method.


public class Week3_51_4_TextHighlighter {
    public static void main(String[] args) {

        System.out.println(highlightText("Java is a versatile programming language. Java is widely used for web development.",
                "Java"
        ));
    }

    public static String highlightText(String str, String highLight) {
        return str.replace(highLight, "<span>" + highLight + "</span>");
    }
}
