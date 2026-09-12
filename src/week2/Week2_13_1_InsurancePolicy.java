package week2;

import java.util.Scanner;

/*
2.13.1 Insurance Policy*
easy
|
30 min
|
Share
Write a program that asks the user to answer true or false
to the following questions: Do you have life insurance? Do
you have auto insurance?

plain
Copy code
____ hasLifeCoverage = ____;
____ hasAutoCoverage = ____;
If the user has both life and auto insurance, they are
eligible for a 20% discount. The program should print out
the following:

plain
Copy code
Do you have life insurance?
Do you have auto insurance?
Is user eligible for a 20% discount? X
Where X is a boolean. It should be true if both hasLifeCoverage
and hasAutoCoverage are true. Otherwise false.
 */

public class Week2_13_1_InsurancePolicy {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.println("Do you have life insurance?");
        boolean hasLifeCoverage = input.nextBoolean();

        System.out.println("Do you have auto insurance?");
        boolean hasAutoCoverage = input.nextBoolean();

        System.out.println("Is user eligible for a 20% discount? " + (hasLifeCoverage & hasAutoCoverage));
    }
}
