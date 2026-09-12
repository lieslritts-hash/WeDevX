package week4;

/*
4.6.1 Print out all characters of a String*
easy
|
30 min
|
Share
Write a static method called splitCharacters() method that takes a String as parameter and prints out each character of that String in a new line using while loop. Use while-loop with String's methods length() and charAt().

Return Type: void

Example #1:
Parameter:

plain
Copy code
String str = "Wedevx"
Output:

plain
Copy code
W
e
d
e
v
x
Example #2:
Parameter:

plain
Copy code
String str = "Hello World"
Output:

plain
Copy code
H
e
l
l
o

W
o
r
l
d
 */

public class Week4_6_1_PrintOutAllCharactersOfAString {
    public static void main(String[] args) {

        splitCharacters("Wedevx\"");
        splitCharacters("Hello World");

    }
    public static void splitCharacters(String str) {

        int counter = 0;

        while (counter <= str.length()-1) {
            System.out.println(str.charAt(counter));
            counter++;
        }
    }
}
