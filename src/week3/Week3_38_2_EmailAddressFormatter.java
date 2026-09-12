package week3;

/*
3.38.3 Email Address Formatter
easy
|
30 min
|
Share
Create a static method named formatEmailAddress() that takes three
parameters: username (a String representing the username part of the email),
domain (a String representing the domain name part of the email), and extension
(a String representing the email extension, e.g., com). The method should return
a properly formatted email address as a String.

Example:
plain
Copy code
formatEmailAddress("johndoe", "example", "com")
Return: String

plain
Copy code
johndoe@example.com

 */
//write your static method here. No need to add Main class or main method.

public class Week3_38_2_EmailAddressFormatter {
    public static void main(String[] args) {
        String email = formatEmailAddress("john", "example", "com");
        System.out.println(email);

    }
    public static String formatEmailAddress(String username, String domain, String extension) {
        return username + "@" + domain + "." + extension;
    }

}
