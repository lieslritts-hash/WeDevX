package week3;

/*
3.43.1 Concat Two Strings*
easy
|
30 min
|
Share
Description: Your task is to write a static method called concatWithSpace() that takes in two input Strings and concatenates them with a space in between. For example, if the input Strings are "Hello" and "world", the method should return "Hello world". Params: Two Strings: The two Strings that need to be concatenated with a space in between. Return: A String: The resulting concatenated String with a space in between. Expected output:

plain
Copy code
concatWithSpace("Wedevx", "Superstar");//Wedevx Superstar
concatWithSpace("Let's", "Go");//Let's Go
concatWithSpace("To", "The Moon");//To The Moon
 */
//write your static method here. No need to add Main class or main method.

public class Week3_43_1_ConcatTwoStrings {
    public static void main(String[] args) {

        String str1 = "Wedevx";
        String str2 = "Superstar";
        String finalString = concatWithSpace(str1, str2);
        System.out.println(finalString);

        String str3 = "Let's";
        String str4 = "Go";
        String finalString2 = concatWithSpace(str3, str4);
        System.out.println(finalString2);

        String str5 = "To";
        String str6 = "The Moon";
        String finalString3 = concatWithSpace(str5, str6);
        System.out.println(finalString3);
    }

    public static String concatWithSpace(String str1, String str2) {
        return str1.concat(" ").concat(str2);
    }

}
