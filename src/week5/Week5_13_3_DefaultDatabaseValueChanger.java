package week5;

/*
5.13.3 Default Database Value Changer*
easy
|
30 min
|
Share
Create a static method named changeDefaultValues() that takes
two parameters: an int representing the length of the array and a
String indicating the default message pattern. The method should use
Arrays.fill() to generate and return a String array (String[]) of the
specified length, where each element contains the provided default message
pattern.

Return Type: String[]

Example:
Parameters:

plain
Copy code
int length = 5
String defaultValue = "Default"
Return:

plain
Copy code
["Default", "Default", "Default", "Default", "Default"]
 */
//write your static method here. No need to add Main class or main method or import anything

import java.util.Arrays;

public class Week5_13_3_DefaultDatabaseValueChanger {
    public static void main(String[] args) {

        int length = 5;
        String defaultValue = "Default";
        String[] result = changeDefaultValues(length, defaultValue);
        System.out.println(Arrays.toString(result));

    }

    public static String[] changeDefaultValues(int length, String defaultValue) {
        String[] result = new String[length];
        Arrays.fill(result, defaultValue);
        return result;
    }
}
