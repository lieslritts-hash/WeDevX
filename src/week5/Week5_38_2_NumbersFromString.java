package week5;

/*
5.38.2 Numbers from string
easy
|
30 min
|
Share
Write a method called parseUniqueDigits() that takes a String.
 The method should iterate through the given string and
 sequentially add the numbers encountered to a new set in
 the order they appear.

Param: String Return: LinkedHashSet

Example:

plain
Copy code
// Returns [123, 456, 789]
parseUniqueDigits("Hello 123 world! This is a test string
456 containing both words and numbers 789.")
:

one number can take more than 1 digit. Check whether the
number is ending on the next coming index or not.

add check for negative numbers as well.

Ex1
Input: I have 20 apples and -50 oranges in my basket. The
temperature outside is 25 degrees Celsius.

Output: [20, -50, 25]

Ex2
Input: The marathon race had participants from over 30
countries. The winning time was 2 hours, 45 minutes, and
10 seconds.

Output: [30, 2, 45, 10]

Ex3
Input: The stock market experienced a drop of 500 points
yesterday. The company reported a profit of $1,250,000 for
the quarter.

Output: [500, 1, 250, 0]
 */
//write your static method here. No need to add Main class or main method.

public class Week5_38_2_NumbersFromString {
    public static void main(String[] args) {

    }
}
