package week5;
/*
5.25 Character Class Method
1. Overview
Hello superstars! Welcome back to another session! In this
session, we gonna learn about Character class methods.
This is the last class about Wrapper class.

. Character class methods
The Character class offers a number of useful class (i.e.,
static) methods for manipulating characters. They are the
folllowing: 1. boolean isLetter(char ch): This method is
used to determine whether the specified char value(ch) is a
letter or not. Returns true/false. 2. boolean isDigit(char ch):
This method is used to determine whether the specified char
value(ch) is a digit or not. Here also we can pass ASCII value
as an argument. Returns true/false. 3. boolean isWhitespace(char ch):
It determines whether the specified char value(ch) is white space.
Whitespace includes space, tab, or newline. Returns true/false.
4. char toUpperCase(char ch): It returns the uppercase of the specified
char value(ch). 5. char toLowerCase(char ch): It returns the lowercase of
the specified char value(ch). 6. toString(char ch): It returns a String class object representing the specified character value(ch) i.e a one-character string. Here we cannot pass ASCII value. Let's see an example with above methods. Example 1

java
Copy code
public static void main(String[] args) {

    char a = 'b';
    char b = '2';

    char space = ' ';
    char upperCase = 'P';

    System.out.println(Character.isLetter(a));
    System.out.println(Character.isLetter(b));

    System.out.println(Character.isDigit(a));
    System.out.println(Character.isDigit(b));

    System.out.println(Character.isWhitespace(space));
    System.out.println(Character.isWhitespace(a));

    System.out.println(Character.toLowerCase(upperCase));
    System.out.println(Character.toUpperCase(upperCase));
    System.out.println(Character.toUpperCase(a));

}
plain
Copy code
Output is:
true
false
false
true
true
false
p
P
B
##### **3\. Conclusion**
I hope today's class was helpful. See you guys in the next class! Keep working hard!
 */
//write your static method here. No need to add Main class or main method.

public class Week5_25_CharacterClassMethod {
    public static void main(String[] args) {

    }
}
