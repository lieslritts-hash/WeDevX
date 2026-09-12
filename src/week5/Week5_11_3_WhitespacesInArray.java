package week5;

/*
5.11.3 Whitespaces in Array*
easy
|
30 min
|
Share
Create a static method named countWhitespaces() that takes a
String array (String[]) as a parameter. The method should count
and return the total number of whitespace characters ( ) present
across all the strings in the array.

Return Type: int

Example #1:
Parameters:

plain
Copy code
String[] strArr = ["Hello World", "This is a test", "Another example"]
Return:

plain
Copy code
5
Example #2:
Parameters:

plain
Copy code
String[] strArr = ["One", "Two", "Three"]
Return:

plain
Copy code
0
 */
//write your static method here. No need to add Main class or main method or import anything

public class Week5_11_3_WhitespacesInArray {
    public static void main(String[] args) {

        String[] strArr = {"Hello World", "This is a test", "Another example"};
        System.out.println(countWhitespaces(strArr));

        String[] strArr2 = {"One", "Two", "Three"};
        System.out.println(countWhitespaces(strArr2));

    }

    public static int countWhitespaces(String[] strArr) {

        int whitespaceCount = 0;

        for (int i = 0; i < strArr.length; i++) {
            String str = strArr[i];

            for (int x = 0; x < str.length(); x++) {
                if (str.charAt(x) == ' ') {
                    whitespaceCount++;
                }
            }
        }

        return whitespaceCount;
    }
}
