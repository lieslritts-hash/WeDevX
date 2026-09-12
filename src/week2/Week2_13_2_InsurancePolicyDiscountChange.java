package week2;

import java.util.Scanner;

/*
2.13.2 Insurance Policy Discount Change*
easy
|
30 min
|
Share
After reviewing the pricing models. The Progressive Insurance
Company decided that it wants to give a 20% discount when users
 have at least one of the coverages, either life or auto or both.
  Write a program that asks the user to answer true or false to
  the following questions: Do you have life insurance? Do you
   have auto insurance?

plain
Copy code
____ hasLifeCoverage = ____;
____ hasAutoCoverage = ____;
If the user has at least one of the coverages, either life or auto or both. , they are eligible for a 20% discount. The program should print out the following:

plain
Copy code
Do you have life insurance?
Do you have auto insurance?
Is user eligible for a 20% discount? X
Where X is a boolean. It should be true if either hasLifeCoverage or
hasAutoCoverage is true or both are true. Otherwise false.
 */

public class Week2_13_2_InsurancePolicyDiscountChange {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        boolean hasLifeCoverage = input.nextBoolean();
        System.out.println("Do you have life insurance? ");

        boolean hasAutoCoverage = input.nextBoolean();
        System.out.println("Do you have auto insurance? ");

        System.out.println("Is user eligible for a 20% discount? " + (hasLifeCoverage | hasAutoCoverage));
    }
}
