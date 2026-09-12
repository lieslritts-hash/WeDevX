package week4;

/*
4.41.1 Encode the String (with solution)
easy
|
30 min
|
Share
Description: Write a method called encodeString() that takes a string as
input and replaces all instances of a repeating character with the character
followed by the number of times it repeats. For example, the string
"aaabbcddd" would be encoded as "a3b2cd3". The method should use a
StringBuilder to build the encoded string. Params: String. Return: An
encoded String where repeating characters are replaced with the character
followed by the number of times it repeats. Example: encodeString("aaabbcddd")
// Returns "a3b2cd3" encodeString("Hello world") // Returns "Hel2o world"

Video solution:
https://youtu.be/jjDonkxsJ0w
 */
//write your static method here. No need to add Main class or main method.

// 1. two variables, one for my currentChar and one for my nextChar
// 2. currChar == nextChar, counter++ (counter = 1)
// 3. currChar != nextChar, currChar + (if counter > 1) counter.append to sb, counter = 1

public class Week4_41_1_EncodeTheStringWithSolution {
    public static void main(String[] args) {

        System.out.println(encodeString("aaabbcddd"));
        System.out.println(encodeString("Hello world"));

    }

    public static String encodeString(String input) {

        if (input == null || input.isEmpty()) {
            return "";
        }

        StringBuilder sb = new StringBuilder();

        char currChar = input.charAt(0);

        int counter = 1;

      for (int i = 1; i < input.length(); i++) {

          char nextChar = input.charAt(i);

          if (currChar == nextChar) {
              counter++;
          } else {
              sb.append(currChar);
              if (counter > 1) {
                  sb.append(counter);
              }
              currChar = nextChar;
              counter = 1;
          }
        }
        sb.append(currChar);
        if (counter > 1) {
            sb.append(counter);
        }

      return sb.toString();
    }
}
