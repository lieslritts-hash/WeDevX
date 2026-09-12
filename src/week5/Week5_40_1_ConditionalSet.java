package week5;

/*
5.40.1 Conditional set
easy
|
30 min
|
Share
Write a method called addUniqueChars() that takes a String
as parameter. The method should iterate through the characters
in the string and add unique characters to a set until it encounters
a special character. If the special character is found, the method should
return an empty set (LinkedHashSet). If the string contains any numerical
characters, the method should return a set (LinkedHashSet) containing the
string 0 (zero).

Return Type: void

Example #1:
Parameter:

plain
Copy code
String str = "Hello, world!"
Return:

plain
Copy code
[]
Example #2:
Parameter:

plain
Copy code
String str = "Abc12345"
Return:

plain
Copy code
["0"]
Example #3:
Parameter:

plain
Copy code
String str = "Wedevx"
Return:

plain
Copy code
["W", "e", "d", "v", "x"]
:

The comparison for uniqueness should be case-sensitive,
meaning "a" and "A" are considered different characters.

The order of the characters in the set should be preserved
based on their appearance in the input string.

If the input string is empty, the method should return an empty set.

Skip spaces.

To initialize an empty LinkedHashSet, use next command: LinkedHashSet
uniqueChars = new LinkedHashSet<>();

Ex1
Input:

plain
Copy code
The quick brown fox jumps over the lazy dog
Output:

plain
Copy code
[T, h, e, q, u, i, c, k, b, r, o, w, n, f, x, j, m, p, s, v, t, l, a, z, y, d, g]
Ex1
Input:

plain
Copy code
Next appointment will be on 4th of September
Output:

plain
Copy code
[0]
Ex3
Input:

plain
Copy code
Please don't be late next time
Output:

plain
Copy code
[]
 */
//write your static method here. No need to add Main class or main method.


public class Week5_40_1_ConditionalSet {
    public static void main(String[] args) {

    }
}
