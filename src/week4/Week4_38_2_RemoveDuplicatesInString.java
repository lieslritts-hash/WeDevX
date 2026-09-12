package week4;

/*
4.38.2 Remove duplicates in String
easy
|
30 min
|
Share
Write a method called removeDuplicates() that takes a String as parameter
 and removes all consecutive duplicate characters using a StringBuilder.
 The method should return the resulting String.

Return Type: String

Example #1:
Parameter:

java
Copy code
String str = "aaabbcdddefffg"
Return:

plain
Copy code
abcdefg
Example #2:
Parameter:

java
Copy code
String str = "122333444455555666666"
Return:

plain
Copy code
123456
Example #3:
Parameter:

java
Copy code
String str = "1112233311445"
Return:

plain
Copy code
123145
 */
//write your static method here. No need to add Main class or main method.

public class Week4_38_2_RemoveDuplicatesInString {
    public static void main(String[] args) {

        System.out.println(removeDuplicates("aaabbcdddefffg"));
        System.out.println(removeDuplicates("122333444455555666666"));
        System.out.println(removeDuplicates("1112233311445"));

    }

    public static String removeDuplicates(String str) {

        StringBuilder result = new StringBuilder(str);

        int i = 1;

        while (i < result.length()) {

            if (result.charAt(i) == result.charAt(i - 1)) {
                result.deleteCharAt(i);
            } else {
                i++;
            }
        }

        return result.toString();
    }
}
