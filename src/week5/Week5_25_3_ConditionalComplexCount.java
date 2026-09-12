package week5;

/*
5.25.3 Conditional complex count
easy
|
30 min
|
Share
Exercise Description: Write a method called uniqueCharactersCount()
that takes a String word and String type as a parameter. The method should
count the number of letters (ignoring case) or format unique digits inside the
string and return the result in a specific format depending on the type parameter:

If the type parameter is a letter, count the number of separate letters
(ignoring case), and return the result as an array where each letter is followed by the
number of its appearance.

If the type parameter is a digit, return unique digits in an array followed by the starting
character of its pronunciation.

If the type parameter is none of the above or the word parameter is empty, return an empty array.

Return is String[]

Example #1:

plain
Copy code
uniqueCharactersCount("This 145 st6or777y is 897boring.", "letter")
Return:

plain
Copy code
["t2", "h1", "i3", "s3", "o2", "r2", "y1", "b1", "n1", "g1"]
Example #2:

plain
Copy code
uniqueCharactersCount("111-666-314-123 sequence", "digit")
Return:

plain
Copy code
["1o", "6s", "3t", "4f", "2t"]
Example #3:

plain
Copy code
uniqueCharactersCount("My card iss 5413 1231 6432 1666", "Digit")
Return:

plain
Copy code
[]
Hints:
Utilize a StringBuilder to construct a unique count of characters or digits.
You can check if the character or digit has already been encountered by using
the indexOf method of StringBuilder. This method returns the index of the first
occurrence of the specified character, or -1 if the character is not found.
By checking if the result is -1, you can determine if the character is unique
and should be appended to the StringBuilder. Additionally, to separate elements
in the result array, you can use a comma (,). After constructing the StringBuilder,
you can convert it to an array using the split() method, splitting on the comma.
This approach allows you to achieve the desired output format efficiently.
 */
//write your static method here. No need to add Main class or main method.

public class Week5_25_3_ConditionalComplexCount {
    public static void main(String[] args) {

    }
}
