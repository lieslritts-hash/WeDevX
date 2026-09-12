package week5;

/*
5.25.1 Count different chars*
easy
|
30 min
|
Share
Write a method called countDigitsAndUppercase() that takes a String as parameter and returns the count of digits and uppercase letters in the string as a string in the format: Digits: X, Uppercase: Y.

Return Type: String

Example #1:
Parameter:

plain
Copy code
String str = "Hello World 123"
Return:

plain
Copy code
Digits: 3, Uppercase: 2
Example #2:
Parameter:

plain
Copy code
String str = "AbCdEfGhIjKlM"
Return:

plain
Copy code
Digits: 0, Uppercase: 7
Example #3:
Parameter:

plain
Copy code
String str = "Testing 123"
Return:

plain
Copy code
Digits: 3, Uppercase: 1
Hints
Initialize two variables, digitCount and uppercaseCount, to keep track of the count
of digits and uppercase letters, respectively.

Iterate through each character in the given string.

Check each character to determine if it is a digit or an uppercase letter:

To determine if a character is an uppercase letter, compare it with its uppercase
equivalent using Character.toUpperCase(ch). Compare this manipulated character with the
default character.

For digits, you can check it using Character.isDigit(ch).

If the character is a digit, increment the digitCount variable.

If the character is an uppercase letter, increment the uppercaseCount variable.

After iterating through the entire string, construct a formatted string containing the
counts of digits and uppercase letters.

Example of if-else-if statement:
plain
Copy code
if (Character.isDigit(ch)) {
    digitCount++;
} else if (Character.isUpperCase(ch)) {
    uppercaseCount++;
}
 */
//write your static method here. No need to add Main class or main method.

public class Week5_25_1_CountDifferentChars {
    public static void main(String[] args) {

    }
}
