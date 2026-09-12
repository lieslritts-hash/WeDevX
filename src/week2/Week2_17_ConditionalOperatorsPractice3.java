package week2;

import java.util.Scanner;

/*
2.17 Conditional Operators Practice 3
Practice and reinforce your understanding of the
conditional & and | operators in Java through a series of
hands-on exercises and challenges in this Conditional & and |
Operators Practice tutorial.
 */

public class Week2_17_ConditionalOperatorsPractice3 {
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
