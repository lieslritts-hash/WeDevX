package week3;

/*
3.53 String toLowerCase() and toUpperCase()
 */
//write your static method here. No need to add Main class or main method.

//String toLowerCase(): Converts all the characters in the String to lowercase
//String word1 = "Hello";
//String word3 = word1.toLowerCase(); //returns "hello"

//String toUpperCase(): Converts all the characters in the String to upper case
//String word1 = "Hello";
//String word2 = word1.toUpperCase(); //returns "Hello"


public class Week3_53_StringToLowerCaseAndToUpperCase {
    public static void main(String[] args) {

        String str = "wedevx.co";
        String str2 = str.toUpperCase();
        System.out.println(str2);

        String str3 = "Spring Rolls";
        String str4 = str3.toLowerCase();
        System.out.print(str4);

    }

}
