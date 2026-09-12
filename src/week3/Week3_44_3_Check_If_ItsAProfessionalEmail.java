package week3;

/*
3.44.3 Check if it's a professional email
easy
|
30 min
|
Share
Description: Your task is to write a static method called isProfessionalEmail() that will take in an input String representing an email address, and then check if the email is a professional email or not. Professional emails are typically associated with a company or organization, and do not use free email services such as Gmail, Yahoo, Hotmail. Therefore, the method should return true if the email domain is a professional domain, and false if email is @gmail.com, @yahoo.com, @hotmail.com Params: A String representing an email address. Return: A boolean value indicating whether or not the email is a professional email. Expected Output:

plain
Copy code
isProfessionalEmail("john.doe@acme.com"); // true
isProfessionalEmail("jane.smith@gmail.com"); // false
isProfessionalEmail("bob.johnson@hotmail.com"); // false
 */
//write your static method here. No need to add Main class or main method.

public class Week3_44_3_Check_If_ItsAProfessionalEmail {
    public static void main(String[] args) {

       String email1 = "john.doe@acme.com";
       boolean result1 = isProfessionalEmail(email1);
       System.out.println(result1);

        String email2 = "jane.smith@gmail.com";
        boolean result2 = isProfessionalEmail(email2);
        System.out.println(result2);

        String email3 = "bob.johnson@hotmail.com";
        boolean result3 = isProfessionalEmail(email3);
        System.out.println(result3);

    }

   public static boolean isProfessionalEmail(String email) {
        if (email.contains("@gmail.com")) {
           return false;
        } else if (email.contains("@yahoo.com")) {
            return false;
        } else if (email.contains("@hotmail.com")) {
            return false;
        } else {
            return true;
       }
    }

}
