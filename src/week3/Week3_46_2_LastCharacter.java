package week3;

/*
3.46.2 Last Character*
easy
|
30 min
|
Share
Description: Your task is to write a static method called getLastCharacter() that will take in a string as input, and then return the last character of the string using the charAt method in Java. if the string is empty the method should return '?'; if the String has only 1 char then return that char. Params: A string: The input string. Return: A char: The last character of the input string. Expected Output:

plain
Copy code
getLastCharacter("Superstar");//r
getLastCharacter("wedevx");//x
getLastCharacter("");//?
getLastCharacter("A");//A
 */
//write your static method here. No need to add Main class or main method.

public class Week3_46_2_LastCharacter {
    public static void main(String[] args) {

        System.out.println(getLastCharacter("Superstar"));//r
        System.out.println(getLastCharacter("wedevx"));//x
        System.out.println(getLastCharacter(""));//?
        System.out.println(getLastCharacter("A"));//A

    }

    public static char getLastCharacter(String characters) {
        if (characters.length() == 0) {
            return '?';
        }

        return characters.charAt(characters.length()-1);
    }

}
