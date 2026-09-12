package week3;

/*
3.43.2 Combine Full Name*
easy
|
30 min
|
Share
Create a static method named combineNames() that takes two parameters: firstName and lastName, both of type String. The method should use the String concat() method to combine these names with a space in between and return the full name as a single String**.** Return Type: String

Example:
Parameters:

plain
Copy code
String firstName = "John"
String lastName = "Doe"
Return:

plain
Copy code
John Doe
 */
//write your static method here. No need to add Main class or main method.

public class Week3_43_2_CombineFullName {
    public static void main(String[] args) {
        String str1 = "John";
        String str2 = "Doe";
        String finalString = combineNames(str1, str2);
        System.out.println(finalString);
    }

    public static String combineNames(String str1, String str2) {
        return str1.concat(" ").concat(str2);
    }

}
