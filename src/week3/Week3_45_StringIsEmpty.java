package week3;

/*
3.45 String isEmpty()
String isEmpty() checks if a given string is empty or not.
 */
//write your static method here. No need to add Main class or main method.

public class Week3_45_StringIsEmpty {
    public static void main(String[] args) {

        String str = "I love wedevx.co, it will take me to Mars!";

        //boolean isEmpty() -> the method returns true if the str is empty
        //in java we can have empty strings. Strings with no characters at all. not even a space.
        //if your String has a space then that's not empty any more

        String str2 = "";

        boolean isStrEmpty = str.isEmpty(); //false
        System.out.println(isStrEmpty);

        boolean isStr2Empty = str2.isEmpty(); //true
        System.out.println(isStr2Empty);
    }


}
