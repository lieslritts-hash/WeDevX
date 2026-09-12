package week5;

/*
5.40.2 Sorting the string (with solution)
easy
|
30 min
|
Share
Description: Write a method called sortCharacters() that takes a
String as input. The method should iterate through the characters in
the string and perform specific operations based on the character type.
The operations are as follows:

If the character is an uppercase letter, add it to a set of uppercase letters.

If the character is a lowercase letter, add it to a set of lowercase letters.

If the character is a digit, add it to a set of numbers.

If the character is a special character, add it to a set of characters (skip spaces).

If the character is a '*', return an empty set and stop the method execution.

After performing the operations, create a new set and include all the above in it
(make sure to have the final set in such order: uppercase letters, lowercase letters,
numbers, and special characters). Finally, check if the sum of all the numbers is even or odd:

If the sum of all digits is odd, return the final set.

If the sum of all digits is even, retrieve the length of the final set and return it inside a new set.

Params: A String input. Return: A sorted Set based on the operations performed or a set containing
the final length if the sum of numbers is even as a String. Example: sortCharacters("This is the test string")
// Returns [T, e, g, h, i, n, r, s, t] sortCharacters("The quick brown fox jumps over the lazy *dog")
// Returns [] sortCharacters("We have had many views on our webinar. To be exact we had 1593")
// Returns [25] (since the sum of numbers is even, it returns the length of
[T, W, a, b, c, d, e, h, i, m, n, o, r, s, t, u, v, w, x, y, 1, 3, 5, 9, .])
sortCharacters("We have had many views on our webinar. To be exact we had 1594")
// Returns [T, W, a, b, c, d, e, h, i, m, n, o, r, s, t, u, v, w, x, y, 1, 4, 5, 9, .] Note:

The comparison for sorting should be case-sensitive, meaning uppercase letters come before lowercase letters.

The order of the characters within each category should be maintained based on their appearance in the input string.

The special character '*' should cause an immediate return of an empty set.

If the sum of the numbers is even, the final result should be a set containing the
length of the processed set after all operations.

Use TreeSet to sort group of characters and LinkedHashSet for final result.

Ex1
Input: Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt
9876543210 ut labore et dolore magna aliqua.

Output: [L, a, b, c, d, e, g, i, l, m, n, o, p, q, r, s, t, u, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, ,, .]

Ex2
Input: This is a random string with numbers 123 and some special characters !@#$%^&*

Output: []

Video solution:
https://youtu.be/iVD1m2UyWuU
 */
//write your static method here. No need to add Main class or main method.

public class Week5_40_2_SortingTheString {
    public static void main(String[] args) {

    }
}
