package week3;

/*
3.44.2 Is right email domain?*
easy
|
30 min
|
Share
Description: Your task is to write a static method called checkEmailDomain() that will take in an input String (the email address) and determine if it contains the domain "devxschool.com" or "wedevx.co" or "wedevx.com". The method should return a boolean value indicating whether or not the domain is present in the email address. Params: A String representing the email address to be checked. Return: A boolean value indicating whether or not the email address contains the domain "devxschool.com" or "wedevx.co" or "wedevx.com". Expected Output:

plain
Copy code
checkEmailDomain("alexa@amazon.com");//false
checkEmailDomain("siri@apple.com");//false
checkEmailDomain("google@gmail.com");//false
checkEmailDomain("askar@devxschool.com"); //true
checkEmailDomain("adina@wedevx.co");//true
checkEmailDomain("sean@wedevx.com");//true
 */
//write your static method here. No need to add Main class or main method.

public class Week3_44_2_IsRightEmailDomain {
    public static void main(String[] args) {
        String email1 = "alexa@amazon.com";
        boolean result1 = checkEmailDomain(email1);
        System.out.println(result1);

        String email2 = "siri@apple.com";
        boolean result2 = checkEmailDomain(email2);
        System.out.println(result2);

        String email3 = "google@gmail.com";
        boolean result3 = checkEmailDomain(email3);
        System.out.println(result3);

        String email4 = "askar@devxschool.com";
        boolean result4 = checkEmailDomain(email4);
        System.out.println(result4);

        String email5 = "adina@wedevx.co";
        boolean result5 = checkEmailDomain(email5);
        System.out.println(result5);

        String email6 = "sean@wedevx.com";
        boolean result6 = checkEmailDomain(email6);
        System.out.println(result6);

    }

    public static boolean checkEmailDomain(String email) {
        return email.contains("devxschool.com")
                || email.contains("wedevx.co")
                || email.contains("wedevx.com");
    }

}
