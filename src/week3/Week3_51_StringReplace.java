package week3;

/*
3.51 String replace()
 */
//write your static method here. No need to add Main class or main method.

//String replace (char oldChar, char newChar): returns new string by replacing all
//occurrences of oldChar with newChar.

//String replace(char oldChar, char neChar)
//replaces all occurrences of old char to new char
//and returns a new string

//String replaceFirst(String  old, String new);
//it only replaces the first occurrence

public class Week3_51_StringReplace {
    public static void main(String[] args) {

        String str = "Hello WeDevXEr!";
        String str2= str.replace('e', 'w');
        System.out.println(str2);

        String str5 = "Silicon Valley";
        String str6 = str5.replace('l', 'o');
        System.out.println(str6);

        String str7 = "Hello World, DevX, WeDevX";
        String str8 = str7.replaceFirst("DevX", "WeDevX");
                System.out.println(str8);
    }
}
