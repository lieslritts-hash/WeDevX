package week4;

/*
4.6.3 Double print character x*
easy
|
30 min
|
Share
Write a static method named printStringWithX() that takes a String as input and prints out all the characters in the String. If the character is the letter X, it should be printed twice. The method should use a while loop to iterate through each character of the input String. It should cover both lowercase x and uppercase X.

Return Type: void

Example #1:
Parameters:

plain
Copy code
String sentence = "Xerox"
Output:

plain
Copy code
XXeroxx
Example #2:
Parameters:

plain
Copy code
String sentence = "Extra"
Output:

plain
Copy code
Exxtra
Example #3:
Parameters:

plain
Copy code
String sentence = "Java is eXcellent."
Output:

plain
Copy code
Java is eXXcellent.
 */
// for each loop is used more
// public static void printStringWithX(String input) {
//
//        for(Char c : input.toCharArray()){
//           if(c == 'x' || c == 'X') {
//                System.out.print(c + );
//         } else if (c == 'X') {
//              System.out.print(c + "X");
//         } else {
//              System.out.print(c);
//         }
//    }
//}

public class Week4_6_3_DoublePrintCharacterX {
    public static void main(String[] args) {

        printStringWithX("Xerox");
        printStringWithX("Extra");
        printStringWithX("Java is eXcellent.");
    }

    public static void printStringWithX(String input) {

        int counter = 0;

        while (counter < input.length()) {

            char character = input.charAt(counter);

            if (character == 'x' || character == 'X') {
                System.out.print(character);
                System.out.print(character);
            } else {
                System.out.print(character);
            }

            counter++;
        }

        System.out.println();
    }
}