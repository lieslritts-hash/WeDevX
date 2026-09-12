package week1;

/*
1.21.2 Apple's Marketing Campaign*
easy
|
30 min
|
Share
In this exercise, you will write a Java program that
uses String variables and escape characters (\t and \n)
to describe Apple's most successful marketing campaign.
Requirements:

Declare a String variable companyName and initialize it
with "Apple".

Declare a String variable campaign and initialize it with
"Think Different".

Declare a String variable slogan and initialize it with
"Here's to the crazy ones. The misfits. The rebels. The
troublemakers. The round pegs in the square holes. The
ones who see things differently.".

Write a program to print the description of the campaign
to the console, using escape characters \t and \n to format
the output.

Expected output:

plain
Copy code
Company name: Apple
Campaign: Think Different
Slogan:
Here's to the crazy ones.
The misfits.
The rebels.
The troublemakers.
The round pegs in the square holes.
The ones who see things differently.
 */

public class Week1_21_2_ApplesMarketingCampaign {
    public static void main(String[] args) {
        String companyName = "Apple";
        String campaign = "Think Different";
        String slogan = "\nHere's to the crazy ones.\nThe misfits.\nThe rebels.\nThe troublemakers.\nThe round pegs in the square holes.\nThe ones who see things differently.";

        String campaignDescription = "Company name:\t" + companyName + "\nCampaign:\t" + campaign + "\nSlogan: " + slogan ;
        System.out.println(campaignDescription);
    }
}

