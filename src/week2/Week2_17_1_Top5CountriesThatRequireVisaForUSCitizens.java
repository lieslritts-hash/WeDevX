package week2;

import java.util.Scanner;

/*
2.17.1 Top 5 countries that require visa for US citizens
easy
|
30 min
|
Share
The top 5 countries that require visas for US citizens are:

China - a visa is required for both tourist and business purposes.

India - a visa is required for all purposes, including tourism, business, and transit.

Russia - a visa is required for all purposes, including tourism, business, and transit.

Brazil - a visa is required for tourism and business purposes.

Vietnam - a visa is required for tourism and business purposes. Write a program that asks the user to input which country they are traveling to and tells if the visa is required or not.

plain
Copy code
____ destinationCountry = ____;
____ isVisaRequired = _____;
If the user is traveling to any of the 5 countries above, the program should print out the following:

plain
Copy code
Which country are you traveling to?
A visa is required for both tourist and business purposes in Y: X
Where Y is the country inputted, and X is a boolean value. Ex:

plain
Copy code
Which country are you traveling to?
A visa is required for both tourist and business purposes in Brazil: true
Ex 2:

plain
Copy code
Which country are you traveling to?
A visa is required for both tourist and business purposes in Mexico: false
 */

public class Week2_17_1_Top5CountriesThatRequireVisaForUSCitizens {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Which country are you traveling to?");
        String destinationCountry = sc.nextLine();

        boolean isVisaRequired =
                destinationCountry.equals("China")
                        || destinationCountry.equals("India")
                        || destinationCountry.equals("Russia")
                        || destinationCountry.equals("Brazil")
                        || destinationCountry.equals("Vietnam");

        System.out.println("A visa is required for both tourist and business purposes in " + destinationCountry + ": " + isVisaRequired);
    }
}
