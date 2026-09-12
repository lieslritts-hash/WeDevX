package week4;

/*
4.41.4 Encode the String: even chars
easy
|
30 min
|
Share
Exercise Description: Write a method called evenEncodeString() that takes a string
as input and encodes characters only if they appear in even numbers. For characters
that appear in odd numbers, they should remain unchanged in the encoded string. The method
should replace all instances of a repeating character with the character followed by the number of
times it repeats, but only if the character appears an even number of times in the input string. For example,
the string "aaabbcddd" would be encoded as "ab2cd" because 'a' appears three times (odd number), 'b' appears twice
(even number), 'c' appears once (odd number), and 'd' appears three times (odd number). The method should use a
StringBuilder to build the encoded string. Params: String. Return: An encoded String where repeating characters
appearing in even numbers are replaced with the character followed by the number of times it repeats. Example:
evenEncodeString("aaabbcddd") // Returns "ab2cd" evenEncodeString("aaaabbbcccdddd") // Returns "a4bcd4"
 */
//write your static method here. No need to add Main class or main method.

public class Week4_41_4_EncodeTheStringEvenChars {
    public static void main(String[] args) {

        System.out.println(evenEncodeString("aaabbcddd"));
        System.out.println(evenEncodeString("aaaabbbcccdddd"));

    }

    public static String evenEncodeString(String str) {

        StringBuilder sb = new StringBuilder(str);
        StringBuilder result = new StringBuilder();

        int i = 0;

        while (i < sb.length()) {

            char current = sb.charAt(i);
            int count = 0;

            while (i < sb.length() && sb.charAt(i) == current) {
                count++;
                i++;
            }

            result.append(current);

            if (count % 2 == 0 && count > 1) {
                result.append(count);
            }
        }

        return result.toString();
    }
}