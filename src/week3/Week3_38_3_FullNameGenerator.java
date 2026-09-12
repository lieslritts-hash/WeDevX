package week3;

/*
3.38.4 Full Name Generator
easy
|
30 min
|
Share
Create a static method named generateFullName() that takes two parameters:
a String representing a person's first name and a String representing their
last name. The method should return the person's full name as a String in a
formatted manner, there is a space between the first and last names.

Example:
plain
Copy code
generateFullName("John", "Doe")
Return: String

plain
Copy code
John Doe
 */
//write your static method here. No need to add Main class or main method.

public class Week3_38_3_FullNameGenerator {
    public static void main(String[] args) {
        String name = generateFullName("John", "Doe");
        System.out.println(name);

    }
    public static String generateFullName(String firstName, String lastName ) {
        return firstName + " " + lastName;
    }

}
