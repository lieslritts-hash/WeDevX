package week4;

/*
4.39.5 Case-Insensitive Replace
easy
|
30 min
|
Share
Create a static method named caseInsensitiveReplace() that takes three
parameters: a source text (String), a substring to find (String), and a
replacement substring (String). The method should perform a case-insensitive
replacement of the find substring with the replacement substring within the
source text. After all return the result String. Return Type: String

Example:
Parameters:

plain
Copy code
String source = "Hello, World"
String find = "hello"
String replaceWith = "hi"
Return String:

plain
Copy code
hi, World!
 */
//write your static method here. No need to add Main class or main method.

public class Week4_39_3_CaseInsensitiveReplace {
    public static void main(String[] args) {

        System.out.println(
                caseInsensitiveReplace("Hello, World", "hello", "hi")
        );

    }

    public static String caseInsensitiveReplace(
            String str1, String str2, String replacement) {

        StringBuilder sb = new StringBuilder(str1);

        int index = sb.toString().toLowerCase().indexOf(str2.toLowerCase());

        while (index != -1) {

            sb.replace(index, index + str2.length(), replacement);

            index = sb.toString().toLowerCase().indexOf(str2.toLowerCase());
        }

        return sb.toString();
    }
}
