package week4;

/*
4.40.2 Reverse chunks
easy
|
30 min
|
Share
Note: This exercise has a HARD level of difficulty, requires a lot of time and is optional to complete. You can also find an example of solution at the bottom of the page with a detailed description of each action. Write a method called reverseStringByChunks() that takes a String and an int as parameters and returns the reversed version of the String, in chunks of the given size, separated by a space character. For example, given the input string Hello world! and the integer 3, the method should return the string "leH ol row !dl". Here's how the method should work:

The input string may contain any number of characters.

The integer specifies the size of each chunk in the reversed string. For example, if the input string is Hello world! and the int is 3, the reversed string should contain chunks of 3 characters each: "leH", " ol", "row, "!dl". The chunks should be in the order they appear in the original string, but with the characters in each chunk reversed.

If the integer is less than or equal to 0, the method should return the original string without any reversal.

You should use only the methods provided by StringBuilder to reverse the characters in the input string. You are not allowed to use any other data structures, such as collections or arrays.

Return Type: String

Example #1:
Parameters:

plain
Copy code
String sentence = "Hello world!"
int chunkSize = 3
Output:

plain
Copy code
leH  ol row !dl
Example #2:
Parameters:

plain
Copy code
String sentence = "1234567890"
int chunkSize = 4
Output:

plain
Copy code
4321 8765 09
Example of solution
java
Copy code
public static String reverseStringByChunks(String input, int chunkSize) {
    // Check if the chunkSize is valid (greater than 0)
    if (chunkSize <= 0) return input; // If not, return the original input

    // Initialize a StringBuilder for the result
    StringBuilder result = new StringBuilder("");
    // Initialize a StringBuilder to store each chunk
    StringBuilder chunk = new StringBuilder("");

    for (int i = 0; i < input.length(); i++) {
        // Get the character at position i
        char c = input.charAt(i);
        // Append the character to the chunk
        chunk.append(c);

        // Check if the chunk size has been reached
        if (chunk.length() == chunkSize) {
            // Reverse the chunk and append it to the result
            result.append(chunk.reverse());
            // Add a space as a separator
            result.append(" ");
            // Clear the chunk for the next iteration
            chunk.delete(0, chunk.length());
        }
    }

    // Check if there's any remaining characters in the chunk
    if (chunk.length() > 0) {
        // Reverse and append the remaining chunk to the result
        result.append(chunk.reverse());
    }
    // Return the final result as a string
    return result.toString();
}
 */
//write your static method here. No need to add Main class or main method.

public class Week4_40_2_ReverseChunks {
    public static void main(String[] args) {

        System.out.println(reverseStringByChunks("Hello world!", 3));

    }
    public static String reverseStringByChunks(String input, int chunkSize) {
        // Check if the chunkSize is valid (greater than 0)
        if (chunkSize <= 0) return input; // If not, return the original input

        // Initialize a StringBuilder for the result
        StringBuilder result = new StringBuilder("");
        // Initialize a StringBuilder to store each chunk
        StringBuilder chunk = new StringBuilder("");

        for (int i = 0; i < input.length(); i++) {
            // Get the character at position i
            char c = input.charAt(i);
            // Append the character to the chunk
            chunk.append(c);

            // Check if the chunk size has been reached
            if (chunk.length() == chunkSize) {
                // Reverse the chunk and append it to the result
                result.append(chunk.reverse());
                // Add a space as a separator
                result.append(" ");
                // Clear the chunk for the next iteration
                chunk.delete(0, chunk.length());
            }
        }

        // Check if there's any remaining characters in the chunk
        if (chunk.length() > 0) {
            // Reverse and append the remaining chunk to the result
            result.append(chunk.reverse());
        }
        // Return the final result as a string
        return result.toString();
    }
}
