package week2;

import java.util.Scanner;

/*
2.13 Conditional Operators 2
Discover the use of the bitwise logical operators & and
| in Java, how they differ from the logical && and ||
operators, in this comprehensive Conditional & and | Operators
tutorial.
 */

public class Week2_13_ConditionalOperators2 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.println("Do you have life insurance?");
        boolean hasLifeCoverage = input.nextBoolean();

        System.out.println("Do you have auto insurance?");
        boolean hasAutoCoverage = input.nextBoolean();

        System.out.println("Is user eligible for a 20% discount? " + (hasLifeCoverage & hasAutoCoverage));
    }
}
