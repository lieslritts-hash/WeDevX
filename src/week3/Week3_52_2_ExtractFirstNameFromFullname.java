package week3;

/*
3.52.2 Extract First Name from Fullname*
easy
|
30 min
|
Share
Write a static method called extractFirstName() to extract the first name from a full name, you can write a method that takes a string representing the full name as input and returns a string representing the first name. Params:

A string representing the full name (e.g. "John Doe")
Return:

A string representing the first name (e.g. "John")
Examples of using the method with different inputs:

plain
Copy code
extractFirstName("John Doe") // Output: "John"
extractFirstName("Jane Smith Johnson") // Output: "Jane"
extractFirstName("William Henry Gates III") // Output: "William
 */
//write your static method here. No need to add Main class or main method.

public class Week3_52_2_ExtractFirstNameFromFullname {
    public static void main(String[] args) {

        System.out.println(extractFirstName("John Doe")); //Output: "John"
        System.out.println(extractFirstName("Jane Smith Johnson")); //Output: "Jane"
        System.out.println(extractFirstName("William Henry Gates III")); //Output: "William"
    }

    public static String extractFirstName(String fullName) {
        int spaceIndex = fullName.indexOf(" ");
        return fullName.substring(0, spaceIndex);
    }
}
