package week4;

/*
4.39.4 Replacing All Spaces with Hyphens and Converting to Lower Case*
easy
|
30 min
|
Share
Write a method convertString() that replaces all spaces in a string with
hyphens and converts all letters to lowercase. Parameters: String input:
The input string. Return: String: The output string Example of parameters:

plain
Copy code
input = "This is a test string"
Example of return:

plain
Copy code
this-is-a-test-string
Example of the code
java
Copy code
static String convertString(String str) {
    StringBuilder sb = new StringBuilder(str);
    for (int i = 0; i < sb.length(); i++) {
        if (sb.charAt(i) == ' ') {
            sb.replace(i, i + 1, "-");
        }
    }
    return sb.toString().toLowerCase();
}
 */
//write your static method here. No need to add Main class or main method.


public class Week4_39_2_ReplacingAllSpacesWithHyphensAndConvertingToLowerCase {
    public static void main(String[] args) {

        System.out.println(convertString("This is a test string"));

    }

    public static String convertString(String str) {

        StringBuilder sb = new StringBuilder(str);

        for (int i = 0; i < sb.length(); i++) {

            if (sb.charAt(i) == ' ') {
                sb.replace(i, i + 1, "-");
            }
        }
        return sb.toString().toLowerCase();
    }
}