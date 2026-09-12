package week3;

/*
3.44.4 Job Opportunity Cold Email
easy
|
30 min
|
Share
Your task is to write a static method called sendJobOpportunityAlert() that will take in a String as a parameter representing an email address, and then check if the email is a professional email or not. Professional emails are typically associated with a company or organization, and do not use free email services such as Gmail, Yahoo, Outlook or Hotmail. To check if an email is professional, make sure it doesn't contain hotmail.com, gmail.com, outlook.com or yahoo.com. If the email is a professional email the program should print out Job Alert, $200k/year opportunity, apply now otherwise the program should printout No open positions.

Return Type: void

Example #1:
Parameter:

plain
Copy code
String email = "askar@apple.com"
Output:

plain
Copy code
Job Alert, $200k/year opportunity, apply now
Example #2:
Parameter:

plain
Copy code
String email = "jane.smith@gmail.com"
Output:

plain
Copy code
No open positions
 */
//write your static method here. No need to add Main class or main method.

public class Week3_44_4_JobOpportunityColdEmail {
    public static void main(String[] args) {

        String email1 = "askar@apple.com";
        sendJobOpportunityAlert(email1);

        String email2 = "jane.smith@gmail.com";
        sendJobOpportunityAlert(email2);

    }

    public static void sendJobOpportunityAlert(String email) {
        if (email.contains("gmail.com")) {
            System.out.println("No open positions");
        } else if (email.contains("yahoo.com")) {
            System.out.println("No open positions");
        } else if (email.contains("hotmail.com")) {
            System.out.println("No open positions");
        } else if (email.contains("outlook.com")) {
            System.out.println("No open positions");
        } else {
            System.out.println("Job Alert, $200k/year opportunity, apply now");
        }
    }
}
