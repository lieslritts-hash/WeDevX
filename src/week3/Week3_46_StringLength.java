package week3;

/*
3.46 String length()
String length() method returns the number of characters in a string.
 */
//write your static method here. No need to add Main class or main method.

//int length(); Returns the number of characters in the String.
//ex: "DevXSchool".length(); returns 10
//Char charAt(int i): Returns the character at the ith index.
//"DevXSchool".charAt(3);//returns 'X'
//String substring(int i): Returns the substring from the ith index.
//"DevXSchool".substring(3);//returns "XSchool"
//String substring(int i, int j): Returns the substring from i to j-1 index.
//"DevXSchool".substring(2, 5);//returns "vXS"
//String concat(String str): Concatenates specified string to the end of a string.
//String s1 = "DevX";
//String s2 = "School";
//String output = s1.concat(s2);
//returns "DevXSchool"

public class Week3_46_StringLength {
    public static void main(String[] args) {

        String str = "Devx";
        //returns an int value
        int strLength = str.length();//4
        System.out.println(strLength);

        String str2 = "Hello wedevx";
        int str2Length = str2.length();//12
        System.out.println(str2Length);

        String str3 = "Hello wedevx superstar, let's keep building our bright future together!";
        int str3Length = str3.length();//
        System.out.println(str3Length);

        //charAt() -> an index.start counting from 0
        //length - return the number of characters. start counting from 1.
        char w = str2.charAt(6);
        System.out.println(w);

        char lastChar = str3.charAt(str3.length()-1);
        System.out.println(lastChar);

        String str4 = "Elon Musk invested $300m into SpaceX and he almost failed at it";
        char lastChar4 =  str4.charAt(str4.length()-1);
        System.out.println(lastChar4);
    }
}
