package week4;

/*
4.38.1 Remove practice*
easy
|
30 min
|
Share
Description: Write a method called removeSubstrings() that takes two strings as input, and removes all occurrences of the second string from the first string using a StringBuilder. The method should return the resulting string. Params: Two strings. Return: A string with all occurrences of the second string removed from the first string.

Call a method: removeSubstrings("this is a test string", "test"); Return: "this is a string"

Call a method: removeSubstrings("another example", "e"); Return: "anothr xampl"
 */
//write your static method here. No need to add Main class or main method.

public class Week4_38_1_RemovePractice {
    public static void main(String[] args) {

        System.out.println(removeSubstrings("this is a test string", "test"));
        System.out.println(removeSubstrings("another example", "e"));

    }

  public static String removeSubstrings(String str1, String str2) {

        StringBuilder sb = new StringBuilder(str1);

        int index = sb.indexOf(str2);

        while (index != -1) {

            sb.delete(index, index + str2.length());

            index = sb.indexOf(str2);
        }

        return sb.toString();
  }
}
