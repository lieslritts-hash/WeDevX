package week3;

/*
3.54 String trim()
 */
//write your static method here. No need to add Main class or main method.

//String trim(); Returns the copy of the String by removing whitespaces at both ends.
//it does not affect whitespaces in the middle
//String word1 = "Learn Share Learn  ";
//String word2 = word1.trim(); //returns "Learn Share Learn'

public class Week3_54_StringTrim {
    public static void main(String[] args) {

        String str = "   Hello Superstar";
        String str2 = str.trim();
        System.out.println(str2);

        String str3 = "   Mars SpaceX  ";
        String str4 = str3.trim();
        System.out.println(str4);
    }
}
