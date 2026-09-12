package week3;

/*
3.52 String substring()
 */
//write your static method here. No need to add Main class or main method.

//String substring (int i): Return the substring from i to j-1 index.
//DevXSchool".substring(3);//returns "XSchool"

//substring(int i) -> cuts the String from the given index
//till the end

//StringIndexOutOfBoundsException
//String str7 = str5.substring(-2);
//System.out.println(str7);

//String substring (int, int j): Returns the substring from i to j-i index.
//DevXSchool".substring(2,5);//returns "vXS"

//String substring(int i, int j)
//cut the String from i to j

public class Week3_52_StringSubstring {
    public static void main(String[] args) {

        String str = "DevXSchool";
        String str2 = str.substring(3);
        System.out.println(str2);
        String str3 = str.substring(4);
        System.out.println(str3);

        String str5 = "Hello Java Superstars, Java is Hard, but it's fun!";
        String str6 = str5.substring(23);
        System.out.println(str6);

        String str7 = "hello my dear friend, it's a beautiful day today";
        String str8 = str7.substring(22, 38);
        System.out.println(str8);

        int lastIndexOfJava = str5.lastIndexOf("Java");
        int lastIndexOfComma = str5.lastIndexOf(",");
        String str10 = str5.substring(lastIndexOfJava, lastIndexOfComma);
        System.out.println(str10);
    }
}
