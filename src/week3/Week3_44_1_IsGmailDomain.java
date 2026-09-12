package week3;

/*
3.44.1 Is @gmail domain?*
easy
|
30 min
|
Share
Description: Your task is to write a static method called checkGmailDomain() that takes a String parameter (an email address) and checks if it contains the domain "@gmail.com". The method should return a boolean value - true if the email address contains the domain "@gmail.com", false otherwise. Params: A String: An email address. Return: A boolean value: true if the email address contains the domain "@gmail.com", false otherwise. Task: Your task is to write a static Java method called checkGmailDomain() that takes a String parameter (an email address) and checks if it contains the domain "@gmail.com". Expected Output:

plain
Copy code
checkGmailDomain("tcook@apple.com");//false
checkGmailDomain("askar@wedevx.co");//false
checkGmailDomain("adina@gmail.com");//true
 */
//write your static method here. No need to add Main class or main method.

public class Week3_44_1_IsGmailDomain {
    public static void main(String[] args) {
        String str1 = "tcook@apple.com";
        boolean email = checkGmailDomain(str1);
        System.out.println(email);

        String str2 = "askar@wedevx.co";
        boolean email2 = checkGmailDomain(str2);
        System.out.println(email2);

        String str3 = "adina@gmail.com";
        boolean email3 = checkGmailDomain(str3);
        System.out.println(email3);



    }
        public static boolean checkGmailDomain(String email) {
            return email.contains("@gmail.com");
    }

}
