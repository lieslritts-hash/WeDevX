package week5;

/*
5.13.4 Driving License Test Verifier*
easy
|
30 min
|
Share
Create a static method named verifyLicenseTest() that takes two char arrays
(char[]) as parameters: the first array contains the expected correct answers
for a driving license test, and the second array contains the actual test answers.
To pass the driving license test, a score of 100% is required. Use Arrays.equals() to
compare the provided answers with the correct answers to determine if the test has been passed
successfully. Return the boolean result.

Return Type: boolean

Example #1:
Parameters:

plain
Copy code
char[] expectedAnswers = ['A', 'B', 'C', 'D', 'A']
char[] actualAnswers   = ['A', 'B', 'C', 'D', 'A']
Return:

plain
Copy code
true
Example #2:
Parameters:

plain
Copy code
char[] expectedAnswers = ['A', 'B', 'C', 'D', 'A']
char[] actualAnswers   = ['A', 'B', 'F', 'D', 'A']
Return:

plain
Copy code
false
 */
//write your static method here. No need to add Main class or main method or import anything

import java.util.Arrays;

public class Week5_13_4_DrivingLicenseTestVerifier {
    public static void main(String[] args) {

        char[] expectedAnswers = {'A', 'B', 'C', 'D', 'A'};
        char[] actualAnswers   = {'A', 'B', 'C', 'D', 'A'};
        boolean isVarified = verifyLicenseTest(expectedAnswers, actualAnswers);
        System.out.println(isVarified);

    }

    public static boolean verifyLicenseTest(char[] expectedAnswers, char[] actualAnswers) {

        return Arrays.equals(expectedAnswers, actualAnswers);
    }
}
